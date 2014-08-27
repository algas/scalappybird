# ハンズオン勉強会の課題

## 概要

課題用のサンプルアプリは SclappyBird の未完成版です。  
このゲームを完成させることが、今回のハンズオン勉強会の課題です。  
課題には基本課題と演習課題の2つがあります。  
もし基本課題が時間内に終わった場合には、演習課題にも挑戦してみてください。

## 実装されている機能

サンプルアプリには以下の機能が実装されています。
* 画面をタップするとキャラが上昇する
* キャラが時間とともに下降する
* 画面下にぶつかるとゲームオーバーになる

### 基本課題

1. 得点表示  
時間とともに得点が加算されていく
2. リセットボタン  
押すとゲームをやり直せる
3. 重力加速度  
線形落下ではなくて一定の加速度で自然に落下するように変更する

#### 演習課題

1. 背景のスクロール
横スクロールアクションの見栄えを上げるために背景を左へ流して右へ進んでいるように見せる
2. 障害物の設置
ゲームの複雑度を上げるために障害物を設置する
3. アイテムの設置
特定のアイテムの取得によって得点が増えたりするゲーム性をつける

## ソースコードの構成

今回の課題に必要なのは MainThread.scala のみであり、他のファイルを編集する必要はおそらくありません。  
(src/main/scala/com/geishatokyo/scalappybird/MainThread.scala)

### ビルド設定

* build.sbt: ビルドの設定
* project/build.properties: sbt のバージョン
* project/android.sbt: 依存しているプラグイン

### リソース

* src/main/AndroidManifest.xml: アプリの設定
* src/main/res/layout/main.xml: アプリのレイアウト設定
* src/main/res/values/strings.xml: 文字列リソース
* src/main/res/drawable/bird.png: キャラ画像

### ソース

* src/main/scala/com/geishatokyo/scalappybird/MainThread.scala: ゲーム内の処理
* src/main/scala/com/geishatokyo/scalappybird/MainActivity.scala: アクティビティ(表示遷移)
* src/main/scala/com/geishatokyo/scalappybird/MainView.scala: ビュー(画面)の制御処理

## 参考資料

* [Scala reference](http://www.scala-lang.org/api/current/)
* [Android reference](http://developer.android.com/reference/packages.html)
* [Scala で書く tetrix](http://eed3si9n.com/tetrix-in-scala/ja/index.html)

