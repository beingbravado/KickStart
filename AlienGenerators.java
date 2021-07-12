import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AlienGenerators {
    public static void main(String[] args) throws IOException {
        // Scanner scan= new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int tt = Integer.parseInt(br.readLine());
        for (int t = 1; t <= tt; t++) {
            String[] s1 = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s1[0]);
            int ans = 0;
            long l = 0, r = 1;
            long sum = 1;
            while (l <= r && r <= n) {
                if (sum == n) {
                    ans++;
                    r++;
                    sum += r;
                } else if (sum < n) {
                    r++;
                    sum += r;
                } else if (sum > n) {
                    sum -= l;
                    l++;
                }
            }
            sb.append("Case #" + t + ": " + ans);
            sb.append("\n");
        }
        System.out.println(sb);
    }
}