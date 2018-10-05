package com.scnu.o2o;


import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//spring 与 junit 实现整合， Junit启动时候加载Spring IOC 容器
@RunWith(SpringJUnit4ClassRunner.class)
//告知Junit，Spring配置文件位置
@ContextConfiguration({"classpath:spring/spring-dao.xml","classpath:spring/spring-service.xml","classpath:spring/spring-controller.xml"})
public class BaseTest {

}
