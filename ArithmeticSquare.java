import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArithmeticSquare {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int tt = Integer.parseInt(br.readLine());
        for (int t = 1; t <= tt; t++) {
            long[][] a = new long[3][3];
            String[] s1 = br.readLine().trim().split(" ");
            a[0][0] = Integer.parseInt(s1[0]);
            a[0][1] = Integer.parseInt(s1[1]);
            a[0][2] = Integer.parseInt(s1[2]);
            String[] s2 = br.readLine().trim().split(" ");
            a[1][0] = Integer.parseInt(s2[0]);
            a[1][2] = Integer.parseInt(s2[1]);
            String[] s3 = br.readLine().trim().split(" ");
            a[2][0] = Integer.parseInt(s3[0]);
            a[2][1] = Integer.parseInt(s3[1]);
            a[2][2] = Integer.parseInt(s3[2]);

            int ans = 0, initial = 0;
            if (a[0][0] + a[0][2] == 2 * a[0][1])
                initial++;
            if (a[0][0] + a[2][0] == 2 * a[1][0])
                initial++;
            if (a[0][2] + a[2][2] == 2 * a[1][2])
                initial++;
            if (a[2][0] + a[2][2] == 2 * a[2][1])
                initial++;
            // System.out.println(initial);

            a[1][1] = (a[0][0] + a[2][2]) / 2;
            ans = Math.max(ans, initial + check(a));
            a[1][1] = (a[0][2] + a[2][0]) / 2;
            ans = Math.max(ans, initial + check(a));
            a[1][1] = (a[0][1] + a[2][1]) / 2;
            ans = Math.max(ans, initial + check(a));
            a[1][1] = (a[1][0] + a[1][2]) / 2;
            ans = Math.max(ans, initial + check(a));
            sb.append("Case #" + t + ": " + ans);
            sb.append("\n");
        }
        System.out.println(sb);
    }

    public static int check(long[][] a) {
        int count = 0;
        if (a[0][0] + a[2][2] == 2 * a[1][1])
            count++;
        if (a[0][2] + a[2][0] == 2 * a[1][1])
            count++;
        if (a[0][1] + a[2][1] == 2 * a[1][1])
            count++;
        if (a[1][0] + a[1][2] == 2 * a[1][1])
            count++;
        return count;
    }
}
