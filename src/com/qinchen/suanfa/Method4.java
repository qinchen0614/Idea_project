package com.qinchen.suanfa;

/**
 * 分解因式
 */
public class Method4 {
    public static void main(String[] args) {
        get(24);
    }

    public static void get(int num) {
        System.out.print(num + "=");
        int k = 2;
        while (num >= k) {
            if (num % k == 0) {
                num = num / k;
                if (num == 1) {
                    System.out.println(k);
                } else {
                    System.out.print(k + "*");
                }
            } else {
                k++;
            }
        }
    }
}
