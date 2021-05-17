import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ATMqueue {
    public static void main(String[] args) throws IOException {
//        Scanner scan= new Scanner(System.in);
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb= new StringBuilder();
        int tt= Integer.parseInt(br.readLine());
        for (int t=1;t<=tt;t++){
            String[] s= br.readLine().split(" ");
            int n= Integer.parseInt(s[0]);
            int x= Integer.parseInt(s[1]);
            int[] ar= new int[n];
//            int max=0;
            String[] s1= br.readLine().split(" ");
            for (int i=0;i<n;i++){
                ar[i]= Integer.parseInt(s1[i]);
            }
            int[] arr = new int[n];
            pair[] b=new pair[n];
            ArrayList<Integer> a=new ArrayList<>();
            ArrayList<Integer> e=new ArrayList<>();

            for (int i=0;i<n;i++)
            {
                int ele= ar[i];
                if(ele<=x)
                {

                    e.add(i+1);
                    arr[i]=ele;
                }
                else
                {
                    a.add(i+1);
                    arr[i]=ele;
                }
            }
            sb.append("Case #"+t+":");
            for (int i=0;i<e.size();i++)
            {
                sb.append(" "+e.get(i));
            }
            for(int i=0;i<n;i++)
            {
                int ac=arr[i]/x;
                int d=i+1;
                if(arr[i]<=x)
                    b[i] = new pair(-1,d);
                else
                {
                    if(arr[i]%x==0)
                        b[i]=new pair(ac-1,d);
                    else
                        b[i]=new pair(ac,d);

                }

            }
            Arrays.sort(b, new Comparator<pair>() {
                @Override
                public int compare(pair p1, pair p2) {
                    return p1.x-p2.x;
                }
            });
            for(int i=0;i<n;i++)
            {
                if(b[i].x!=-1)
                    sb.append(" "+b[i].y);
            }
            sb.append("\n");
        }
        System.out.println(sb);



    }
}

class pair {
    int x;
    int y;

    public pair(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
}