package Assignment;

public class Swap_Nodes {

    public static void main(String[] args) {

    }

    public static LinkedListNode<Integer> swapNodes(LinkedListNode<Integer> head, int i, int j) {

        if (i == j){
            return head;
        }

        LinkedListNode<Integer> currNode = head, prev = null;

        LinkedListNode<Integer> firstNode = null, secondNode = null, firstNodePrev = null, secondNodePrev = null;

        int pos = 0;

        while (currNode != null){

            if (pos == i){
                firstNodePrev = prev;
                firstNode = currNode;

            } else if (pos == j){
                secondNodePrev = prev;
                secondNode = currNode;

            }
            prev = currNode;
            currNode = currNode.next;
            pos+=1;
        }

        if (firstNodePrev != null){

            firstNodePrev.next = secondNode;

        } else {
            head = secondNode;
        }

        if (secondNodePrev != null){

            secondNodePrev.next = firstNode;

        } else {
            head = firstNode;
        }

        LinkedListNode<Integer> currFirstNode = secondNode.next;
        secondNode.next = firstNode.next;
        firstNode.next = currFirstNode;

        return head;
    }
}
