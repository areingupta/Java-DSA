package Tutorials;

import static Tutorials.Tut_3_Insert_Node.print;
import static Tutorials.Tut_3_Insert_Node.takeInputOptimised;

public class Insert_Node_Recursive {

    public static void main(String[] args) {

        Node<Integer> head = takeInputOptimised();

        head = insertNode(head, 2, 20);

        print(head);

    }

    public static Node<Integer> insertNode(Node<Integer> head, int pos, int element){

        if (pos == 0){

            Node<Integer> newNode = new Node<>(element);

            newNode.next = head;

            return newNode;
        }

        if (head == null){
            return head;
        }

        head.next = insertNode(head.next, pos-1, element);

        return head;

    }
}
