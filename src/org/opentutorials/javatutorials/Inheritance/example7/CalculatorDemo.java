package org.opentutorials.javatutorials.Inheritance.example7;

class Calculator{
    int left, right;
    int third = 0;

    public void setOprands(int left, int right){
        System.out.println("setOprands(int left, int right)");
        this.left = left;
        this.right = right;
    }

    // setOprands를 오버로딩(overloading) 하였다.
    public void setOprands(int left, int right, int third){
        System.out.println("setOprands(int left, int right, int third)");
        //this.left = left;
        //this.right = right;
        // setOprands(int left, int right) 메소드와 중복이 있으므로
        // 아래와 같이 쓰는 것이 로직의 재활용성과 유지보수의 편리성을 갖춘 것이다.
        this.setOprands(left, right);
        this.third = third;
    }

    public void sum(){
        System.out.println(this.left+this.right+this.third);
    }

    public void avg(){
        System.out.println((this.left+this.right+this.third)/3);
    }
}

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        c1.setOprands(10, 20);
        c1.sum();
        c1.avg();
        c1.setOprands(10, 20, 30);
        c1.sum();
        c1.avg();
    }
}