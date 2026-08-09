import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Arrays;

public class problem_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) return;
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();

        ArrayList<Integer>[] adj = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            adj[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            adj[u].add(v);
            adj[v].add(u);
        }

        int[] dist = new int[n + 1];
        Arrays.fill(dist, -1);

        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        dist[1] = 0;

        int count = 0;

        while (!q.isEmpty()) {
            int curr = q.poll();

            if (dist[curr] <= d) {
                count++;
            }

            if (dist[curr] == d) {
                continue;
            }

            for (int neighbor : adj[curr]) {
                if (dist[neighbor] == -1) {
                    dist[neighbor] = dist[curr] + 1;
                    q.add(neighbor);
                }
            }
        }

        System.out.println(count);
    }
}
