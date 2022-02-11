package problems;
import java.util.Scanner;
public class print_1_to_n {

    public static void print(int n){
        if(n == 1){
            System.out.print(n + " ");
            return;
        }
        print(n - 1);
        System.out.print(n + " ");
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        print_1_to_n.print(n);
    }
}
