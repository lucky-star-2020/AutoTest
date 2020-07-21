package com.course.testng.suite;

import org.testng.annotations.*;

//所有测试套件的配置，写测试套件运行之前需要使用的方法
public class SuiteConfig {
    //在类运行之前运行
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("beforeSuite");
    }

    //在类运行之后运行
    @AfterSuite
    public void afterSuite(){
        System.out.println("afterSuite");
    }

    //@BeforeTest和@AfterTest一般与@BeforeSuite和@AfterSuite存在同一个测试类中

    //在xml中的每一个test标签执行前运行
    @BeforeTest
    public void beforeTest(){
        System.out.println("beforeTest");

    }

    //在xml中的每一个test标签执行后运行
    @AfterTest
    public void afterTest(){
        System.out.println("afterTest");
    }

}
