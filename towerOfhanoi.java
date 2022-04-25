import java.util.*;
public class towerOfhanoi {
    public static void hoi(int n, int A, int B, int C){
        if(n==0){
            return ;
        }
        hoi((n-1), A, C,B );
        System.out.println(n+"["+A+"-->"+B+"]");
        hoi((n-1),C,B,A);
        
    }
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int n= scn.nextInt();
        int A=scn.nextInt();
        int B=scn.nextInt();
        int C=scn.nextInt();
        hoi(n,A,B,C);
    }
}
