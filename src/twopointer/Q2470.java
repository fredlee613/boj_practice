package twopointer;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 두 용액 (Gold 5)
 */
public class Q2470 {

    public static void main(String[] args) throws IOException {
        Q2470 main = new Q2470();
        BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter stdOut = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(stdIn.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(stdIn.readLine());
        for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());

        stdOut.write(main.solution(n, arr));
        stdOut.flush();

        stdOut.close();
        stdIn.close();
    }

    String solution(int n, int[] arr) {
        String answer = "";
        int lt = 0, rt = n - 1, sum = Integer.MAX_VALUE;
        Arrays.sort(arr);
        while (lt < rt) {
            int tmp = arr[lt] + arr[rt];
            if (tmp == 0) return arr[lt] + " " + arr[rt];
            if (Math.abs(tmp) < Math.abs(sum)) {
                sum = Math.min(Math.abs(tmp), Math.abs(sum));
                answer = arr[lt] + " " + arr[rt];
            }
            if (tmp > 0) rt--;
            else lt++;
        }
        return answer;
    }

}
