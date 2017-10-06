package org.opentutorials.javatutorials.operator;

public class PrePostDemo {
    public static void main(String[] args) {
        int i = 3;
        i++;
        System.out.println(i);      // 4 출력
        ++i;
        System.out.println(i);      // 5 출력
        System.out.println(++i);    // 6 출력 (println이 실행되기 전에 1 증가된다.)
        System.out.println(i++);    // 6 출력 (println이 실행되고 나서(이 라인(11번 라인)이 끝날 때) 1 증가된다.)
        System.out.println(i);      // 7 출력
    }
}
