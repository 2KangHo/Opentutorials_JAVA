package org.opentutorials.javatutorials.scope;

/**
 * 프로그램이 커지면 여러 가지 이유로 이름이 충돌하게 된다.
 * 이를 해결하기 위해서 고안된 것이 유효범위라는 개념이다.
 * 흔히 스코프(Scope)라고도 부른다.
 */

public class ScopeDemo1 {
    static void a() {
        int i = 0;  // 여기 있는 i는 이 메소드 안에서만 유효하다(동작한다).
                    // 지역변수(local variables)
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            a();
            System.out.println(i);
        }
    }
}