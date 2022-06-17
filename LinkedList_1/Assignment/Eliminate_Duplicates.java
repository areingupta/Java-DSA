package Assignment;

// Q.

// You have been given a singly linked list of integers where the elements are sorted in ascending order. Write a function that removes the consecutive duplicate values such that the given list only contains unique elements and returns the head to the updated list.
// Input format :
//The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.
//
//The first and the only line of each test case or query contains the elements(in ascending order) of the singly linked list separated by a single space.
// Remember/Consider :
//While specifying the list elements for input, -1 indicates the end of the singly linked list and hence, would never be a list element.
// Output format :
//For each test case/query, print the resulting singly linked list of integers in a row, separated by a single space.
//
//Output for every test case will be printed in a seperate line.
//Constraints :
//1 <= t <= 10^2
//0 <= M <= 10^5
//Time Limit: 1sec
//
//Where 'M' is the size of the singly linked list.
//Sample Input 1 :
//1
//1 2 3 3 3 3 4 4 4 5 5 7 -1
//Sample Output 1 :
//1 2 3 4 5 7
//Sample Input 2 :
//2
//10 20 30 40 50 -1
//10 10 10 10 -1
//Sample Output 2 :
//10 20 30 40 50
//10


import java.util.Objects;

public class Eliminate_Duplicates {

    public static LinkedListNode<Integer> removeDuplicates(LinkedListNode<Integer> head) {

        if (head == null){
            return head;
        }

        LinkedListNode<Integer> temp = head;

        while (temp.next != null){

            if (Objects.equals(temp.data, temp.next.data)){
                temp.next = temp.next.next;
            }
            else {
                temp = temp.next;
            }
        }

        return head;
    }

    public static void print(LinkedListNode<Integer> head){

        LinkedListNode<Integer> temp = head;

        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        LinkedListNode<Integer> node1 = new LinkedListNode<>(10);
        LinkedListNode<Integer> node2 = new LinkedListNode<>(20);
        LinkedListNode<Integer> node3 = new LinkedListNode<>(20);
        LinkedListNode<Integer> node4 = new LinkedListNode<>(30);
        LinkedListNode<Integer> node5 = new LinkedListNode<>(30);
        LinkedListNode<Integer> node6 = new LinkedListNode<>(40);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = null;

        LinkedListNode<Integer> head = node1;

        print(removeDuplicates(head));
    }
}
