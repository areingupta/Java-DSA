package Tutorials;

public class stack_use {

    public static void main(String[] args) {

        using_array s = new using_array();

        for (int i = 0; i <= 5; i++){

            s.push(i);
        }

        System.out.println(s.isEmpty());

    }
}
