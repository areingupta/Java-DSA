package Tutorials;

import java.util.Stack;

public class using_Collections {

    public static void main(String[] args) {

        Stack<Integer> newStack = new Stack<>();

        int[] arr = {1,2,3,4};

        for (int i = 0; i < arr.length; i++){

            newStack.push(arr[i]);
        }

        while (!newStack.isEmpty()){
            System.out.println(newStack.pop());
        }
    }
}
