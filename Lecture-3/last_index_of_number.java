package problems_2;
import java.util.Scanner;

public class last_index_of_number {


    public static int lastIndex_2(int input[], int x, int startIndex) {

        if (startIndex == input.length){
            return -1;
        }
        int smallAns = lastIndex_2(input, x, startIndex+1);

        if (smallAns == -1){
            return smallAns;
        }
        if (input[startIndex] == x){
            return startIndex;
        } else {
            return -1;
        }
    }

    public static int lastIndex(int input[], int x, int li) {

        if (li == 0){
            if (input[li] == x){
                return 0;
            } else {
                return -1;
            }
        }
        if (input[li] == x){
            return li;
        }

        int smallAns = lastIndex(input,x,li-1);

        return smallAns;
    }

    public static int lastIndex(int input[], int x){

       return lastIndex(input,x,input.length-1);
    }

    static Scanner s = new Scanner(System.in);

    public static int[] takeInput(){
        int size = s.nextInt();
        int[] input = new int[size];
        for(int i = 0; i < size; i++){
            input[i] = s.nextInt();
        }
        return input;
    }

    public static void main(String[] args) {
        int[] input = takeInput();
        int x = s.nextInt();
        System.out.println(last_index_of_number.lastIndex(input, x));
    }
}
