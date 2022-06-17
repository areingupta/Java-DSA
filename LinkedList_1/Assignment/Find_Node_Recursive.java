package Assignment;

public class Find_Node_Recursive {

    public static void main(String[] args) {

    }

    public static int findNodeRec(LinkedListNode<Integer> head, int n) {

        if (head == null){
            return -1;
        }
        if (head.data.equals(n)){
            return 0;
        }

        int smallAns = findNodeRec(head.next, n);

        if (smallAns == -1){
            return -1;
        }

        return smallAns + 1;
    }
}
