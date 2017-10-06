package org.opentutorials.javatutorials.condition;

public class Condition3Demo {
    public static void main(String[] args) {
        if (true) {
            System.out.println(1);
        } else {
            System.out.println(2);
        }
        // 이때 1만 출력됨.

        if(false){
            System.out.println(1);
        } else {
            System.out.println(2);
        }
        // 이때 2만 출력됨.
    }
}
