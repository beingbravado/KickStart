import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Maximum_coins {
    public static void main(String[] args) throws IOException {
//        Scanner scan= new Scanner(System.in);
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb= new StringBuilder();
        int tt= Integer.parseInt(br.readLine());
        for (int t=1;t<=tt;t++){
            long ans= Integer.MIN_VALUE;
            int n= Integer.parseInt(br.readLine());
            Integer[][] a= new Integer[n][n];
            for (int i=0;i<n;i++){
                String[] s= br.readLine().split(" ");
                for (int j=0;j<s.length;j++){
                    a[i][j]= Integer.parseInt(s[j]);
                }
            }
            for(int i=0;i<n;i++)
            {
                long x=0,y=0;
                for(int j=i;j<n;j++)
                {
                    x+=a[j-i][j];
                    y+=a[j][j-i];
                }
                ans=Math.max(ans,Math.max(x,y));
            }
//            for (int i=0;i<n;i++){
//                int x=0, y=i;
//                long num= 0;
//                for (;;){
//                    num+=a[x][y];
//                    System.out.println(a[x][y]+"*");
//                    x++;y++;
//                    if (x==n || y==n) break;
//                }
//                ans= Math.max(ans,num);
//            }
//            for (int i=0;i<n;i++){
//                int x=i, y=0;
//                long num= 0;
//                for (;;){
//                    num+=a[x][y];
//                    System.out.print(a[x][y]+" ");
//                    x++;y++;
//                    if (x==n || y==n) break;
//                }
//                ans= Math.max(ans,num);
//            }
            sb.append("Case #"+t+": "+ans);
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
