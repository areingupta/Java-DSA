package problems;

public class mcq_prob {
    public static void print(int n){
        if(n < 0){
            return;
        }
        if(n == 0){
            System.out.println(n);
            return;
        }
        print(--n);   // because of post-decrement, the same n is being sent as argument again and again !
        System.out.print(n+" ");
    }

    public static void main(String[] args) {
        int num = 3;
        print(num);
    }

}
