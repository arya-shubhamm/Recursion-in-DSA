import java.util.*;
public class increasing {
    public static void increasingg(int n){
        if(n==0){
            return ;
        }
      increasingg(n-1);
      System.out.println(n);
      
      
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();
        increasingg(n);
    }
}