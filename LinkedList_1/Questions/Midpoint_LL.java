package Questions;

import java.util.Objects;

public class Midpoint_LL {

    public static void main(String[] args) {

    }

    public static LinkedListNode<Integer> midPoint(LinkedListNode<Integer> head) {

        if (head == null || head.next == null){
            return head;
        }

        LinkedListNode<Integer> slow = head;
        LinkedListNode<Integer> fast = head;

        // OR
//        LinkedListNode<Integer> slow = head;
//        LinkedListNode<Integer> fast = head.next;

//        while (!Objects.equals(fast, null) && !Objects.equals(fast.next, null)){
//
//            slow = slow.next;
//            fast = fast.next.next;
//        }


        while (!Objects.equals(fast.next, null) && !Objects.equals(fast.next.next, null)){

            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}
