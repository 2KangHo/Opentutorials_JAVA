package org.opentutorials.javatutorials.typeconversion;

public class TypeConversion {
    public static void main(String[] args) {
        // 자동 형 변환(암시적 형 변환)
        double doublefloat = 3.0F;
        System.out.println(doublefloat);
        // float b = 3.0; -> 에러
        // 자동 형 변환의 원칙은 표현범위가 좁은 데이터 타입에서
        // 넓은 데이터 타입으로의 변환만 허용된다는 것이다.
        // byte -> short -> int -> long -> float -> double
        // char -> int 형 변환 가능 : 문자가 가지고 있는 유니코드 값이 int로 변환된다.

        int a = 3;
        float b = 1.0F;
        double c = a + b;
        System.out.println(c);
        // 자동으로 형 변환이 되어 계산되었다.

        // 명시적 형 변환
        // float d = 100.0; -> 에러발생
        // int e = 100.0F; -> 에러발생
        // 위와 같은 경우 넓은 데이터 타입에서 좁은 데이터 타입으로의 변환이 되어야하는데
        // 그런 형 변환은 지원하지 않으므로 다음과 같이 명시적으로 형 변환을 시켜줘야 한다.
        float d = (float)100.0;
        int e = (int)100.0F;
    }
}
