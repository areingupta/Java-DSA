package problems;

public class check_if_sorted_array_better {

    public static boolean checkSortedBetter(int arr[], int startIndex){

        if (startIndex >= arr.length-1){
            return true;
        }
        if (arr[startIndex] > arr[startIndex+1]){
            return false;
        }

        boolean smallAns = checkSortedBetter(arr, startIndex+1);
        return smallAns;

    }

    public static boolean checkSortedBetter(int arr[]){   // Helper function using overloading to prevent the need of entering startIndex by user.

        return checkSortedBetter(arr,0);
    }


    public static void main(String[] args){

        int input[] = {1,2,3,4};
        System.out.println(checkSortedBetter(input));
    }

}
