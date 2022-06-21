package Tutorials;

import java.util.ArrayList;
import java.util.Arrays;

public class Tut_1 {

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();

        System.out.println(list1.size());

        list1.add(15);
        list1.add(20);
        list1.add(25);
        list1.add(2,50);

        System.out.println(list1.size());

        System.out.println(list1.get(2));

        list1.remove(3);

        for (int integer : list1) {

            System.out.print(integer + " ");
        }

        System.out.println();

        list1.set(0,18);

        for (Integer integer : list1) {

            System.out.print(integer + " ");
        }

    }
}
