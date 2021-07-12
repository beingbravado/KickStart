import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Queue;

public class CuttingInterval {
    public static class pair {
        int x, y;

        pair(int a, int b) {
            x = a;
            y = b;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int tt = Integer.parseInt(br.readLine());
        for (int t = 1; t <= tt; t++) {
            String[] s0 = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s0[0]);
            long c = Long.parseLong(s0[1]);

            int[] l = new int[n];
            int[] r = new int[n];
            int left = Integer.MAX_VALUE, right = Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                String[] s1 = br.readLine().trim().split(" ");
                l[i] = Integer.parseInt(s1[0]);
                r[i] = Integer.parseInt(s1[1]);
                left = Math.min(left, l[i]);
                right = Math.max(right, r[i]);
            }
            int[] count = new int[(int) right - (int) left + 1];
            for (int i = 0; i < n; i++) {
                for (int j = (int) l[i] + 1; j < (int) r[i]; j++) {
                    count[j - (int) left]++;
                }
            }
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < count.length; i++) {
                if (count[i] > 0) {
                    map.put(count[i], map.getOrDefault(count[i], 0) + 1);
                }
            }
            long ans = n;
            Queue<pair> pq = new PriorityQueue<>(count.length, (a, b) -> a.x > b.x ? -1 : 1);
            for (int x : map.keySet()) {
                pq.add(new pair(x, map.get(x)));
            }

            while (!pq.isEmpty() && c > 0) {
                pair p = pq.poll();
                if (c >= p.y) {
                    ans += p.x * p.y;
                    c -= p.y;
                } else {
                    ans += p.x * c;
                    c = 0;
                }
            }

            sb.append("Case #" + t + ": " + ans);
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
