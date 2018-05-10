package com.qinchen.zhengze;

import java.util.TreeSet;

public class ZhengZe {
    public static void main(String[] args) {
//        splitDemo("211abczzyii78","(.)\\1");
//        String tel = "18323471870";
//        String reg = "[1][3,5,8]\\d{9}";
//        boolean matches = tel.matches(reg);
//        System.out.println(matches);
//        dieci();
//        ip();
        email();
    }

    public static void splitDemo(String demo,String reg){
        String[] split = demo.split(reg);
        System.out.println(split.length);
        for (String s:split) {
            System.out.println(s);
        }
    }

    public static void dieci(){
        String str="aa..a..bbb.b..cc..c..d.ddd";
        String s = str.replaceAll("\\.+", "");
        System.out.println(s);
        String $1 = s.replaceAll("(.)\\1+", "$1");
        System.out.println($1);
    }

    public static void ip(){
        String str = "192.168.1.1 125.124.124.1 10.10.10.10 2.2.2.2";
        String s = str.replaceAll("(\\d+)", "00$1");
        System.out.println(s);
        String $1 = s.replaceAll("0*(\\d{3})", "$1");
        System.out.println($1);
        String[] split = $1.split(" ");
        TreeSet<String> ts = new TreeSet<>();
        for (String string:split) {
            ts.add(string);
        }
        for (String tsStr:ts) {
            String $11 = tsStr.replaceAll("0*(\\d+)", "$1");
            System.out.println($11);
        }

    }

    public static void email(){
        String mail = "aline@163.com";
        String reg = "[a-zA-Z0-9]+@[a-zA-Z0-9]+([\\.a-zA-Z]){1,3}";
        System.out.println(mail.matches(reg));
    }
}
