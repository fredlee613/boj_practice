package twopointer;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 두 수의 합 (Silver 3)
 */
public class Q3273 {
    public static void main(String[] args) throws IOException {
        Q3273 main = new Q3273();
        BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter stdOut = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(stdIn.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(stdIn.readLine());

        for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());

        int m = Integer.parseInt(stdIn.readLine());

        stdOut.write(main.findPair(n, arr, m));
        stdOut.flush();

        stdOut.close();
        stdIn.close();

    }

    String findPair(int n, int[] arr, int m) {
        int cnt = 0;
        Arrays.sort(arr);

        int lt, rt;
        for (lt = 0; lt < n; lt++) {
            rt = lt + 1;
            while (rt < n && arr[lt] + arr[rt] <= m) {
                if (arr[lt] + arr[rt] == m) cnt++;
                rt++;
            }
        }

        return String.valueOf(cnt);
    }
}
