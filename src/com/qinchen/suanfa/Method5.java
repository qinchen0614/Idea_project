package com.qinchen.suanfa;

/**
 *最大公约数和最小公倍数
 */
public class Method5 {
    public static void main(String[] args) {
        int i = get(12, 12);
        System.out.println("最小公倍数："+i);
        System.out.println(12*12/i);
    }
    public static int get(int a,int b){
         int temp = 0;
         if(a<b){
             temp = a;
             a = b;
             b = temp;
         }
         while (b!=0){
             if(a==b){
                 return a;
             }else{
                 int k = a%b;
                 a = b;
                 b = k;
             }
         }
        return a;
    }
}
