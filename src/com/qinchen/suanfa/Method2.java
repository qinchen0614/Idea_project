package com.qinchen.suanfa;

/**
 * 水仙花树
 */
public class Method2 {
    public static void main(String[] args) {
        get(154);
    }

    public static void get(int num) {
        int data;
        int a = num / 100;
        int b = (num - 100 * a) / 10;
        int c = num - 100 * a - 10 * b;
        data = a*a*a + b*b*b+c*c*c;
        if (data==num) {
            System.out.println("是水仙花数");
        }else{
            System.out.println("不是水仙花数");
        }
    }
}
