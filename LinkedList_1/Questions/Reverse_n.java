package Questions.Reverse_LL;

public class Reverse_n {

    public static void main(String[] args) {

    }

    public static Node<Integer> reverse_n(Node<Integer> head){

        if (head == null || head.next == null){

            return head;
        }

        Node<Integer> reversedTail = head.next;

        Node<Integer> newHead = reverse_n(head.next);

        reversedTail.next = head;
        head.next = null;

        return newHead;
    }
}
