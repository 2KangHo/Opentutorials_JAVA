package org.opentutorials.javatutorials.compare;

public class EqualStringDemo {
    public static void main(String[] args) {
        // .equals는 문자열을 비교할 때 사용하는 메소드다.
        String a = "Hello world";
        String b = new String("Hello world");
        System.out.println(a == b);         // false
        System.out.println(a.equals(b));    // true

        String c = "Hello world";
        System.out.println(a == b);         // false

        /*
        * 변수 a와 b에 각각 문자열을 생성해서 저장했다.
        * 변수 b에 문자열을 만드는 방법은 생성자를 이용하고 있다.
        * 지금은 new String의 괄호 안에 문자열을 넣으면 문자열을 생성할 수 있다고만 알아두자.
        * ==은 두개의 데이터 타입이 동일한 객체인지를 알아내기 위해서 사용하는 연산자이기 때문에
        * b에 담긴 객체와 일치하지 않는 것이다. 이를 보안하는 비교 방법이 equals이고
        * 이를 이용해서 서로 다른 객체들간에 값이 같은지를 비교할 수 있다.
        * 이 이야기는 지금 단계에서는 이해하기 다소 어려움이 있다.
        * 문자와 문자를 비교할 때는 '=='를 사용하지 않고 .equals를 사용한다고 일단은 알아두자.
        * */
    }
}
