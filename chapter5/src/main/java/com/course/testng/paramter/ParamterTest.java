package com.course.testng.paramter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamterTest {
    //使用@Parameters({"name","age"})这个注解来进行参数化，参数化的数据写在xml文件中
    @Test
    @Parameters({"name","age"})
    public void paramterTest1(String name,int age){
        System.out.println("name = " + name + "  age = " + age);
    }
}
