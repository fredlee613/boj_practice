package bruteForce;

import java.io.*;
import java.util.StringTokenizer;

/**
 * 블랙잭 (Bronze2)
 */
public class Q2798 {


    public static void main(String[] args) throws IOException {
        Q2798 main = new Q2798();
        BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter stdOut = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(stdIn.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        st = new StringTokenizer(stdIn.readLine());
        for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());

        stdOut.write(main.solution(n, m, arr));
        stdOut.flush();

        stdOut.close();
        stdIn.close();
    }

    String solution(int n, int m, int[] arr) {
        int answer = 0;
        for (int x = 0; x < n-2; x++) {
            int tmp = 0;
            for (int y = x + 1; y < n - 1; y++) {
                for (int z = y + 1; z < n; z++) {
                    tmp = arr[x] + arr[y] + arr[z];
                    if (tmp <= m) answer = Math.max(tmp, answer);
                    if (answer == m) return String.valueOf(answer);
                }
            }
        }
        return String.valueOf(answer);
    }
}
