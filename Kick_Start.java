import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// import java.util.Arrays;

public class Kick_Start {
    public static void main(String[] args) throws IOException {
//        Scanner scan= new Scanner(System.in);
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb= new StringBuilder();
        int tt= Integer.parseInt(br.readLine());
        for (int t=1;t<=tt;t++){
            int ans=0, count=0;
            String s= br.readLine();
            for (int i=0;i<s.length();i++){
                if (i+3<s.length()){
                    if (s.charAt(i)=='K' && s.charAt(i+1)=='I' && s.charAt(i+2)=='C' && s.charAt(i+3)=='K'){
                        count++;
//                        i+=3;
                    }
                }
                if (i+4<s.length()){
                    if (s.charAt(i)=='S' && s.charAt(i+1)=='T' && s.charAt(i+2)=='A' && s.charAt(i+3)=='R' && s.charAt(i+4)=='T'){
                        ans+=count;
//                        i+=4;
                    }
                }
            }
            sb.append("Case #"+t+": "+ans);
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
