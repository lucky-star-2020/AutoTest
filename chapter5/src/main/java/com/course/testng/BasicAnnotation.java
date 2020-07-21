package com.course.testng;

import org.testng.annotations.*;

public class BasicAnnotation {

    //Test标签，最基本的注解，用来把方法标记为测试的一部分
    @Test
    public void testCase1(){
        System.out.println("testCase1");

    }

    @Test
    public void testCase2(){
        System.out.println("testCase2");
    }

    //在每一个方法之前运行
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("beforeMethod");

    }

    //在每一个方法之后运行
    @AfterMethod
    public void afterMethod(){
        System.out.println("afterMethod");
    }

    //在类运行之前运行
    @BeforeClass
    public void beforeclass(){
        System.out.println("beforeclass");

    }

    //在类运行结束之后运行
    @AfterClass
    public void afterclass(){
        System.out.println("afterclass");
    }

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


}
