package org.opentutorials.javatutorials.operator;

public class DivisionDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        float c = 10.0F;
        float d = 3.0F;

        System.out.println(a/b);
        System.out.println(c/d);
        System.out.println(a/d);
        // 나눌 때 정수는 소수점을 표현할 수 없으므로
        // 나머지는 버려지고 정수값만 남는다.
        // 세 번째 결과는 자동으로 형 변환이 일어나서 정수가 실수가 된다.
    }
}
