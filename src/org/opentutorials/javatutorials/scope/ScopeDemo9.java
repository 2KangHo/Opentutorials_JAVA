package org.opentutorials.javatutorials.scope;

class C3 {
    int v = 10;

    void m() {
        int v = 20;

        System.out.println(v);
        System.out.println(this.v);
        // this는 인스턴스 자체의 의미를 가짐.
        // 객체의 지역변수에 접근함.
        // 같은 이름이 없으면 this를 안 써도 알아서 지역변수에 접근함.
    }
}

public class ScopeDemo9 {
    public static void main(String[] args) {
        C3 c1 = new C3();
        c1.m();
    }
}

/**
 * 어떤 메소드가 전역변수를 사용하고 있다는 것은 그 메소드는 그 전역변수에 의존한다는 의미다.
 * 전역변수에 의존한다는 것은 이 메소드가 다른 완제품의 부품으로서 사용될 수 없다는 의미다.
 * 객체지향 덕분에 좀 더 안심하고 전역변수를 사용하게 되었지만, 객체도 크기가 커지면 관리의 이슈가 생겨난다.
 * 객체지향 프로그래밍에서도 가급적이면 전역변수의 사용을 자제하는 것이 좋고,
 * 동시에 단일 객체가 너무 비대해지지 않도록 적절하게 규모를 쪼개는 것도 중요하다.
 */