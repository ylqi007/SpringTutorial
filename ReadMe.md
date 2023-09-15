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
### 1. 入门案例开发步骤
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


### 2. 入门案例程序分析
#### 2.1 通过反射创建对象
在案例中，并不是通过new创建对象，而是通过反射机制创建User对象。

#### 2.2 如何通过反射创建对象？
1. 加载bean.xml文件
2. 对xml文件进行解析 (dom4j解析xml文件，从而获得class的属性值和类的全名称)
3. 获取xml文件中bean标签的属性，本例子中的id & class
4. 使用反射，根据类的全路径创建对象

Sample: `test/java/com.atguigu.spring6.UserTest.testCreateUserObjectByReflection()`

#### 2.3 创建的对象是如何存储的？
bean对象最终存储在spring容器中，在spring源码底层就是一个map集合，存储bean的map在`DefaultListableBeanFactory`类中：

```java
private final Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>(256);
```

Spring容器加载到Bean类时 , 会把这个类的描述信息, 以包名加类名的方式存到beanDefinitionMap中,
`Map<String,BeanDefinition>`
* 其中`String`是Key, 默认是类名首字母小写;
* `BeanDefinition`, 存的是类的定义(描述信息),我们通常叫BeanDefinition接口为:bean的定义对象。


### 3. 启用`Log4j2`日志框架 + 使用Lombok
#### 3.1 添加Log4j2依赖
```xml
<!-- https://mvnrepository.com/artifact/org.apache.logging.log4j/log4j-core -->
<dependency>
    <groupId>org.apache.logging.log4j</groupId>
    <artifactId>log4j-core</artifactId>
    <version>2.20.0</version>
</dependency>
<!-- https://mvnrepository.com/artifact/org.apache.logging.log4j/log4j-slf4j2-impl -->
<dependency>
    <groupId>org.apache.logging.log4j</groupId>
    <artifactId>log4j-slf4j2-impl</artifactId>
    <version>2.20.0</version>
    <scope>test</scope>
</dependency>
```

#### 3.2 添加Lombok依赖
```xml
<!-- https://mvnrepository.com/artifact/org.projectlombok/lombok -->
<dependency>
   <groupId>org.projectlombok</groupId>
   <artifactId>lombok</artifactId>
   <version>1.18.28</version>
   <scope>provided</scope>
</dependency>
```

## Reference
* https://docs.spring.io/spring-framework/reference/
* https://projectlombok.org/