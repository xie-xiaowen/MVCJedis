package com.xxw.test;

import com.xxw.pojo.User;
import org.junit.Test;

import java.util.List;

public class Demo {

    @Test
    public void Demo1(){
        List<User> list  = null;
        String str = list.get(0).getName();
        System.out.println(str);
    }

    @Test
    public void Demo2(){
        List<User> list  = null;
        String str = list.get(0).getName();
        System.out.println(str);
    }

}
