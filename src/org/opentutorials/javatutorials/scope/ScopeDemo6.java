package org.opentutorials.javatutorials.scope;

public class ScopeDemo6 {
    static int i = 5;

    static void a() {
        int i = 10;
        b();    // 여기서 b()를 호출해서 사용해도 b()에서는 a의 지역변수가 사용되는게 아니고 전역변수 i가 사용됨.
    }

    static void b()
    {
        System.out.println(i);  // 여기서 가져온 i는 전역변수 i이다.(a의 지역변수가 아님.)
        // 만약 위의 줄 위에 int i = 30;이 있다면 위에서 i는 b의 지역변수 i가 사용된다.
        // 이런 것을 보고 정적인 유효범위(Static Scope)라고 한다.
        // 만약 i가 a의 지역변수가 사용된다면 그것은 동적인 유효범위(Dynamic Scope)라고 한다.
        // 근대적인 언어들은 동적인 유효범위가 사용되는 경우가 있다.
    }

    public static void main(String[] args) {
        a();
    }
}