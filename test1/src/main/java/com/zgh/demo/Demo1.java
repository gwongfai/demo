package com.zgh.demo;

import java.util.ArrayList;
import java.util.List;

public class Demo1 {
    public static void main(String[] args) {
        System.out.println("OK");
        System.out.println("Test");
        System.out.println("Yes");
        int a = 10;
        while (true) {
            if (a > 0) {
                System.out.println(a);
                a--;
            }else {
                return;
            }
        }
    }

}
