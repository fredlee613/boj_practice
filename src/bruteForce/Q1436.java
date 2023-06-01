package bruteForce;

import java.io.*;

/**
 * 영화감독 숌
 */
public class Q1436 {
    public static void main(String[] args) throws IOException {
        BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter stdOut = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(stdIn.readLine());

        stdOut.write(String.valueOf(findNumberWith666(n)));
        stdOut.flush();

        stdOut.close();
        stdIn.close();
    }


    static int findNumberWith666(int number) {
        int answer = 665;
        int count = 0;
        while (true) {
            answer++;
            if (String.valueOf(answer).contains("666")) count++;
            if (count == number) break;
        }
        return answer;
    }
}
