package Tutorials;


import java.util.Objects;

public class Merge_Sort_LL {

    public static void main(String[] args) {

    }

    public static LinkedListNode<Integer> mergeSort(LinkedListNode<Integer> head) {

        if (head == null || head.next == null){
            return head;
        }

        LinkedListNode<Integer> slow = head;
        LinkedListNode<Integer> fast = head.next;

        while (!Objects.equals(fast, null) && !Objects.equals(fast.next, null)){

            slow = slow.next;
            fast = fast.next.next;
        }

        LinkedListNode<Integer> temp = slow.next;

        slow.next = null;

        LinkedListNode<Integer> head1 = mergeSort(head);
        LinkedListNode<Integer> head2 = mergeSort(temp);

        if (head1 == null){
            return head2;
        }

        if (head2 == null){
            return head1;
        }

        LinkedListNode<Integer> newHead = null, newTail = null;

        if (head1.data < head2.data){

            newHead = head1;
            newTail = head1;

            head1 = head1.next;

        } else {

            newHead = head2;
            newTail = head2;
            head2 = head2.next;
        }

        while (head1 != null && head2 != null) {

            if (head1.data < head2.data) {

                newTail.next = head1;
                newTail = newTail.next;
                head1 = head1.next;

            } else {

                newTail.next = head2;
                newTail = newTail.next;
                head2 = head2.next;
            }

        }

        if (head1 != null){
            newTail.next = head1;
        }

        if (head2 != null){
            newTail.next = head2;
        }

        return newHead;
    }
}

class LinkedListNode<T> {
    T data;
    LinkedListNode<T> next;

    public LinkedListNode(T data) {
        this.data = data;
    }
}
