package AssignmentOne;


import java.util.*;

public class Problem2 {
    public static int solve(int[] arr, int k) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            if (arr[i] % k != arr[0] % k) return -1;
        }

        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = arr[i] / k;
        }

        Arrays.sort(b);
        int median = b[n / 2];

        int ops = 0;
        for (int x : b) {
            ops += Math.abs(x - median);
        }

        return ops;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();
        System.out.println(solve(arr, k));
    }
}