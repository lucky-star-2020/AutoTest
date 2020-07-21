package com.course.testng;

import org.testng.annotations.Test;

public class DepenndTest {
    //依赖测试,例如test2依赖于test1，则只有当test1执行成功时，test2才执行，否则test2不执行

    @Test
    public void test1(){
        System.out.println("test1 run");
        throw new RuntimeException();
    }

    /**
     * @Test(dependsOnMethods = {"test1"})这个注解代表test2依赖于test1，此时即使只执行test2，test1也会被执行
     * 若test1出现异常，则test2会被忽略
     */

    @Test(dependsOnMethods = {"test1"})
    public void test2(){
        System.out.println("test2 run");
    }
}
