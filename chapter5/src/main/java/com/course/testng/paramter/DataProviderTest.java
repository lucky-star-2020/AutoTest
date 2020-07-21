package com.course.testng.paramter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DataProviderTest {

    @Test(dataProvider = "data")
    public void paramterTest1(String name,int age){
        System.out.println("name = " + name + "  age = " + age);
    }

    //将下面的参数传入上面的测试用例,@DataProvider(name="data")中的name的值要与传入的测试用例的dataProvider的值相同
    @DataProvider(name="data")
    public Object[][] providerData(){
        Object[][] o = new Object[][]{
                {"张三",18},
                {"李四",25},
                {"王五",33}
        };
        return o;
    }



    @Test(dataProvider = "methodData")
    public void test1(String name,int age){
        System.out.println("test1name = " + name + "  age = " + age);
    }

    @Test(dataProvider = "methodData")
    public void test2(String name,int age){
        System.out.println("test2name = " + name + "  age = " + age);
    }

    //使用Method method，自动将前面的方法名传递进来
    @DataProvider(name="methodData")
    public Object[][] methodData(Method method){
        Object[][] result = null; //之后需要根据测试用例的不同给result赋值
        if (method.getName().equals("test1")){
            result = new Object[][]{
                    {"张器",99},
                    {"李新",100}
            };

        }else if(method.getName().equals("test2")){
            result = new Object[][]{
                    {"王例",50},
                    {"金并",60}

            };

        }
        return result;

    }

}
