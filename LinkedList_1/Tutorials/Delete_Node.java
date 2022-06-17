package Tutorials;

public class Delete_Node {

    public static void main(String[] args) {

    }

    public static Node<Integer> deleteNode(Node<Integer> head, int pos){

        if (head == null){
            return head;
        }

        if (pos == 0){

            return head.next;
        }

        Node<Integer> temp = head;

        int i = 0;

        while (temp != null && i < pos-1){

            temp = temp.next;
            i++;
        }

        if (temp == null || temp.next == null){

            return head;
        }

        temp.next = temp.next.next;

        return head;
    }
}
