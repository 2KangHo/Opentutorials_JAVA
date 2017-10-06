package org.opentutorials.javatutorials.Inheritance.example5;

/**
 * 상속은 상위 클래스의 기능을 하위 클래스에게 물려주는 기능이다.
 * 그렇다면 하위 클래스는 상위 클래스의 메소드를 주어진 그대로 사용해야 할까?
 * 만약 그래야 한다면 제약이 상당할 것이다.
 * 이런 제약을 벗어나려면 하위 클래스가 부모 클래스의 기본적인 동작방법을 변경할 수 있어야 한다.
 * 이런 맥락에서 도입된 기능이 메소드 오버라이딩(overriding)이다.
 */
class Calculator {
    int left, right;

    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public void sum() {
        System.out.println(this.left + this.right);
    }

    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
}

/**
 * 하위 클래스 입장에서 부모 클래스란 말하자면 기본적인 동작 방법을 정의한 것이라고 생각할 수 있다.
 * 하위 클래스에서 상위 클래스와 동일한 메소드를 정의하면
 * 부모 클래스로부터 물려 받은 기본 동작 방법을 변경하는 효과를 갖게 된다.
 * 기본동작은 폭넓게 적용되고, 예외적인 동작은 더 높은 우선순위를 갖게하고 있다.
 */
class SubstractionableCalculator extends Calculator {
    public void sum() {
        System.out.println("실행 결과는 " +(this.left + this.right)+"입니다.");
    } // 메소드 오버라이딩(overriding)

    public void substract() {
        System.out.println(this.left - this.right);
    }
}

public class CalculatorDemo {
    public static void main(String[] args) {
        SubstractionableCalculator c1 = new SubstractionableCalculator();
        c1.setOprands(10, 20);
        c1.sum();
        c1.avg();
        c1.substract();
    }
}
