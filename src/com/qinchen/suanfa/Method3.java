package com.qinchen.suanfa;

/**
 * 查找素数
 */
public class Method3 {
    public static void main(String[] args) {
        long l = System.currentTimeMillis();
        get();
        System.out.println(System.currentTimeMillis()-l);
    }
    public static void get(){
        for (int i = 101; i < 200; i++) {
            boolean flag =true;
            for (int j = 2; j <Math.sqrt(Double.valueOf(i+"")) ; j++) {
                if(i%j==0){
                    flag = false;
                    break;
                }
            }
            if(flag){
                System.out.println("i = "+i);
            }
        }
    }
}
