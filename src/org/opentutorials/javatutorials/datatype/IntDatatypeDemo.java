package org.opentutorials.javatutorials.datatype;

public class IntDatatypeDemo {
    public static void main(String[] args)
    {
        byte a; // -128 ~ 127
        a = 127;
        // a = 128; -> 에러(표현가능범위를 넘어섰기 때문)

        // byte, short, int, long
        // 1byte, 2byte, 4byte, 8byte

        // 지정할 변수가 작은 숫자로도 표현 가능하다는 것을 알고 있다면 int보다 byte를 쓰면 메모리를 낭비하지 않을 수 있다.
        // 큰 숫자가 필요하면 long을 사용하여 에러를 피할 수 있다.

        int num_int = 2147483647;   // 4byte 사용
        long num_long = 2147483647; // 8byte 사용
    }
}
