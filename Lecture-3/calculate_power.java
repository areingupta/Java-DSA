package problems;

import java.util.Scanner;

public class calculate_power {

    public static int power(int x, int n){

        if (n == 0){
            return 1;
        }

        int smallPower = power(x,n-1);
        return smallPower*x;
    }

    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int x = s.nextInt();
        int n = s.nextInt();

        System.out.println(calculate_power.power(x, n));
    }

}
