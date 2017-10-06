package org.opentutorials.javatutorials.constant;

public class ConstantDemo {
    public static void main(String[] args) {
        double a = 2.2;
        float b = 2.2F;
        // 자바에서는 float를 사용하려면
        // 상수에 float를 명시하는 F를 상수 마지막에 써야한다.
        // 기본적으로 2.2와 같은 소수점이 붙은 상수는 double형이다.



        int c = 2147483647;
        long d = 2147483648L;
        // 자바에서는 long를 사용하려면
        // 상수에 long를 명시하는 L를 상수 마지막에 써야한다.
        // 기본적으로 정수형 상수는 int형이다.

        byte e = 100;
        short f = 200;
        // byte와 short같은 경우는 자바에서 int형 상수를 쓰는 것을 허용한다.(데이터범위 안의 값)
    }
}
