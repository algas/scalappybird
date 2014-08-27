package com.geishatokyo.scalappybird

import android.content.Context
import android.content.res.Resources
import android.view.SurfaceHolder
import android.graphics.{Canvas, Paint, Rect, Path, Bitmap, BitmapFactory}


case class Point(var x: Int, var y: Int)

class Bird(p: Point) {
  var point:Point = p
  var speed:Int = 10
  val upOffset:Int = -200
  var enable:Boolean = true

  def fall() {
    if (enable){
      this.point.y = this.point.y + this.speed
    }
  }
}


class MainThread(holder: SurfaceHolder, context: Context) extends Thread {
  val ctx = context
  var bird = new Bird(new Point(100,0))

  val bluishWhite = new Paint
  bluishWhite.setARGB(255, 255, 255, 255)
  val bluishBlack = new Paint
  bluishBlack.setARGB(255, 0, 0, 0)
  var canvasWidth: Int = _
  var canvasHeight: Int = _

  override def run {
    val quantum = 100
    var isRunning: Boolean = true
    while (isRunning) {
      val t0 = System.currentTimeMillis
      game()
      val t1 = System.currentTimeMillis
      if (t1 - t0 < quantum) Thread.sleep(quantum - (t1 - t0))
    }
  }

  def game() {
      action()
      drawViews()
  }

  def drawViews() {
    withCanvas { g =>
      g drawRect (0, 0, canvasWidth, canvasHeight, bluishWhite)
      drawInfo(g)
      drawBird(g)
    }
  }

  def setCanvasSize(w: Int, h: Int) {
    canvasWidth = w
    canvasHeight = h
  }

  def addTouch(x: Int, y: Int){
    touchEvent(x, y)
  }

  def touchEvent(x: Int, y: Int){
    if (this.bird.enable){
      this.bird.point.y = this.bird.point.y + this.bird.upOffset
    }
  }

  def withCanvas(f: Canvas => Unit) {
    val canvas = holder.lockCanvas(null)
    try {
      f(canvas)
    } finally {
      holder.unlockCanvasAndPost(canvas)
    }
  }

  def drawInfo(g: Canvas) {
    val textPaint = new Paint
    textPaint.setARGB(255, 0, 0, 0)
    textPaint.setTextSize(48)
    g drawText ("Scalappy Bird", 250, 100, textPaint)
    if (this.bird.point.y >= canvasHeight) {
      val gamePaint = new Paint
      gamePaint.setARGB(255, 255, 0, 0)
      gamePaint.setTextSize(64)
      g drawText ("Game End", 250, canvasHeight/2-32, gamePaint)
      this.bird.enable = false
    }
  }

  def drawBird(g: Canvas) {
    val p = new Paint
    val res:Resources = this.ctx.getResources
    val img = BitmapFactory.decodeResource(res, R.drawable.bird)
    if (this.bird.enable){
     g drawBitmap(img, this.bird.point.x, this.bird.point.y, p)
    }
  }

  def action() {
    this.bird.fall    
  }

}