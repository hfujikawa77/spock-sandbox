[Usage]
1. mavenで実行
  mvn clean test
  -> target/surefire-reports 配下にテスト結果(JUnit互換形式)が出力される

2. Eclipseで実行
1) Groovy-Eclipseプラグイン導入 (初回のみ)
  手順 -> https://github.com/groovy/groovy-eclipse/wiki
2) テスト実行
  src/test/groovy/a.b.c を右クリック > 実行 > JUnitテスト

※ 意図的にテスト失敗するケースとしています

[Other tips]
1. Eclipse上で既存プロジェクトをGroovyプロジェクトに変換 …プロジェクト右クリック > 構成 > Groovyプロジェクト に変換
2. Eclipse上でSpec新規作成 …新規 > Groovyクラス

[More info]
1.
http://spockframework.org/

1. Spock example @Github
https://github.com/spockframework/spock-example

2. Spock紹介スライド @Slideshare
https://www.slideshare.net/bikisuke/spocks-world
https://www.slideshare.net/touchezdubois/introduction-to-spock

以上