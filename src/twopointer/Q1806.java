package twopointer;

import java.io.*;
import java.util.StringTokenizer;

/**
 * 부분합  (Gold 4)
 */
public class Q1806 {

    public static void main(String[] args) throws IOException {
        Q1806 main = new Q1806();
        BufferedReader stdIn = new BufferedReader(new   InputStreamReader(System.in));
        BufferedWriter stdOut = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(stdIn.readLine());
        int n = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];

        st = new StringTokenizer(stdIn.readLine());
        for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());

        stdOut.write(main.solution(n, s, arr));
        stdOut.flush();

        stdOut.close();
        stdIn.close();
    }

    String solution(int n, int s, int[] arr) {
        int answer = Integer.MAX_VALUE;
        int sum = 0;
        int lt = 0;
        int rt = 0;
        while (true) {
            if (sum >= s) {
                answer = Math.min(answer, rt - lt);
//                System.out.println("answer = " + answer +", sum = " + sum + ", lt = " + lt + ", rt = " + rt);
                sum -= arr[lt++];
            } else if (rt == n) {
                break;
            }else {
                sum += arr[rt++];
            }
//            System.out.println("---sum = " + sum + "---");
        }

        if (answer == Integer.MAX_VALUE) answer = 0;
        return String.valueOf(answer);
    }

}
