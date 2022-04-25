import java.util.*;

public class DiasplayreverseArray {
    public static void DisplayreverseArray(int arr[], int idx) {
        if (idx == arr.length) {
            return;

        }
        DisplayreverseArray(arr, idx + 1);
        System.out.println(arr[idx]);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        DisplayreverseArray(arr, 0);
    }

}
