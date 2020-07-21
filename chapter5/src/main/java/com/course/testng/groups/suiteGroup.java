package com.course.testng.groups;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test(groups="SuiteGroup")
public class suiteGroup {
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
