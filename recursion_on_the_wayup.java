
import java.util.*;
public class recursion_on_the_wayup {

    public static void main(String[] args)  {
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        printSS(s, "");
    }

    public static void printSS(String str, String ans) {
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }
        char ch = str.charAt(0);    //a
        String ros = str.substring(1);  //bc
        printSS(ros, ans + ch);
        printSS(ros, ans);

    }

} 

