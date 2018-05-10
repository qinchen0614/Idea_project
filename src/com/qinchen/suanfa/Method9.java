package com.qinchen.suanfa;

public class Method9 {
    public static void main(String[] args) {
        for (int i = 0; i <10000 ; i++) {
            if(Math.sqrt(i+100)%1==0){
                if(Math.sqrt(i+168)%1==0){
                    System.out.println(i);
                }
            }
        }
    }
}
