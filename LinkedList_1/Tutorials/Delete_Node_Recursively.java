package Tutorials;

public class Delete_Node_Recursively {

    public static void main(String[] args) {

    }

    public static Node<Integer> delete(Node<Integer> head, int pos){

        if (pos == 0){

            return head.next;
        }

        if (head == null){
            return head;
        }

        head.next = delete(head.next, pos - 1);

        return head;
    }
}
