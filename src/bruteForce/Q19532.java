package bruteForce;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * 수학은 비대면강의입니다(bronze2)
 */
public class Q19532 {
    public static void main(String[] args) throws IOException {
        Q19532 main = new Q19532();
        BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter stdOut = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        st = new StringTokenizer(stdIn.readLine());
        ArrayList<Integer> arr = new ArrayList<>();
        while (st.hasMoreTokens()) {
            arr.add(Integer.parseInt(st.nextToken()));
        }

        int a1 = arr.get(0);
        int a2 = arr.get(3);
        int b1 = arr.get(1);
        int b2 = arr.get(4);
        int c1 = arr.get(2);
        int c2 = arr.get(5);

        stdOut.write(main.solution(a1, a2, b1, b2, c1, c2));
        stdOut.flush();

        stdOut.close();
        stdIn.close();
    }

    String solution(int a1, int a2, int b1, int b2, int c1, int c2) {
        int answer = 0;
        for (int x = -999; x <= 999; x++) {
            for (int y = -999; y <= 999; y++) {
                int tmp1 = a1 * x + b1 * y;
                int tmp2 = a2 * x + b2 * y;
                if (tmp1 == c1 && tmp2 == c2) {
                    return x + " " + y;
                }
            }
        }
        return String.valueOf(answer);
    }
}
