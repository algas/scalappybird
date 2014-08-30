BT のインストール

Scala 開発を行うために以下をインストールします。

1. JDK (Java Development Kit)
2. SBT (Simple Build Tool)

## Windows

### JDK のインストール

1. Webブラウザで以下にアクセスする。  
http://www.oracle.com/technetwork/java/javase/downloads/index.html
2. JDK　の下の "Download" をクリックする。  
3. "Accept License Agreement" にチェックを入れて、Windows x64 の .exe をダウンロードする。  
もし 32bit OS を使っている場合には、x86 の方を使う。
4. ダウンロードしてきたインストーラを起動し、jdk をインストールする。

### SBT のインストール

1. Webブラウザで以下にアクセスする。  
http://www.scala-sbt.org/release/docs/Getting-Started/Setup.html
2. sbt 0.13.1 のインストーラをダウンロードする。  
sbt.msi
3. ダウンロードしてきたインストーラを起動し、sbt をインストールする。

## Mac OS X 

Mac では sbt-extras を使ってインストールを行います。

#### brew installでsbtを入れてしまった場合

brew installで入れてしまった場合、初期設定が腐っているので、コンパイル時にメモリ不足の例外が発生してしまいます。
その場合は次の環境変数を設定すると大丈夫です。

    SBT_OPTS="-Xms512M -Xmx2G -Xss1M -XX:+CMSClassUnloadingEnabled -XX:MaxPermSize=512M"
    



### JDK のインストール

1. Webブラウザで以下にアクセスする。  
http://www.oracle.com/technetwork/java/javase/downloads/index.html
2. JDK　の下の "Download" をクリックする。  
3. "Accept License Agreement" にチェックを入れて、Mac OS X x64 の .dmg をダウンロードする。
4. ダウンロードしてきた .dmg をクリック(マウント)して表示される .pkg をダブルクリックして jdk をインストールする。

### SBT のインストール

1. ターミナルから以下のコマンドを実行する。  
```
curl -s https://raw.githubusercontent.com/paulp/sbt-extras/master/sbt > ~/bin/sbt && chmod 0755 ~/bin/sbt
```

## 注意点

* 環境変数の設定  
JAVA_HOME, SBT_HOME, PATH
* 参考資料  
http://scalajp.github.io/sbt-getting-started-guide-ja/setup/

