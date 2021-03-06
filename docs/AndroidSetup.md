# Android Setup

Android アプリケーション開発のための環境構築を以下の手順で行います。

1. Android SDK のインストール
2. Android SDK の更新
3. Android Virtual Device (AVD) の作成
4. Android エミュレータの起動

## Android SDK のインストール

### Windows

以下の手順で Android SDK をインストールします。

1. 以下のサイトにブラウザでアクセスする。
http://developer.android.com/sdk/index.html
2. Download for other platforms を選択する。
3. SDK Tools Only の Windows の項目にある "installer_r**-windows.exe" をダウンロードする。
4. ダウンロードしたインストーラを実行して、その指示に従ってインストールを完了する。
5. 環境変数で ANDROID_HOME を設定する。
ANDROID_HOME=C:\Users\ (USER_NAME) \AppData\Local\Android\android-sdk

### Mac OS X

1. 以下のコマンドで Android SDK をインストールします。
```
brew install android-sdk
```
2. 環境変数で ANDROID_HOME を設定する。
ANDROID_HOME=/usr/local/Cellar/android-sdk/(version)/

### Linux

1. 以下のサイトにブラウザでアクセスする。
http://developer.android.com/sdk/index.html
2. Linux版のADT Bundleをダウンロードする。
3. zip解凍し、適当なディレクトリに置く。
4. bashrc等に以下の環境変数を設定する。

```
export PATH=$PATH:$HOME/ (DIR) /adt-bundle-linux-x86_64-20140321/sdk/tools/
export ANDROID_HOME=$HOME/ (DIR) /adt-bundle-linux-x86_64-20140321/sdk/
```

## Android SDK の更新

以下の手順で Android SDK パッケージを更新します。

1. (Android SDK Tools) SDK Manager を起動する。
    - Windows ではスタートメニューから探す。
    - Mac/Linux では android コマンドで起動する。
2. 以下にチェックを入れる。
    - Tools 以下の Android SDK Tools, Android SDK Platform-tools, Android SDK Build-tools
    - Android 4.4.2 (API 19) 以下の SDK Platform, ARM EABI v7a System Image
    - Extras 以下の Android Support Library
3. Install * Packages をクリックしてインストールする。


## Android Virtual Device (AVD) の作成

以下の手順で AVD を作成します。

1. (Android SDK Tools) AVD Manager を起動する。
    - Windows ではスタートメニューから探す。
    - Mac では SDK Manager > Tool から起動する。
    - Linux では android avd コマンドで起動する。
2. Device Definitions タブから適当な Device を選択する。例えば Nexus 7(2012)。
3. Create AVD をクリックすると Create new Android Virtual Device (AVD) 画面が出る。
4. 以下のように選択する。
    - AVD Name: 適切な名前をつける
    - Device: 上記で選んだデバイス
    - Target: Android 4.4.2 - API Level 19
    - CPU/ABI: ARM (armeabi-v7a)
    - Skin: Skin with dynamic hardware controls
    - Memory Options: RAM: 512 (Windows のみ)
5. "OK" をクリックすると Android Virtual Devices に追加される。


## Android エミュレータの起動

以下の手順で Android エミュレータを起動します。

1. (Android SDK Tools) AVD Manager を起動する。
2. Android Virtual Devices から起動したい AVD を選択して Start をクリックする。
3. エミュレータウィンドウが開いてしばらく待つと Android の初期画面が表示されます。

## JDKのインストール

JDKの7以下のバージョンが必要です。Java8しか無い方は別途Java7をインストールし、JAVA_HOMEにインストール先のディレクトリを指定します。

### Macの場合

Macは標準でJava6がインストールされているので、それを使うことができます。

```
export JAVA_HOME=/System/Library/Java/JavaVirtualMachines/1.6.0.jdk/Contents/Home
```
