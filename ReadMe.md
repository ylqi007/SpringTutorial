# Spring6Tutorial
`Spring6Tutorial`作为父工程，删除`src/`，只保留`pom.xml`。

在Spring6Tutorial中添加第一个子module `SpringFirst`，在`Spring6Tutorial/pom.xml`中会显示添加了
```xml
<packaging>pom</packaging>
<modules>
    <module>SpringFirst</module>
</modules>
```

## SpringFirst
入门案例开发步骤
1. 引入Spring相关依赖，为了方便测试，同时引入JUnit依赖
    ```xml
    <dependencies>
    <!-- 添加spring-context依赖
    引入spring-context依赖，表示将引入Spring的基础依赖。
    -->
    <!-- https://mvnrepository.com/artifact/org.springframework/spring-context -->
    <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-context</artifactId>
        <version>6.0.11</version>
    </dependency>
    
    <!-- 为了测试方便，引入JUnit -->
    <!-- https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-api -->
    <dependency>
        <groupId>org.junit.jupiter</groupId>
        <artifactId>junit-jupiter-api</artifactId>
        <version>5.9.3</version>
        <!-- <scope>test</scope> 表示只能在test的时候用。删除以便在编写代码时也能用 -->
    </dependency>
    ```
   添加依赖后，刷新Maven (Reload All Maven Projects)，下载依赖。
2. 创建类，定义属性和方法  
创建`com.atguigu.spring6.User`
3. 按照Spring要求创建配置文件(xml格式)   
   创建`SpringFirst/src/main/resources/bean.xml`文件
4. 在Spring配置文件中添加相关配置  
   在`SpringFirst/src/main/resources/bean.xml`文件中添加User bean
    ```xml
    <bean id="user" class="com.atguigu.spring6.User"/>
    ```
5. 进行测试
