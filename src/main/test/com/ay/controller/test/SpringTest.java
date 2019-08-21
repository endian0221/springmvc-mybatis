package com.ay.controller.test;

import com.ay.controller.AyTestController;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    @Test
    public void testSpring(){
        //获取运用上下文
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");

        AyTestController ayTestController=(AyTestController) applicationContext.getBean("ayTestController");

        ayTestController.hello();

    }
}
