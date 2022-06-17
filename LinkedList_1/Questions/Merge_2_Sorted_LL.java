package Questions;

public class Merge_2_Sorted_LL {

    public static void main(String[] args) {


    }

    public static LinkedListNode<Integer> mergeTwoSortedLinkedLists(LinkedListNode<Integer> head1, LinkedListNode<Integer> head2) {

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
                newTail = newTail.next; // or head1
                head1 = head1.next;

            } else {

                newTail.next = head2;
                newTail = newTail.next; // or head2
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
