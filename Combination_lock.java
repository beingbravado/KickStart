import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Combination_lock {
    public static void main(String[] args) throws IOException {
//        Scanner scan= new Scanner(System.in);
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb= new StringBuilder();
        int tt= Integer.parseInt(br.readLine());
        for (int t=1;t<=tt;t++){
            long ans= Integer.MAX_VALUE;
            String[] s1=br.readLine().split(" ");
            int n= Integer.parseInt(s1[0]);
            long k= Long.parseLong(s1[1]);
            Long[] a= new Long[n];
            String[] s2= br.readLine().split(" ");
            for (int i=0;i<n;i++){
                a[i]= Long.parseLong(s2[i]);
            }
            Arrays.sort(a);
//            System.out.println(n/2);
//            int num=0;
            for (int x=0;x<n;x++){
                long y=0;
                for (int i=0;i<n;i++){
//                    y+= Math.min(Math.abs(a[i]-x),Math.min((Math.abs(a[i]-k)+Math.abs(x)),(Math.abs(a[i])+Math.abs(k-x))));
                    y+= Math.min(Math.abs(a[i]-a[x]),Math.min((Math.abs(a[i]-k)+Math.abs(a[x])),(Math.abs(a[i])+Math.abs(k-a[x]))));
//                System.out.println(y);
                }
                ans= Math.min(ans,y);
            }
            long num=0;
            {
                for (int i=0;i<n;i++){
                    num+= Math.min(Math.abs(a[i]-0),Math.abs(a[i]-k));
                }
            }
            ans= Math.min(ans,num);

            sb.append("Case #"+t+": "+ans);
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
