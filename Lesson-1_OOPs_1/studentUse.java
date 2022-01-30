package classes_and_objects;

import java.util.Scanner;

// We're not using import student.java because it's in same package. If it was not we would have used,
// import classes_and_objects.student;

public class studentUse {

    public static void main(String[] args){

        Scanner s = new Scanner(System.in);

//        student st1 = new student(); // error because we modified constructor

        student st1 = new student("arein", 123); //n and rn are necessary now.

        st1.name = "Arein";

//        st1.rollNumber = 123;

//        st1.setRollNumber(123); // access modifier lesson part

//        student st2 = new student();

        System.out.println(st1);
        System.out.println(st1.name);

        st1.print();

//        System.out.println(st1.rollNumber);

        System.out.println(st1.getRollNumber());
    }

}
