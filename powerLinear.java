import java.util.*;
public class powerLinear {
    public static int power(int x,int n){
        if(n==0){
            return 1;
        }
        int recAns= power(x, n-1);
        int myAns= recAns*x;
        return myAns;
    }
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int x= scn.nextInt();
        int n= scn.nextInt();
        int ans=power(x,n);
        System.out.println(ans);
    }
}
