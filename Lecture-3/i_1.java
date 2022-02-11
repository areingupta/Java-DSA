package introduction;

public class i_1 {

    // To calculate factorial

    public static int fact(int n){

        if (n==0){
            return 1;
        }

        int smallAns = fact(n-1);

        return n*smallAns;
    }

    public static void main(String[] args){

        int n = 4;

        int result = fact(n);

        System.out.println(result);

    }

}
