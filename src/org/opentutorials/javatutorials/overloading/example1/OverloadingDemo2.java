package org.opentutorials.javatutorials.overloading.example1;

public class OverloadingDemo2 extends OverloadingDemo {
    /*
    * 아래에 정의된 메소드 A는
    * 문자열을 데이터타입으로 하는 두개의 매개변수를 가지고 있다.
    * 이러한 형태의 변수는 부모 클래스에서는
    * 정의되어 있지 않기 때문에 메소드 오버로딩이다.
    */
    void A (String arg1, String arg2) {
        System.out.println("sub class : void A (String arg1, String arg2)");
    }   // method overloading

    /*
    * 아래에 정의된 메소드 A는 매개변수가 없고
    * 부모 클래스에는 이미 매개변수가 없는 메소드 A가 존재한다.
    * 이 둘은 매개변수의 형태가 같기 때문에
    * 오버로딩이 아니라 오버라이딩에 해당한다.
    */
    void A () {
        System.out.println("sub class : void A ()");
    }   // method overriding

    public static void main(String[] args) {
        OverloadingDemo2 od = new OverloadingDemo2();
        od.A();
        od.A(1);
        od.A("coding everybody");
        od.A("coding everybody", "coding everybody");
    }
}
