import java.util.Scanner;
import java.util.ArrayList;
public class problem_1 {
    static int n;
    static int k;
    static int[] keys;
    static ArrayList<Integer>[] adj;
    static int ans = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) return;
        
        n = sc.nextInt();
        k = sc.nextInt();

        keys = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            keys[i] = sc.nextInt();
        }

        adj = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            adj[i] = new ArrayList<>();
        }

        for (int i = 0; i < n - 1; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            adj[u].add(v);
            adj[v].add(u);
        }

        dfs(1, 0, 0);

        System.out.println(ans);
    }

    static void dfs(int node, int parent, int currentXor) {
        int xorVal = currentXor ^ keys[node];

        if (xorVal >= k) {
            ans++;
        }

        for (int neighbor : adj[node]) {
            if (neighbor != parent) {
                dfs(neighbor, node, xorVal);
            }
        }
    }
}
