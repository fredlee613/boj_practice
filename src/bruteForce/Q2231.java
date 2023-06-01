package bruteForce;

import java.io.*;

/**
 * 분해합(bronze2)
 */
public class Q2231 {
    public static void main(String[] args) throws IOException {
        Q2231 main = new Q2231();
        BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter stdOut = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = stdIn.readLine();
        int m = Integer.parseInt(str);

        stdOut.write(solution(m));
        stdOut.flush();

        stdOut.close();
        stdIn.close();
    }

    static String solution(int m) {
        for (int i = 1; i < m; i++) {
            int sum = i;
            sum += addAllDigitsOfNumber(i);
            if (sum == m) {
                return String.valueOf(i);
            }
        }
        return "0";
    }

    static int addAllDigitsOfNumber(int number) {
        int sum = 0;
        while (number / 10 != 0) {
            sum += number % 10;
            number /= 10;
        }
        sum += number;
        return sum;
    }
}
