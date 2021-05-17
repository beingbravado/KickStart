import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lshaped {
    public static void main(String[] args) throws IOException {
//        Scanner scan= new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int tt = Integer.parseInt(br.readLine());
        for (int t = 1; t <= tt; t++) {
            int ans = 0;
            String[] s1 = br.readLine().trim().split(" ");
            int r = Integer.parseInt(s1[0]);
            int c = Integer.parseInt(s1[1]);
            Integer[][] a = new Integer[r][c];
            Integer[][] b = new Integer[c][r];
//            String s= br.readLine();
            for (int i = 0; i < r; i++) {
                String[] s2 = br.readLine().trim().split(" ");
                for (int j = 0; j < c; j++) {
                    a[i][j] = Integer.parseInt(s2[j]);
                    b[j][i] = a[i][j];
                }
            }

            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    if (a[i][j] == 1) {

//                      horizontal

                        int k = j + 1;
                        int xx = 1;
                        while (k < c) {
                            if (a[i][k] == 0) break;
                            if (a[i][k] == 1) xx++;

                            if (xx % 2 == 0 && xx >= 4) {
                                boolean con = true;
                                int x = xx/2;
                                if (i + x < r) {
                                    for (int z = i + 1; z < i + x/2; z++) {
                                        if (a[z][j] == 0) {
                                            con = false;
                                            break;
                                        }
                                    }
                                    if (con) ans++;
                                }
                                con = true;
                                if (i - x >= 0) {
                                    for (int z = i - 1; z > i - x/2; z--) {
                                        if (a[z][j] == 0) {
                                            con = false;
                                            break;
                                        }
                                    }
                                    if (con) ans++;
                                }

//                              for end points
                                con = true;
                                if (i + x < r) {
                                    for (int z = k + 1; z < k + x; z++) {
                                        if (a[z][k] == 0) {
                                            con = false;
                                            break;
                                        }
                                    }
                                    if (con) ans++;
                                }
                                con = true;
                                if (i - x >= 0) {
                                    for (int z = k - 1; z > k - x; z--) {
                                        if (a[z][k] == 0) {
                                            con = false;
                                            break;
                                        }
                                    }
                                    if (con) ans++;
                                }

                            }
                            k++;
                        }

//                      --------
//                      vertical
//                      --------


//                        k = i + 1;
//                        xx = 1;
//                        while (k < r) {
//                            if (a[k][j] == 0) break;
//                            if (a[k][j] == 1) xx++;
//
//                            if (xx % 2 == 0 && xx >= 4) {
//                                boolean con = true; int x= xx/2;
//                                if (j + x < c) {
//                                    for (int z = j + 1; z < j + x; z++) {
//                                        if (a[i][z] == 0) {
//                                            con = false;
//                                            break;
//                                        }
//                                    }
//                                    if (con) ans++;
//                                }
//                                con = true;
//                                if (j - x >= 0) {
//                                    for (int z = j - 1; z > j - x; z--) {
//                                        if (a[i][z] == 0) {
//                                            con = false;
//                                            break;
//                                        }
//                                    }
//                                    if (con) ans++;
//                                }
//
////                              for end points
//                                con = true;
//                                if (j + x < c) {
//                                    for (int z = k + 1; z < k + x; z++) {
//                                        if (a[k][z] == 0) {
//                                            con = false;
//                                            break;
//                                        }
//                                    }
//                                    if (con) ans++;
//                                }
//                                con = true;
//                                if (j - x >= 0) {
//                                    for (int z = k - 1; z > k - x; z--) {
//                                        if (a[k][z] == 0) {
//                                            con = false;
//                                            break;
//                                        }
//                                    }
//                                    if (con) ans++;
//                                }
//                            }
//                            k++;
//                        }

                    }
                }
            }


            for (int i = 0; i < c; i++) {
                for (int j = 0; j < r; j++) {
                    if (a[i][j] == 1) {

//                      horizontal

                        int k = j + 1;
                        int xx = 1;
                        while (k < r) {
                            if (b[i][k] == 0) break;
                            if (b[i][k] == 1) xx++;

                            if (xx % 2 == 0 && xx >= 4) {
                                boolean con = true;
                                int x = xx / 2;
                                if (i + x < c) {
                                    for (int z = i + 1; z < i + x / 2; z++) {
                                        if (b[z][j] == 0) {
                                            con = false;
                                            break;
                                        }
                                    }
                                    if (con) ans++;
                                }
                                con = true;
                                if (i - x >= 0) {
                                    for (int z = i - 1; z > i - x / 2; z--) {
                                        if (b[z][j] == 0) {
                                            con = false;
                                            break;
                                        }
                                    }
                                    if (con) ans++;
                                }

//                              for end points
                                con = true;
                                if (i + x < c) {
                                    for (int z = k + 1; z < k + x; z++) {
                                        if (b[z][k] == 0) {
                                            con = false;
                                            break;
                                        }
                                    }
                                    if (con) ans++;
                                }
                                con = true;
                                if (i - x >= 0) {
                                    for (int z = k - 1; z > k - x; z--) {
                                        if (b[z][k] == 0) {
                                            con = false;
                                            break;
                                        }
                                    }
                                    if (con) ans++;
                                }

                            }
                            k++;
                        }

                    }
                }
            }
            sb.append("Case #" + t + ": " + ans);
            sb.append("\n");
        }
        System.out.println(sb);
    }
}

