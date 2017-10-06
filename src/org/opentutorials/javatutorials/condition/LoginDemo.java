package org.opentutorials.javatutorials.condition;

public class LoginDemo {
    public static void main(String[] args) {
        String id = args[0]; // 프로그램을 실행시켰을 때 처음의 입력 값
        if(id.equals("egoing")){
            System.out.println("right");
        } else {
            System.out.println("wrong");
        }
    }
}
