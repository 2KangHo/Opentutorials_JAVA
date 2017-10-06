package org.opentutorials.javatutorials.Inheritance.example1;

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

// 클래스 Calculator를 상속받는 클래스.
// 상속받을 때 JAVA에서는 extends를 사용한다.
class SubstractionableCalculator extends Calculator {
    public void substract() {
        System.out.println(this.left - this.right);
    }
}

public class CalculatorDemo1 {
    public static void main(String[] args) {
        SubstractionableCalculator c1 = new SubstractionableCalculator();
        c1.setOprands(10, 20);
        c1.sum();
        c1.avg();
        c1.substract();
    }
}


/**
 * 기존의 객체를 그대로 유지하면서 어떤 기능을 추가하는 방법이 없을까? 이런 맥락에서 등장하는 것이 상속이다.
 * 즉 기존의 객체를 수정하지 않으면서 새로운 객체가 기존의 객체를 기반으로 만들어지게 되는 것이다.
 * 이때 기존의 객체는 기능을 물려준다는 의미에서 부모 객체가 되고
 * 새로운 객체는 기존 객체의 기능을 물려받는다는 의미에서 자식 객체가 된다.
 *
 * 부모 클래스와 자식 클래스의 관계를 상위(super) 클래스와 하위(sub) 클래스라고 표현하기도 한다.
 * 또한 기초 클래스(base class), 유도 클래스(derived class)라고도 부른다.
 */