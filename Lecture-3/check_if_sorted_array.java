package problems;

public class check_if_sorted_array {

    public static boolean checkSorted(int arr[]){ // METHOD-1

        if (arr.length <= 1){
            return true;
        }

        int smallArr[] = new int[arr.length-1];

        for (int i = 1; i < arr.length; i++){
            smallArr[i-1] = arr[i];
        }

        boolean smallAns = checkSorted(smallArr);

        if (!smallAns){
            return false;
        }

        if (arr[0] <= arr[1]){
            return true;
        } else {
            return false;
        }

    }

    public static boolean checkSorted_2(int arr[]) { // METHOD-2

        if (arr.length <= 1) {
            return true;
        }

        if (arr[0] > arr[1]) {
            return false;
        }

        int smallArr[] = new int[arr.length - 1];

        for (int i = 1; i < arr.length; i++) {
            smallArr[i - 1] = arr[i];
        }

        boolean smallAns = checkSorted_2(smallArr);

        return smallAns;
    }


    public static void main(String[] args){

        int input[] = {1,1,3,6,9};

        System.out.println(checkSorted(input));

        System.out.println(checkSorted_2(input));

    }

}
