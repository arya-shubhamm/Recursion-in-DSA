import java.util.*;
public class factorial {
    public static int factoriall(int n){
        if(n==1){
            return 1;
        }
        int recans= factoriall(n-1);
        int myans= n*recans;
        return myans;
    }
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int n = scn.nextInt();
        int ans = factoriall(n);
        System.out.print(ans);
    }
}
