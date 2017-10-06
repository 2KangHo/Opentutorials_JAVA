package org.opentutorials.javatutorials.scope;

public class ScopeDemo5 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        //System.out.println(i);
        // i는 for문 안에서만 유효한 지역변수 이므로 오류 발생.
    }
}