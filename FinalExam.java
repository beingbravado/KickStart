import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FinalExam {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int tt = Integer.parseInt(br.readLine());
        for (int t = 1; t <= tt; t++) {
            String[] s0 = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s0[0]);
            int m = Integer.parseInt(s0[1]);

            int[] l = new int[n];
            int[] r = new int[n];
            boolean[] posi = new boolean[1002];
            for (int i = 0; i < n; i++) {
                String[] s1 = br.readLine().trim().split(" ");
                l[i] = Integer.parseInt(s1[0]);
                r[i] = Integer.parseInt(s1[1]);
                for (int j = l[i]; j <= r[i]; j++)
                    posi[j] = true;
            }
            int[] ans = new int[m];
            String[] s = br.readLine().trim().split(" ");
            for (int i = 0; i < m; i++) {
                ans[i] = Integer.parseInt(s[i]);
                int a = ans[i], b = ans[i];
                while (a >= 0 || b < 1001) {
                    if (a >= 0 && posi[a]) {
                        ans[i] = Math.abs(a);
                        posi[a] = false;
                        break;
                    } else if (b < 1001 && posi[b]) {
                        ans[i] = Math.abs(b);
                        posi[b] = false;
                        break;
                    } else {
                        a--;
                        b++;
                    }
                }
            }

            sb.append("Case #" + t + ": ");
            for (int i = 0; i < m; i++)
                sb.append(ans[i] + " ");
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
