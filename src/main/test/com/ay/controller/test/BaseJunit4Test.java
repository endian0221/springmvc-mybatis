package com.ay.controller.test;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author Ay
 * @create 2019/08/24
 * 配置加载上下文配置时，曾配错过classpath路径，记住classpath全是小写
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class BaseJunit4Test {

}
