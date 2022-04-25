import java.util.*;

public class recursion_in_array {
    public static void recursioninarray(int arr[], int idx) {
        if (idx == arr.length) {
            return;
        }
        System.out.println(arr[0]);
        recursioninarray(arr, idx + 1);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();

        }
        recursioninarray(arr, 0);
    }
}
