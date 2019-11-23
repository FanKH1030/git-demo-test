package com.bea.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by fandi on 2019/11/16 0016.
 */
public class Hello {
    public static void main(String[] args) {
        int n = 20;
        int m = 30;
        int x = m + n;
        System.out.println("x" + x);
        int y = add(x, m);
        System.out.println("y=" + y);

        System.out.println("你好 demo");
//        Map<String,Integer> map = new HashMap<>();
        Map map = new HashMap();
    }

    public static int add(int m, int n) {
        return m + n;
    }
}
