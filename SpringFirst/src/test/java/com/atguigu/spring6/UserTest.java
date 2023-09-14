package com.atguigu.spring6;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {

    /**
     * /Users/ylqi007/Library/Java/JavaVirtualMachines/corretto-17.0.8.1/Contents/Home/bin/java -ea -Didea.test.cyclic.buffer.size=1048576 -javaagent:/Users/ylqi007/Library/Application Support/JetBrains/Toolbox/apps/IDEA-U/ch-0/231.9161.38/IntelliJ IDEA.app/Contents/lib/idea_rt.jar=53070:/Users/ylqi007/Library/Application Support/JetBrains/Toolbox/apps/IDEA-U/ch-0/231.9161.38/IntelliJ IDEA.app/Contents/bin -Dfile.encoding=UTF-8 -classpath /Users/ylqi007/.m2/repository/org/junit/platform/junit-platform-launcher/1.9.3/junit-platform-launcher-1.9.3.jar:/Users/ylqi007/.m2/repository/org/junit/platform/junit-platform-engine/1.9.3/junit-platform-engine-1.9.3.jar:/Users/ylqi007/.m2/repository/org/junit/jupiter/junit-jupiter-engine/5.9.3/junit-jupiter-engine-5.9.3.jar:/Users/ylqi007/Library/Application Support/JetBrains/Toolbox/apps/IDEA-U/ch-0/231.9161.38/IntelliJ IDEA.app/Contents/lib/idea_rt.jar:/Users/ylqi007/Library/Application Support/JetBrains/Toolbox/apps/IDEA-U/ch-0/231.9161.38/IntelliJ IDEA.app/Contents/plugins/junit/lib/junit5-rt.jar:/Users/ylqi007/Library/Application Support/JetBrains/Toolbox/apps/IDEA-U/ch-0/231.9161.38/IntelliJ IDEA.app/Contents/plugins/junit/lib/junit-rt.jar:/Users/ylqi007/Work/IDEA/Spring6Tutorial/SpringFirst/target/test-classes:/Users/ylqi007/Work/IDEA/Spring6Tutorial/SpringFirst/target/classes:/Users/ylqi007/.m2/repository/org/springframework/spring-context/6.0.11/spring-context-6.0.11.jar:/Users/ylqi007/.m2/repository/org/springframework/spring-aop/6.0.11/spring-aop-6.0.11.jar:/Users/ylqi007/.m2/repository/org/springframework/spring-beans/6.0.11/spring-beans-6.0.11.jar:/Users/ylqi007/.m2/repository/org/springframework/spring-core/6.0.11/spring-core-6.0.11.jar:/Users/ylqi007/.m2/repository/org/springframework/spring-jcl/6.0.11/spring-jcl-6.0.11.jar:/Users/ylqi007/.m2/repository/org/springframework/spring-expression/6.0.11/spring-expression-6.0.11.jar:/Users/ylqi007/.m2/repository/org/junit/jupiter/junit-jupiter-api/5.9.3/junit-jupiter-api-5.9.3.jar:/Users/ylqi007/.m2/repository/org/opentest4j/opentest4j/1.2.0/opentest4j-1.2.0.jar:/Users/ylqi007/.m2/repository/org/junit/platform/junit-platform-commons/1.9.3/junit-platform-commons-1.9.3.jar:/Users/ylqi007/.m2/repository/org/apiguardian/apiguardian-api/1.1.2/apiguardian-api-1.1.2.jar com.intellij.rt.junit.JUnitStarter -ideVersion5 -junit5 com.atguigu.spring6.UserTest,testCreateUserObject
     * 1:com.atguigu.spring6.User@47e2e487
     * 2:com.atguigu.spring6.User.add()...
     *
     * Process finished with exit code 0
     *
     * 说明：以上输出说明了User对象被成功创建，User对象的add()被成功调用。
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
    }
}