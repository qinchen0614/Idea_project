package com.qinchen.suanfa;

/**
 *兔子
 */
public class Method1 {
    public static void main(String[] args) {
        System.out.println(get(6));
    }

    public static int get(int num) {
        if (num == 1 || num == 2) {
            return 1;
        } else {
            return get(num - 1) + get(num - 2);
        }
    }
}

