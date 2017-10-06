package org.opentutorials.javatutorials.scope;

public class ScopeDemo2 {
    static int i;   // 전역변수(global variables) 선언.

    static void a() {
        i = 0;  // 전역변수 i에 0이라는 값을 할당.
        // int i = 0; => 이렇게 하면 Demo1처럼 전역변수 i와 전혀다른 지역변수를 선언, 할당하고 a()메소드 안에서만 동작한다.
    }

    public static void main(String[] args) {
        for(i = 0; i < 5; i++) {
            a();    // i를 0으로 만든다. (그래서 무한루프를 돈다.)
            System.out.println(i);
        }
        // for(int i = 0; i < 5; i++)
        // => 이렇게 하면 전역변수 i가 아닌 지역변수 i를 새로 만들기 때문에
        // for문 안에서는 이 지역변수를 사용한다.
        // 그래서 무한루프에 돌지 않고 0 1 2 3 4가 출력되고 끝난다.
    }
}
