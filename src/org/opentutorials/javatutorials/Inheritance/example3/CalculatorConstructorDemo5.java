package org.opentutorials.javatutorials.Inheritance.example3;

class Calculator {
    int left, right;

    // 하위 클래스가 호출될 때 자동으로 상위 클래스의 기본 생성자를 호출하게 된다.
    // 그런데 상위 클래스에 매개변수가 있는 생성자가 있다면
    // 자바는 자동으로 상위 클래스의 기본 생성자를 만들어주지 않는다.
    // 따라서 존재하지 않는 생성자를 호출하게 되기 때문에 에러가 발생한다.
    // 이 문제를 해결하기 위해서는 아래와 같이 상위 클래스에 기본 생성자를 추가하면 된다.
    // 하지만 super를 이용했기 때문에 추가하지 않아도 된다.
    // public Calculator () {}

    public Calculator(int left, int right){
        this.left = left;
        this.right = right;
    }

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

class SubstractionableCalculator extends Calculator {
    public SubstractionableCalculator(int left, int right) {
        //this.left = left;
        //this.right = right;
        super(left, right);
        /*
        *   super 키워드는 부모 클래스를 의미한다. 여기에 ()를 붙이면 부모 클래스의 생성자를 의미하게 된다.
        *   이렇게 하면 부모 클래스의 기본 생성자가 없어져도 오류가 발생하지 않는다.
        *
        *   하위 클래스의 생성자에서 super를 사용할 때 주의할 점은 super가 가장 먼저 나타나야 한다는 점이다.
        *   초기화 되는 코드가 super 위에 오면 안된다.
        *   즉 부모가 초기화되기 전에 자식이 초기화되는 일을 방지하기 위한 정책이라고 생각하자.
        */
    }

    public void substract() {
        System.out.println(this.left - this.right);
    }
}

public class CalculatorConstructorDemo5 {
    public static void main(String[] args) {
        SubstractionableCalculator c1 = new SubstractionableCalculator(10, 20);
        c1.sum();
        c1.avg();
        c1.substract();
    }
}
