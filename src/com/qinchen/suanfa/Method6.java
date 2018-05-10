package com.qinchen.suanfa;

import java.util.Scanner;

/**
 * 2*22*222*.....
 */
public class Method6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int n = scanner.nextInt();
        int s = 0,t = 0;
        for (int i = 1; i <= n; i++) {
            t += a;
            a = a*10;
            s += t;
        }
        System.out.println(s);
    }
}
