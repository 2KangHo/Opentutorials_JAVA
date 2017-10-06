package org.opentutorials.javatutorials.object;

public class CalculatorDemo2 {
    public static void sum(int left, int right) {
        System.out.println(left + right);
    }

    public static void main(String[] args) {
        sum(10, 20);
        sum(20, 40);
    }
}
// 이것은 중복을 제거하기 위해 메소드화 시킨 것이다.
// CalculatorDemo의 중복된 부분을 메소드화를 시켜 refactoring한 코드이다.