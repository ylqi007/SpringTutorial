package com.atguigu.spring6;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Log4j2
public class UserTest {

    /**
     * /Users/ylqi007/Library/Java/JavaVirtualMachines/corretto-17.0.8.1/Contents/Home/bin/java -ea -Didea.test.cyclic.buffer.size=1048576 -javaagent:/Users/ylqi007/Library/Application Support/JetBrains/Toolbox/apps/IDEA-U/ch-0/231.9161.38/IntelliJ IDEA.app/Contents/lib/idea_rt.jar=53070:/Users/ylqi007/Library/Application Support/JetBrains/Toolbox/apps/IDEA-U/ch-0/231.9161.38/IntelliJ IDEA.app/Contents/bin -Dfile.encoding=UTF-8 -classpath /Users/ylqi007/.m2/repository/org/junit/platform/junit-platform-launcher/1.9.3/junit-platform-launcher-1.9.3.jar:/Users/ylqi007/.m2/repository/org/junit/platform/junit-platform-engine/1.9.3/junit-platform-engine-1.9.3.jar:/Users/ylqi007/.m2/repository/org/junit/jupiter/junit-jupiter-engine/5.9.3/junit-jupiter-engine-5.9.3.jar:/Users/ylqi007/Library/Application Support/JetBrains/Toolbox/apps/IDEA-U/ch-0/231.9161.38/IntelliJ IDEA.app/Contents/lib/idea_rt.jar:/Users/ylqi007/Library/Application Support/JetBrains/Toolbox/apps/IDEA-U/ch-0/231.9161.38/IntelliJ IDEA.app/Contents/plugins/junit/lib/junit5-rt.jar:/Users/ylqi007/Library/Application Support/JetBrains/Toolbox/apps/IDEA-U/ch-0/231.9161.38/IntelliJ IDEA.app/Contents/plugins/junit/lib/junit-rt.jar:/Users/ylqi007/Work/IDEA/Spring6Tutorial/SpringFirst/target/test-classes:/Users/ylqi007/Work/IDEA/Spring6Tutorial/SpringFirst/target/classes:/Users/ylqi007/.m2/repository/org/springframework/spring-context/6.0.11/spring-context-6.0.11.jar:/Users/ylqi007/.m2/repository/org/springframework/spring-aop/6.0.11/spring-aop-6.0.11.jar:/Users/ylqi007/.m2/repository/org/springframework/spring-beans/6.0.11/spring-beans-6.0.11.jar:/Users/ylqi007/.m2/repository/org/springframework/spring-core/6.0.11/spring-core-6.0.11.jar:/Users/ylqi007/.m2/repository/org/springframework/spring-jcl/6.0.11/spring-jcl-6.0.11.jar:/Users/ylqi007/.m2/repository/org/springframework/spring-expression/6.0.11/spring-expression-6.0.11.jar:/Users/ylqi007/.m2/repository/org/junit/jupiter/junit-jupiter-api/5.9.3/junit-jupiter-api-5.9.3.jar:/Users/ylqi007/.m2/repository/org/opentest4j/opentest4j/1.2.0/opentest4j-1.2.0.jar:/Users/ylqi007/.m2/repository/org/junit/platform/junit-platform-commons/1.9.3/junit-platform-commons-1.9.3.jar:/Users/ylqi007/.m2/repository/org/apiguardian/apiguardian-api/1.1.2/apiguardian-api-1.1.2.jar com.intellij.rt.junit.JUnitStarter -ideVersion5 -junit5 com.atguigu.spring6.UserTest,testCreateUserObject
     * 1:com.atguigu.spring6.User@47e2e487
     * 2:com.atguigu.spring6.User.add()...
     *
     * Process finished with exit code 0
     *
     * 说明：以上输出说明了User对象被成功创建，User对象的add()被成功调用。
     *
     *
     * /Users/ylqi007/Library/Java/JavaVirtualMachines/corretto-17.0.8.1/Contents/Home/bin/java -ea -Didea.test.cyclic.buffer.size=1048576 -javaagent:/Users/ylqi007/Library/Application Support/JetBrains/Toolbox/apps/IDEA-U/ch-0/231.9161.38/IntelliJ IDEA.app/Contents/lib/idea_rt.jar=53540:/Users/ylqi007/Library/Application Support/JetBrains/Toolbox/apps/IDEA-U/ch-0/231.9161.38/IntelliJ IDEA.app/Contents/bin -Dfile.encoding=UTF-8 -classpath /Users/ylqi007/.m2/repository/org/junit/platform/junit-platform-launcher/1.9.3/junit-platform-launcher-1.9.3.jar:/Users/ylqi007/.m2/repository/org/junit/platform/junit-platform-engine/1.9.3/junit-platform-engine-1.9.3.jar:/Users/ylqi007/.m2/repository/org/junit/jupiter/junit-jupiter-engine/5.9.3/junit-jupiter-engine-5.9.3.jar:/Users/ylqi007/Library/Application Support/JetBrains/Toolbox/apps/IDEA-U/ch-0/231.9161.38/IntelliJ IDEA.app/Contents/lib/idea_rt.jar:/Users/ylqi007/Library/Application Support/JetBrains/Toolbox/apps/IDEA-U/ch-0/231.9161.38/IntelliJ IDEA.app/Contents/plugins/junit/lib/junit5-rt.jar:/Users/ylqi007/Library/Application Support/JetBrains/Toolbox/apps/IDEA-U/ch-0/231.9161.38/IntelliJ IDEA.app/Contents/plugins/junit/lib/junit-rt.jar:/Users/ylqi007/Work/IDEA/Spring6Tutorial/SpringFirst/target/test-classes:/Users/ylqi007/Work/IDEA/Spring6Tutorial/SpringFirst/target/classes:/Users/ylqi007/.m2/repository/org/springframework/spring-context/6.0.11/spring-context-6.0.11.jar:/Users/ylqi007/.m2/repository/org/springframework/spring-aop/6.0.11/spring-aop-6.0.11.jar:/Users/ylqi007/.m2/repository/org/springframework/spring-beans/6.0.11/spring-beans-6.0.11.jar:/Users/ylqi007/.m2/repository/org/springframework/spring-core/6.0.11/spring-core-6.0.11.jar:/Users/ylqi007/.m2/repository/org/springframework/spring-jcl/6.0.11/spring-jcl-6.0.11.jar:/Users/ylqi007/.m2/repository/org/springframework/spring-expression/6.0.11/spring-expression-6.0.11.jar:/Users/ylqi007/.m2/repository/org/junit/jupiter/junit-jupiter-api/5.9.3/junit-jupiter-api-5.9.3.jar:/Users/ylqi007/.m2/repository/org/opentest4j/opentest4j/1.2.0/opentest4j-1.2.0.jar:/Users/ylqi007/.m2/repository/org/junit/platform/junit-platform-commons/1.9.3/junit-platform-commons-1.9.3.jar:/Users/ylqi007/.m2/repository/org/apiguardian/apiguardian-api/1.1.2/apiguardian-api-1.1.2.jar com.intellij.rt.junit.JUnitStarter -ideVersion5 -junit5 com.atguigu.spring6.UserTest,testCreateUserObject
     * 0: 通过无参数构造器创建User对象
     * 1:com.atguigu.spring6.User@47e2e487
     * 2:com.atguigu.spring6.User.add()...
     *
     * Process finished with exit code 0
     *
     * 说明：以上结果说明，通过无参构造器创建了User对象。
     * 此时并没有在代码中用new的方式创建对象，那么对象是如何被创建的？-- 反射
     *
     * <root level="DEBUG">
     *     <appender-ref ref="spring6log"/>
     * </root>
     * /Users/ylqi007/Library/Java/JavaVirtualMachines/corretto-17.0.8.1/Contents/Home/bin/java -ea -Didea.test.cyclic.buffer.size=1048576 -javaagent:/Users/ylqi007/Library/Application Support/JetBrains/Toolbox/apps/IDEA-U/ch-0/231.9161.38/IntelliJ IDEA.app/Contents/lib/idea_rt.jar=63711:/Users/ylqi007/Library/Application Support/JetBrains/Toolbox/apps/IDEA-U/ch-0/231.9161.38/IntelliJ IDEA.app/Contents/bin -Dfile.encoding=UTF-8 -classpath /Users/ylqi007/.m2/repository/org/junit/platform/junit-platform-launcher/1.9.3/junit-platform-launcher-1.9.3.jar:/Users/ylqi007/.m2/repository/org/junit/platform/junit-platform-engine/1.9.3/junit-platform-engine-1.9.3.jar:/Users/ylqi007/.m2/repository/org/junit/jupiter/junit-jupiter-engine/5.9.3/junit-jupiter-engine-5.9.3.jar:/Users/ylqi007/Library/Application Support/JetBrains/Toolbox/apps/IDEA-U/ch-0/231.9161.38/IntelliJ IDEA.app/Contents/lib/idea_rt.jar:/Users/ylqi007/Library/Application Support/JetBrains/Toolbox/apps/IDEA-U/ch-0/231.9161.38/IntelliJ IDEA.app/Contents/plugins/junit/lib/junit5-rt.jar:/Users/ylqi007/Library/Application Support/JetBrains/Toolbox/apps/IDEA-U/ch-0/231.9161.38/IntelliJ IDEA.app/Contents/plugins/junit/lib/junit-rt.jar:/Users/ylqi007/Work/IDEA/Spring6Tutorial/SpringFirst/target/test-classes:/Users/ylqi007/Work/IDEA/Spring6Tutorial/SpringFirst/target/classes:/Users/ylqi007/.m2/repository/org/springframework/spring-context/6.0.11/spring-context-6.0.11.jar:/Users/ylqi007/.m2/repository/org/springframework/spring-aop/6.0.11/spring-aop-6.0.11.jar:/Users/ylqi007/.m2/repository/org/springframework/spring-beans/6.0.11/spring-beans-6.0.11.jar:/Users/ylqi007/.m2/repository/org/springframework/spring-core/6.0.11/spring-core-6.0.11.jar:/Users/ylqi007/.m2/repository/org/springframework/spring-jcl/6.0.11/spring-jcl-6.0.11.jar:/Users/ylqi007/.m2/repository/org/springframework/spring-expression/6.0.11/spring-expression-6.0.11.jar:/Users/ylqi007/.m2/repository/org/junit/jupiter/junit-jupiter-api/5.9.3/junit-jupiter-api-5.9.3.jar:/Users/ylqi007/.m2/repository/org/opentest4j/opentest4j/1.2.0/opentest4j-1.2.0.jar:/Users/ylqi007/.m2/repository/org/junit/platform/junit-platform-commons/1.9.3/junit-platform-commons-1.9.3.jar:/Users/ylqi007/.m2/repository/org/apiguardian/apiguardian-api/1.1.2/apiguardian-api-1.1.2.jar:/Users/ylqi007/.m2/repository/org/apache/logging/log4j/log4j-core/2.20.0/log4j-core-2.20.0.jar:/Users/ylqi007/.m2/repository/org/apache/logging/log4j/log4j-api/2.20.0/log4j-api-2.20.0.jar:/Users/ylqi007/.m2/repository/org/apache/logging/log4j/log4j-slf4j2-impl/2.20.0/log4j-slf4j2-impl-2.20.0.jar:/Users/ylqi007/.m2/repository/org/slf4j/slf4j-api/2.0.6/slf4j-api-2.0.6.jar com.intellij.rt.junit.JUnitStarter -ideVersion5 -junit5 com.atguigu.spring6.UserTest,testCreateUserObject
     * 2023-09-14 18:02:49 506 [main] DEBUG org.springframework.context.support.ClassPathXmlApplicationContext - Refreshing org.springframework.context.support.ClassPathXmlApplicationContext@2d36e77e
     * 2023-09-14 18:02:49 625 [main] DEBUG org.springframework.beans.factory.xml.XmlBeanDefinitionReader - Loaded 1 bean definitions from class path resource [bean.xml]
     * 2023-09-14 18:02:49 645 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'user'
     * 0: 通过无参数构造器创建User对象
     * 1:com.atguigu.spring6.User@2e77b8cf
     * 2:com.atguigu.spring6.User.add()...
     *
     * 说明：以上结果说明启用了log，但是这三行log都是自动生成的，并为人为添加log.info(), log.warn()...
     *
     * <root level="DEBUG">
     *     <appender-ref ref="spring6log"/>
     *     <appender-ref ref="log"/>
     * </root>
     * ➜  spring6_log pwd
     * /tmp/spring6_log
     * ➜  spring6_log ll
     * total 8
     * -rw-r--r--@ 1 ylqi007  wheel  520 Sep 14 18:05 test.log
     * ➜  spring6_log cat test.log
     * 18:05:36.413 DEBUG org.springframework.context.support.AbstractApplicationContext 654 prepareRefresh - Refreshing org.springframework.context.support.ClassPathXmlApplicationContext@2d36e77e
     * 18:05:36.488 DEBUG org.springframework.beans.factory.xml.XmlBeanDefinitionReader 393 doLoadBeanDefinitions - Loaded 1 bean definitions from class path resource [bean.xml]
     * 18:05:36.509 DEBUG org.springframework.beans.factory.support.DefaultSingletonBeanRegistry 225 getSingleton - Creating shared instance of singleton bean 'user'
     * ➜  spring6_log
     *
     * 说明：以上结果说明log会在 /tmp/spring6_log/ 路径下生成test.log文件，内容和控制台输出的一致
     *
     * <root level="DEBUG">
     *     <appender-ref ref="spring6log"/>
     *     <appender-ref ref="log"/>
     *     <appender-ref ref="RollingFile"/>
     * </root>
     * ➜  spring6_log ll
     * total 16
     * -rw-r--r--@ 1 ylqi007  wheel  562 Sep 14 18:09 application.log
     * -rw-r--r--@ 1 ylqi007  wheel  520 Sep 14 18:09 test.log
     * ➜  spring6_log cat test.log
     * 18:09:30.254 DEBUG org.springframework.context.support.AbstractApplicationContext 654 prepareRefresh - Refreshing org.springframework.context.support.ClassPathXmlApplicationContext@3b0c9195
     * 18:09:30.356 DEBUG org.springframework.beans.factory.xml.XmlBeanDefinitionReader 393 doLoadBeanDefinitions - Loaded 1 bean definitions from class path resource [bean.xml]
     * 18:09:30.384 DEBUG org.springframework.beans.factory.support.DefaultSingletonBeanRegistry 225 getSingleton - Creating shared instance of singleton bean 'user'
     * ➜  spring6_log cat application.log
     * 2023-09-14 at 18:09:30 PDT DEBUG org.springframework.context.support.AbstractApplicationContext 654 prepareRefresh - Refreshing org.springframework.context.support.ClassPathXmlApplicationContext@3b0c9195
     * 2023-09-14 at 18:09:30 PDT DEBUG org.springframework.beans.factory.xml.XmlBeanDefinitionReader 393 doLoadBeanDefinitions - Loaded 1 bean definitions from class path resource [bean.xml]
     * 2023-09-14 at 18:09:30 PDT DEBUG org.springframework.beans.factory.support.DefaultSingletonBeanRegistry 225 getSingleton - Creating shared instance of singleton bean 'user'
     *
     * 说明：以上结果说明log会在 /tmp/spring6_log/ 路径下生成test.log和application.log文件，内容和控制台输出的一致，具体信息根据设定有所不同
     */
    @Test
    public void testCreateUserObject() {
        // 1. 加载Spring配置文件(xml文件)，进行对象创建
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");

        // 2. 获取步骤1中创建的对象
        User user = (User) applicationContext.getBean("user");
        System.out.println("1:" + user);

        // 3. 调用对象的方法进行测试
        System.out.print("2:");
        user.add();

        // 4. 人为主动添加log
        // 2023-09-14 18:33:29 065 [main] INFO com.atguigu.spring6.UserTest - 在UserTest.testCreateUserObject()中手动添加log
        log.info("在UserTest.testCreateUserObject()中手动添加log");
    }

