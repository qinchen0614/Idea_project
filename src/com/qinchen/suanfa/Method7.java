package com.qinchen.suanfa;

/**
 * 完数
 */
public class Method7 {
    public static void main(String[] args) {
        get();
    }
    public static void get(){
        for (int i = 1; i < 1000; i++) {
            int s = 0;
            for (int j = 1; j <i ; j++) {
                if(i%j==0){
                    s = s + j;
                }
            }
            if(s == i){
                System.out.println("完数："+i);
            }
        }
    }
}
