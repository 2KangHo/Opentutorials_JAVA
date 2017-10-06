package org.opentutorials.javatutorials.scope;

public class ScopeDemo4 {
    static void a() {
        String title = "coding everybody";
    }

    public static void main(String[] args) {
        a();
        //System.out.println(title);
        // title은 a()의 지역변수이므로 여기서는 유효하지 않다.
    }
}
