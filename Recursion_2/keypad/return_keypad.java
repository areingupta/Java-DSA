package keypad;
import java.util.Scanner;

public class return_keypad {

    public static String[] keypad(int n){

        if (n == 0 || n == 1){
            String ans[] = {""};
            return ans;
        }
        int newN = n%10;

        String ans[] = keypad(n/10);

        String helpAns = helper(newN);

        String finalAns[] = new String[helpAns.length()*ans.length];

        int k = 0;

        for (int i = 0; i < ans.length; i++){

            for(int j = 0; j < helpAns.length() ; j++){

                finalAns[k] = ans[i] + helpAns.charAt(j);
                k++;
            }
        }
        return finalAns;
    }

    private static String helper(int newN){
        if(newN==2)
            return "abc";
        if(newN==3)
            return "def";
        if(newN==4)
            return "ghi";
        if(newN==5)
            return "jkl";
        if(newN==6)
            return "mno";
        if(newN==7)
            return "pqrs";
        if(newN==8)
            return "tuv";
        if(newN==9)
            return "wxyz";
        else
            return "";
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();
        String output[] = return_keypad.keypad(input);
        for(int i = 0; i < output.length; i++) {
            System.out.println(output[i]);
        }
    }
}
