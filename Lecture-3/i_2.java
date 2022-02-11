package introduction;

public class i_2 {

    // Sum of n natural numbers

    public static int sum(int n){

        if (n == 1){
            return 1;
        }

        int smallSum = sum(n-1);
        return n + smallSum;
    }

    public static void main(String[] args){

        int n = 4;

        int ans = sum(n);

        System.out.println(ans);
    }
}
