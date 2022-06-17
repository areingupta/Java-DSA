package Tutorials;

import java.util.Arrays;

public class Tut_1 {

    public static void print(Node<Integer> head){

        Node<Integer> temp = head; // We make temp to store the ref of first node for use in any other case

        while (head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }

        System.out.println();

    }

    public static void main(String[] args) {

        Node<Integer> node1 = new Node<>(10);

        System.out.println(node1.data);
        System.out.println(node1.next);

        Node<Integer> node2 = new Node<>(20);

        Node<Integer> node3 = new Node<>(30);

        node1.next = node2;

        node2.next = node3;

        System.out.println(node2);
        System.out.println(node1.next);

        Node<Integer> head = node1;

        print(head);

    }
}

class Node<T> {

    T data;
    Node<T> next;

    Node (T data){

        this.data = data;

        next = null;
    }
}
