# プロジェクトのルートディレクトリに移動
cd /Users/Ayane/Desktop/programs/java/20250220/TextAdventureGame

# ソースファイルをコンパイル（src内の全Javaファイル）
javac -d . src/*.java

# MANIFEST.MF (上記の内容をプロジェクト直下に作成)

# すべての.classファイルを含む jar ファイルを作成
jar cfm game.jar MANIFEST.MF $(find . -name "*.class")

# jar ファイルを実行
java -jar game.jar
