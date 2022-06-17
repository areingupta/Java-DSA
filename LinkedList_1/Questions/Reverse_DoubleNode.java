package Questions.Reverse_LL;

class DoubleNode {
    Node<Integer> head;
    Node<Integer> tail;
}

public class Reverse_DoubleNode {

    public static void main(String[] args) {

    }

    public static DoubleNode reverse_doubleNode(Node<Integer> head){

        if (head == null || head.next == null){

            DoubleNode ans = new DoubleNode();
            ans.head = head;
            ans.tail = head;

            return ans;
        }

        DoubleNode smallAns = reverse_doubleNode(head.next);

        smallAns.tail.next = head;
        head.next = null;

        DoubleNode ans = new DoubleNode();

        ans.tail = head;
        ans.head = smallAns.head;

        return ans;
    }
}
