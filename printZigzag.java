import java.util.*;
public class printZigzag {
    public static void powerLog(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        powerLog(n-1);
        System.out.println(n);
        powerLog(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int n= scn.nextInt();
        powerLog(n);
    }
}
