## maven开发原型

### 使用方法
1. 下载代码；
2. 执行 mvn install 生成仓库依赖包；
3. 在idea中创建项目时，选择 create from archetype，然后点击右侧 Add Archetype，添加原型文件；
4. 选择添加的原型文件继续下一步创建；


### 制作方法
1. 创建一个完整的maven项目，然后删除其他不需要的文件(一般只保留src目录和pom.xml文件)；
2. 执行 mvn -s "c:\xxx\apache-maven-x.x.x\conf\settings.xml" archetype:create-from-project 生成原型目录；
3. 切换到 target/generated-sourced/archetype 目录，执行 mvn -s "c:\xxx\apache-maven-x.x.x\conf\settings.xml" install 生成仓库依赖包；
