package com.course.testng;

import org.testng.annotations.Test;

public class IgnoreTest {

    //在Test标签后面添加enabled参数，enabled = false表示该测试用例不执行，默认值为true。
    @Test(enabled = false)
    public void IgnoreTest1(){
        System.out.println("忽略测试1");

    }

    @Test(enabled = true)
    public void IgnoreTest2(){
        System.out.println("忽略测试2");

    }

    @Test()
    public void IgnoreTest3(){
        System.out.println("忽略测试3");

    }
}
