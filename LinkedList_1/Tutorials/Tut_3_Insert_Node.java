package Tutorials;

import java.util.Scanner;

public class Tut_3_Insert_Node {

    public static Node<Integer> insertNode(Node<Integer> head, int data, int position){

        Node<Integer> newNode = new Node<>(data);

        if (position == 0) {

            newNode.next = head;

            return newNode;
        }

        Node<Integer> temp = head;

        int i = 0;

        while (temp != null && i < position-1){

            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;

        return head;
    }

    public static void main(String[] args) {

        Node<Integer> head = takeInputOptimised();

        print(head);

        head = insertNode(head, 14, 3);

        print(head);

    }

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
}
