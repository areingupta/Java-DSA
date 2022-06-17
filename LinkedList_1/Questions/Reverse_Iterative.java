package Questions.Reverse_LL;

public class Reverse_Iterative {

    public static void main(String[] args) {

    }

    public static Node<Integer> reverse_Iterative(Node<Integer> head){

        Node<Integer> curr = head;
        Node<Integer> prev = null;

        Node<Integer> temp;

        while (curr != null){

            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        return prev;
    }
}
