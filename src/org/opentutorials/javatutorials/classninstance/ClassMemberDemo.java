package org.opentutorials.javatutorials.classninstance;

/**
 * - 인스턴스 메소드는 클래스 멤버에 접근할 수 있다.
 * - 클래스 메소드는 인스턴스 멤버에 접근할 수 없다.
 *      인스턴스 변수는 인스턴스가 만들어지면서 생성되는데,
 *      클래스 메소드는 인스턴스가 생성되기 전에 만들어지기 때문에
 *      클래스 메소드가 인스턴스 맴버에 접근하는 것은
 *      존재하지 않는 인스턴스 변수에 접근하는 것과 같다.
 */

/**
 * 인스턴스 변수와 클래스 변수는 아래와 같이 부르기도 한다.
 *
 * 인스턴스 변수 -> Non-Static Field
 * 클래스 변수 -> Static Field
 *
 * 필드(field)라는 것은 클래스 전역에서 접근 할 수 있는 변수를 의미하는데 이에 대한 자세한 내용은 유효범위 수업에서 알아보겠다.
 */

class C1 {
    // 클래스 변수
    static int static_variable = 1;
    // 인스턴스 변수
    int instance_variable = 2;

    // 클래스 메소드
    static void static_static(){
        System.out.println(static_variable);
    }
    static void static_instance(){
        // 클래스 메소드에서는 인스턴스 변수에 접근 할 수 없다.
        //System.out.println(instance_variable);
    }
    // 인스턴스 메소드
    void instance_static(){
        // 인스턴스 메소드에서는 클래스 변수에 접근 할 수 있다.
        System.out.println(static_variable);
    }
    void instance_instance(){
        System.out.println(instance_variable);
    }
}

public class ClassMemberDemo {
    public static void main(String[] args) {
        C1 c = new C1();
        // 인스턴스를 이용해서 클래스 메소드(정적 메소드)에 접근 -> 성공
        // 클래스 메소드가 클래스 변수(정적 변수)에 접근 -> 성공
        c.static_static();
        // 인스턴스를 이용해서 클래스 메소드에 접근 -> 성공
        // 클래스 메소드가 인스턴스 변수에 접근 -> 실패
        //c.static_instance();
        // 인스턴스를 이용해서 인스턴스 메소드에 접근 -> 성공
        // 인스턴스 메소드가 클래스 변수에 접근 -> 성공
        c.instance_static();
        // 인스턴스를 이용해서 인스턴스 메소드에 접근 -> 성공
        // 인스턴스 메소드가 인스턴스 변수에 접근 -> 성공
        c.instance_instance();
        // 클래스를 이용해서 클래스 메소드에 접근 -> 성공
        // 클래스 메소드가 클래스 변수에 접근 -> 성공
        C1.static_static();
        // 클래스를 이용해서 클래스 메소드에 접근 -> 성공
        // 클래스 메소드가 인스턴스 변수에 접근 -> 실패
        //C1.static_instance();
        // 클래스를 이용해서 인스턴스 메소드에 접근 -> 실패
        // 인스턴스가 생성되지 않았기 때문에 프로그램이 알 수 없다.
        //C1.instance_static();
        // 클래스를 이용해서 인스턴스 메소드에 접근 -> 실패
        //C1.instance_instance();
    }
}