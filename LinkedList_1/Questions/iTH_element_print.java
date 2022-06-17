package Questions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


// For a given a singly linked list of integers and a position 'i', print the node data at the 'i-th' position.
// Note :
//Assume that the Indexing for the singly linked list always starts from 0.
//
//If the given position 'i',  is greater than the length of the given singly linked list, then don't print anything.
//Input format :
//The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.
//
//The first line of each test case or query contains the elements of the singly linked list separated by a single space.
//
//The second line contains the value of 'i'. It denotes the position in the given singly linked list.
// Remember/Consider :
//While specifying the list elements for input, -1 indicates the end of the singly linked list and hence, would never be a list element.
//Output format :
//For each test case, print the node data at the 'i-th' position of the linked list(if exists).
//
//Output for every test case will be printed in a seperate line.
// Constraints :
//1 <= t <= 10^2
//0 <= N <= 10^5
//i  >= 0
//Time Limit: 1sec
//Sample Input 1 :
//1
//3 4 5 2 6 1 9 -1
//3
//Sample Output 1 :
//2
//Sample Input 2 :
//2
//3 4 5 2 6 1 9 -1
//0
//9 8 4 0 7 8 -1
//3
//Sample Output 2 :
//3
//0



class LinkedListNode_2<T> {
    T data;
    LinkedListNode_2<T> next;

    public LinkedListNode_2(T data) {
        this.data = data;
    }
}

public class iTH_element_print {

    public static void printIthNode(LinkedListNode_2<Integer> head, int i){

        int position = 0;

        LinkedListNode_2<Integer> temp = head;

        while (temp != null && position < i){

            temp = temp.next;
            position++;
        }

        if (temp != null){
            System.out.println(temp.data);
        }
    }

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static LinkedListNode_2<Integer> takeInput() throws IOException {
        LinkedListNode_2<Integer> head = null, tail = null;

        String[] datas = br.readLine().trim().split("\\s");

        int i = 0;
        while(i < datas.length && !datas[i].equals("-1")) {
            int data = Integer.parseInt(datas[i]);
            LinkedListNode_2<Integer> newNode = new LinkedListNode_2<>(data);
            if(head == null) {
                head = newNode;
                tail = newNode;
            }
            else {
                tail.next = newNode;
                tail = newNode;
            }
            i += 1;
        }

        return head;
    }

    public static void print(LinkedListNode_2<Integer> head){
        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        int t = Integer.parseInt(br.readLine().trim());

        while (t > 0) {

            LinkedListNode_2<Integer> head = takeInput();
            int i = Integer.parseInt(br.readLine().trim());
            iTH_element_print.printIthNode(head, i);

            t -= 1;
        }
    }
}
