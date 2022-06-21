package Tutorials.using_LL;

public class usingLL<T> {

    private Node<T> head;

    private int size;

    public usingLL(){

        head = null;
        size = 0;
    }

    int size(){

        return size;
    }

    boolean isEmpty(){

        return size == 0; // return head == null;
    }

    T top(){

        if (head == null){

            throw new RuntimeException("Stack Empty");
        }

        return head.data;
    }

    void push(T element){

        Node<T> newNode = new Node<>(element);

        newNode.next = head;

        head = newNode;

        size++;
    }

    T pop(){

        if (size() == 0){

            throw new RuntimeException("Stack Empty");
        }

        T temp = head.data;

        head = head.next;

        size--;

        return temp;

    }

}
