package org.opentutorials.javatutorials.Inheritance.example6;

class Calculator {
    int left, right;

    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public void sum() {
        System.out.println(this.left + this.right);
    }

    public int avg() {
        return ((this.left + this.right) / 2);
    }
}

class SubstractionableCalculator extends Calculator {
    public void sum() {
        System.out.println("실행 결과는 " +(this.left + this.right)+"입니다.");
    } // 메소드 오버라이딩(overriding)

    public int avg() {
        return super.avg(); // super를 이용해서 부모 클래스의 메소드도 불러들일 수 있다.
    }
    public void substract() {
        System.out.println(this.left - this.right);
    }
}

public class CalculatorDemo {
    public static void main(String[] args) {
        SubstractionableCalculator c1 = new SubstractionableCalculator();
        c1.setOprands(10, 20);
        c1.sum();
        System.out.println("실행 결과는 "+c1.avg());
        c1.substract();
    }
}
