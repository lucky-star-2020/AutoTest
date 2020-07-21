package com.course.testng.suite;

import org.testng.annotations.Test;

//具体逻辑控制的类，写测试主要的Test标签下面包含的那些方法
public class LoginTest {
    @Test
    public void LoginTest1(){
        System.out.println("登录成功1");

    }

    @Test
    public void LoginTest2(){
        System.out.println("登录成功2");

    }
}
