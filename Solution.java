import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        char[] c= scan.next().toCharArray();

        int stuart=0, kevin=0;
        int n= c.length;
        for (int i=0;i<n;i++){
            if (c[i]=='A'||c[i]=='E'||c[i]=='I'||c[i]=='O'||c[i]=='U'){
                kevin+= n-i;
            } else {
                stuart+= n-i;
            }
        }

        if (stuart>kevin){
            System.out.println("Stuart "+ stuart);
        } else {
            System.out.println("Kevin " + kevin);
        }
        scan.close();
    }
}
