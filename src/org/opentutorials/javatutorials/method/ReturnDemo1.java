package org.opentutorials.javatutorials.method;

public class ReturnDemo1 {
    public static String num(int i) {
        if(i==0){
            return "zero";
        } else if(i==1){
            return "one";
        } else if(i==2){
            return "two";
        }
        return "none";
    }

    public static void main(String[] args) {
        System.out.println(num(1));
        System.out.println(num(2));
        System.out.println(num(3));
        System.out.println(num(0));
    }
}
