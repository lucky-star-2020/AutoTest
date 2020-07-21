package com.course.testng.groups;

import org.testng.annotations.Test;

//Test注解也可以使用在类上面
@Test(groups = "stu1")
public class GroupsOnClass1 {
    public void groupStu1(){
        System.out.println("groupStu111111");
    }
}
