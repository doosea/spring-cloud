# SpringCloud 学习笔记
## 1. maven 父子项目
1. 父工程配置
    1. new project, maven,父工程name
    2. 字符编码， setting, editor file encoding
    3. 注解生效激活
    4. java 编译选择 1.8 
    5. file type 文件过滤
    6. 删掉父工程下的src, 只保留一个pom.xml
    7. 父工程的pom.xml packing 设置为
        - <packaging>pom</packaging>
    8. maven 中的 dependencyManagement 
        - 定义jar版本， 后面子项目需要jar包，还要子项目中引入
2. 微服务子模块的建立
    1. 建立module 
    2. 改pom
    3. 写yml
    4. 主启动    
    5. 业务类
    