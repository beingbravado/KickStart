import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SmallerStrings {
    public static void main(String[] args) throws IOException {
        // Scanner scan= new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int tt = Integer.parseInt(br.readLine());
        for (int t = 1; t <= tt; t++) {
            String[] s1 = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s1[0]);
            int k = Integer.parseInt(s1[1]);
            char[] s = br.readLine().trim().toCharArray();

            long ans = 1;
            int mod = 1000000007;
            int z = (n + 1) / 2 - 1;
            for (int i = 0; i < (n + 1) / 2; i++) {
                int x = s[i] - 'a';
                if (x >= k)
                    x = k ;
                ans *= x;
                ans %= mod;
                System.out.println(x);
            }
            sb.append("Case #" + t + ": " + ans);
            sb.append("\n");
        }
        System.out.println(sb);
    }
}