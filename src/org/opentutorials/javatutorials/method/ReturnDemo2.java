package org.opentutorials.javatutorials.method;

public class ReturnDemo2 {
    public static String[] getMembers() {
        String[] members = { "최진혁", "최유빈", "한이람" };
        return members;
    }

    public static void main(String[] args) {
        String[] members = getMembers();

        for(int i = 0; i < 3; i++)
            System.out.println(members[i]);
    }
}