import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// import java.util.ArrayList;
import java.util.Arrays;

public class MetalHarvest {
    public static void main(String[] args) throws IOException {
//        Scanner scan= new Scanner(System.in);
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb= new StringBuilder();
        int tt= Integer.parseInt(br.readLine());
        for (int t=1;t<=tt;t++){
            String[] st= br.readLine().split(" ");
            int n= Integer.parseInt(st[0]);
            int k= Integer.parseInt(st[1]);
            int[] a= new int[n];
            int[] b= new int[n];
            for (int i=0;i<n;i++){
                String[] str= br.readLine().split(" ");
                a[i]= Integer.parseInt(str[0]);
                b[i]= Integer.parseInt(str[1]);
            }
            Arrays.sort(a);
            Arrays.sort(b);
//            int s=a[0], e=b[0], count=0;
//            for (int i=0;i<n;i++){
//                if (e-s>k){
//                    count+=(e-s)/k;
//                    s= e-(e-s)%k;
//                }
//                if (e-s==0){
//                    e=a[i+1];
//                    s=b[i+1];
//                }
//                while (e-s<=k && e-s>0){
//                    e= b[i+1];
//                    if (e-s>k){
//
//                    }
//                }
//            }
            int count= 0, max=0;
            for (int i=0;i<n-1;i++){
                count+=(a[i+1]-b[i])/k;
//                System.out.println(count);
                if (a[i+1]-b[i]<k){
                    max= Math.max(max, a[i+1]-b[i]);
//                    System.out.println(max);
                }
//                System.out.println(a[i]+b[i]);
            }
            int x= (b[n-1]-a[0]+k-1)/k;
//            System.out.println(x);
            if ((x*k - (b[n-1]-a[0]) + max) >k) {
                count++;
//                System.out.println("***");
            }
//            System.out.println(count);
            int ans= (b[n-1]-a[0]+k-1)/k - count;

            sb.append("Case #"+t+": "+ans);
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