    /**
     * 如何通过反射创建对象？
     * 1. 加载bean.xml文件
     * 2. 对xml文件进行解析
     * 3. 获取xml文件中bean标签的属性，本例子中的id & class
     * 4. 使用反射，根据类的全路径创建对象
     *
     * /Users/ylqi007/Library/Java/JavaVirtualMachines/corretto-17.0.8.1/Contents/Home/bin/java -ea -Didea.test.cyclic.buffer.size=1048576 -javaagent:/Users/ylqi007/Library/Application Support/JetBrains/Toolbox/apps/IDEA-U/ch-0/231.9161.38/IntelliJ IDEA.app/Contents/lib/idea_rt.jar=53611:/Users/ylqi007/Library/Application Support/JetBrains/Toolbox/apps/IDEA-U/ch-0/231.9161.38/IntelliJ IDEA.app/Contents/bin -Dfile.encoding=UTF-8 -classpath /Users/ylqi007/.m2/repository/org/junit/platform/junit-platform-launcher/1.9.3/junit-platform-launcher-1.9.3.jar:/Users/ylqi007/.m2/repository/org/junit/platform/junit-platform-engine/1.9.3/junit-platform-engine-1.9.3.jar:/Users/ylqi007/.m2/repository/org/junit/jupiter/junit-jupiter-engine/5.9.3/junit-jupiter-engine-5.9.3.jar:/Users/ylqi007/Library/Application Support/JetBrains/Toolbox/apps/IDEA-U/ch-0/231.9161.38/IntelliJ IDEA.app/Contents/lib/idea_rt.jar:/Users/ylqi007/Library/Application Support/JetBrains/Toolbox/apps/IDEA-U/ch-0/231.9161.38/IntelliJ IDEA.app/Contents/plugins/junit/lib/junit5-rt.jar:/Users/ylqi007/Library/Application Support/JetBrains/Toolbox/apps/IDEA-U/ch-0/231.9161.38/IntelliJ IDEA.app/Contents/plugins/junit/lib/junit-rt.jar:/Users/ylqi007/Work/IDEA/Spring6Tutorial/SpringFirst/target/test-classes:/Users/ylqi007/Work/IDEA/Spring6Tutorial/SpringFirst/target/classes:/Users/ylqi007/.m2/repository/org/springframework/spring-context/6.0.11/spring-context-6.0.11.jar:/Users/ylqi007/.m2/repository/org/springframework/spring-aop/6.0.11/spring-aop-6.0.11.jar:/Users/ylqi007/.m2/repository/org/springframework/spring-beans/6.0.11/spring-beans-6.0.11.jar:/Users/ylqi007/.m2/repository/org/springframework/spring-core/6.0.11/spring-core-6.0.11.jar:/Users/ylqi007/.m2/repository/org/springframework/spring-jcl/6.0.11/spring-jcl-6.0.11.jar:/Users/ylqi007/.m2/repository/org/springframework/spring-expression/6.0.11/spring-expression-6.0.11.jar:/Users/ylqi007/.m2/repository/org/junit/jupiter/junit-jupiter-api/5.9.3/junit-jupiter-api-5.9.3.jar:/Users/ylqi007/.m2/repository/org/opentest4j/opentest4j/1.2.0/opentest4j-1.2.0.jar:/Users/ylqi007/.m2/repository/org/junit/platform/junit-platform-commons/1.9.3/junit-platform-commons-1.9.3.jar:/Users/ylqi007/.m2/repository/org/apiguardian/apiguardian-api/1.1.2/apiguardian-api-1.1.2.jar com.intellij.rt.junit.JUnitStarter -ideVersion5 -junit5 com.atguigu.spring6.UserTest,testCreateUserObjectByReflection
     * 0: 通过无参数构造器创建User对象
     * 通过反射创建User对象: com.atguigu.spring6.User@dbd940d
     *
     * Process finished with exit code 0
     */
    @Test
    public void testCreateUserObjectByReflection() throws Exception {
        // 1. 获取类Class对象
        Class clazz = Class.forName("com.atguigu.spring6.User");

        // 2. 调用方法创建对象
        // Object o = clazz.newInstance();  // Deprecated and can be replaced by clazz.getDeclaredConstructor().newInstance()
        User user = (User)clazz.getDeclaredConstructor().newInstance();
        System.out.println("通过反射创建User对象: " + user);
    }
}