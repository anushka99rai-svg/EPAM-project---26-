import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }

        if (n == 1) {
            System.out.println(arr[0]);
            return;
        }

        long prev2 = arr[0];
        long prev1 = Math.max(arr[0], arr[1]);

        for (int i = 2; i < n; i++) {
            long current = Math.max(prev1, prev2 + arr[i]);
            prev2 = prev1;
            prev1 = current;
        }

        System.out.println(prev1);
    }
}
