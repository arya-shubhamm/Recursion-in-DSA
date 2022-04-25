import java.util.*;
public class increasingDecreasing {
    public static void increasingDecreaing(int n){
        if(n==0){
            return ;
        }
        System.out.println(n);
        increasingDecreaing(n-1);
        System.out.println(n);
        
    }
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int n= scn.nextInt();
        increasingDecreaing(n);
    }
}
