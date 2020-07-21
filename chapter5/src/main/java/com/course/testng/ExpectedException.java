package com.course.testng;

import org.testng.annotations.Test;

public class ExpectedException {
    /**
     * 当我们测试的时候的期望结果是某一个异常的时候，我们会使用到异常测试
     * 例：我们传入了某些不合法的参数，程序抛出了异常，即我们的预期结果就是这个异常
     */

    //test注解后面的expectedExceptions是我的预期异常
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeFailed(){
        System.out.println("这是一个失败的异常测试");
    }

    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeSuccess(){
        System.out.println("这是一个成功的异常测试");
        throw new RuntimeException();
    }
}
