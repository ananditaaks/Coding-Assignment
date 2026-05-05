package AssignmentOne;

import java.util.*;

public class Problem1 {
    public static int solve(String s) {
        int n = s.length();
        String t = s + s;

        Set<Character> set = new HashSet<>();
        int left = 0, sum = 0, maxSum = 0;

        for (int right = 0; right < t.length(); right++) {
            while (set.contains(t.charAt(right)) || right - left + 1 > n) {
                sum -= (t.charAt(left) - 'a' + 1);
                set.remove(t.charAt(left));
                left++;
            }

            set.add(t.charAt(right));
            sum += (t.charAt(right) - 'a' + 1);
            maxSum = Math.max(maxSum, sum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(solve(s));
    }
}
