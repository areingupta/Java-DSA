package Tutorials;

public class using_array {

    private int[] data;
    private int top;

    public using_array(){

        data = new int[10];
        top = -1;
    }

    public using_array(int capacity){

        data = new int[capacity];
        top = -1;
    }

    public boolean isEmpty(){

        return (top==-1);
    }

    public int size(){

        return top+1;
    }

    private int top(){

        if (size() == 0){
            throw new RuntimeException("Stack is Empty");
        }

        return data[top];
    }

    private void doubleCapacity(){

        int[] temp = data;

        data = new int[2* temp.length];

        for (int i = 0; i <= top; i++){
            data[i] = temp[i];
        }
    }

    public void push(int element){

        if (size() == data.length){
            throw new RuntimeException("Stack Full"); // or use double capacity (for dynamic sizing)
            // doubleCapacity();
        }
        top++;
        data[top] = element;
    }

    public void pop(){

        if (size() == 0){
            throw new RuntimeException("Stack Empty");
        }

        top--;
    }
}
