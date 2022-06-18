package subsequences;

public class return_subsequences {

    public static String[] returnSubsequences(String str){

        if (str.length() == 0){
            String ans[] = {""};
            return ans;
        }

        String smallAns[] = returnSubsequences(str.substring(1));

        String ans[] = new String[2* smallAns.length];

        for (int i = 0; i < smallAns.length; i++){
            ans[i] = smallAns[i];
        }

        for (int i = 0; i < smallAns.length; i++){

            ans[i + smallAns.length] = str.charAt(0) + smallAns[i];
        }

        return ans;
    }

    public static void main(String[] args){

        String str = "xyz";

        String ans[] = returnSubsequences(str);

        for (int i = 0; i < ans.length; i++){
            System.out.println(ans[i]);
        }
    }

}
