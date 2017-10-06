package org.opentutorials.javatutorials.overloading.example1;

public class OverloadingDemo {
    void A() {
        System.out.println("void A()");
    }
    void A(int arg1) {
        System.out.println("void A(int arg1)");
    }
    void A(String arg1) {
        System.out.println("void A(String arg1)");
    }
    //int A() {System.out.println("int A()")};
    // 메소드의 이름이 같고 형식이 같지만 리턴 값이 다른 메소드를 만들면
    // 자바는 다른 곳에서 호출할 때 어떤 메소드를 호출해야 하는지 모르기 때문에 오류가 발생한다.
    //void A(int param1) {System.out.println("void A()");}
    // 위의 것도 오류가 뜬다. 파라미터의 형식이 같은데 이름이 다르면 역시 자바는 어떤 것을
    // 호출해야 하는지 모르기 때문에 오류가 발생한다.
    public static void main(String[] args) {
        OverloadingDemo od = new OverloadingDemo();
        od.A();
        od.A(1);
        od.A("coding everybody");
    }
}
