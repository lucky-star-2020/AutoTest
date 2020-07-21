package com.course.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

//分组测试
public class GroupsOnMethod {

    @Test(groups = "server")
    public void server1(){
        System.out.println("server1");
    }

    @Test(groups = "server")
    public void server2(){
        System.out.println("server2");
    }

    @Test(groups = "client")
    public void client1(){
        System.out.println("client1");
    }

    @Test(groups = "client")
    public void client2(){
        System.out.println("client2");
    }


    //testNG版本过高导致BeforeGroups和AfterGroups无法执行，解决方法：将testNG的版本降为6
    //可以通过对分组类的操作来实现BeforeGroups，AfterGroups的类型功能
    @BeforeGroups("server")
    public void group1(){
        System.out.println("groupServer1");
    }

    @AfterGroups("server")
    public void group2(){
        System.out.println("groupServer2");
    }

    @BeforeGroups("client")
    public void group3(){
        System.out.println("groupClient1");
    }

    @AfterGroups("client")
    public void group4(){
        System.out.println("groupClient2");
    }
}
