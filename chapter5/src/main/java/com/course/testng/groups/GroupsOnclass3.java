package com.course.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "teacher")
public class GroupsOnclass3 {
    public void groupTeacher(){
        System.out.println("groupTeacher");
    }
}
