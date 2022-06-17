package Tutorials;

import java.util.Scanner;

public class Tut_2 {

    // TC = O(n^2)

    public static Node<Integer> takeInput(){

        Node<Integer> head = null;

        Scanner s = new Scanner(System.in);
        int data = s.nextInt();

        while (data != -1){

            Node<Integer> newNode = new Node<>(data);

            if (head == null){

                head = newNode;
            }
            else {
                Node<Integer> temp = head;

                while (temp.next != null){

                    temp = temp.next;
                }
                temp.next = newNode;
            }
            data = s.nextInt();
        }

        return head;
    }

    // TC = O(n)

    public static Node<Integer> takeInputOptimised(){

        Node<Integer> head = null, tail = null;

        Scanner s = new Scanner(System.in);
        int data = s.nextInt();

        while (data != -1){

            Node<Integer> newNode = new Node<>(data);

            if (head == null){

                head = newNode;
                tail = newNode;
            }
            else {
//                Node<Integer> temp = head;
//
//                while (temp.next != null){
//
//                    temp = temp.next;
//                }
//                temp.next = newNode;
                tail.next = newNode;
                tail = newNode; // or tail = tail.next
            }

            data = s.nextInt();
        }

        return head;
    }

    public static void print(Node<Integer> head){

        Node<Integer> temp = head;

        while (head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }

        System.out.println();

    }

    public static void main(String[] args) {

        Node<Integer> head = takeInputOptimised();

        print(head);
    }


}
