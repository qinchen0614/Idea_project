package com.qinchen.suanfa;

/**
 * 球从高处落下
 */
public class Method8 {
    public static void main(String[] args) {
        int h = 100;
        int s = 0;
        for (int i = 0; i < 10; i++) {
            s += h;
            h = h / 2;
            s += h;
        }
        System.out.println(s);
    }
}
