package org.opentutorials.javatutorials.classninstance;

// static이 붙은 메소드는 클래스 메소드가 된다.
// 클래스를 직접 접근해서 실행할 수 있다.

class Calculator3{
    public static void sum(int left, int right){
        System.out.println(left+right);
    }

    public static void avg(int left, int right){
        System.out.println((left+right)/2);
    }
}

public class CalculatorDemo3 {
    public static void main(String[] args) {
        Calculator3.sum(10, 20);
        Calculator3.avg(10, 20);

        Calculator3.sum(20, 40);
        Calculator3.avg(30, 50);
    }
}
