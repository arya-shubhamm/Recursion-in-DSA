
import java.io.*;
import java.util.*;

public class recursion001 {
    public static void printdecreasing(int n) {
        if (n == 0) {
            return;

        }
        System.out.println(n);
        printdecreasing(n - 1);
    }

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        printdecreasing(n);
    }

}
