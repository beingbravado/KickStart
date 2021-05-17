import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class kGoodness {
    public static void main(String[] args) throws IOException {
//        Scanner scan= new Scanner(System.in);
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb= new StringBuilder();
        int tt= Integer.parseInt(br.readLine());
        for (int t=1;t<=tt;t++){
            int ans=0, count=0;
            String[] s1= br.readLine().trim().split(" ");
            int n= Integer.parseInt(s1[0]);
            int k= Integer.parseInt(s1[1]);
            String s= br.readLine();
            for (int i=0;i<n/2;i++){
                if (s.charAt(i)!=s.charAt(n-1-i)){
                    count++;
                }
            }
            ans= Math.abs(k-count);
            sb.append("Case #"+t+": "+ans);
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
