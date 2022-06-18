package sorting;
import java.util.Scanner;

public class quick_sort {

    public static int partition(int input[], int si, int ei){

        // Find pivot
        int pivot = input[si];
        int counter = 0;
        for (int i = si+1; i < input.length; i++){
            if (input[i] <= input[si]){
                counter++;
            }
        }
        int pivotPos = si + counter;
        int i = si;
        int j = ei;
        while (i < pivotPos && j > pivotPos){

            if (input[i] < pivot){
                i++;
            }
            if (input[j] > pivot){
                j--;
            }
            if (input[i] > pivot && input[j] < pivot){
                int temp = input[i];
                input[i] = input[j];
                input[j] = temp;
            }
        }
        return pivotPos;
    }

    public static void quickSort(int input[], int si, int ei){

        if (si >= ei){
            return;
        }

        int pivotPos = partition(input, si, ei);

        quickSort(input, si, pivotPos-1);
        quickSort(input, pivotPos+1, ei);
    }

    public static void quickSort(int input[]){

        quickSort(input, 0, input.length-1);
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
        quick_sort.quickSort(input);
        for(int i = 0; i < input.length; i++) {
            System.out.print(input[i] + " ");
        }
    }

}
