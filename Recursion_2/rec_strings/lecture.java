package recursion_and_strings;

public class lecture {

    public static String removeX(String s){

        if (s.length() == 1){
            if (s.charAt(0)  == 'x'){
                return "";
            }
            else {
                return s;
            }
        }

        String smallAns = removeX(s.substring(1));

        if (s.charAt(0) == 'x'){
            return smallAns;
        } else {
            return s.charAt(0) + smallAns;
        }

    }

    public static void main(String[] args){

        String s = "xxxx";

        System.out.println(removeX(s));
    }

}
