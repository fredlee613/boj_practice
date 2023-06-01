package bruteForce;

import java.io.*;
import java.util.Arrays;

/**
 * 일곱 난쟁이
 */
public class Q2309 {
    static int[] dwarfs = new int[9];
    public static void main(String[] args) throws IOException {
        Q2309 main = new Q2309();
        BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter stdOut = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 0; i < 9; i++) dwarfs[i] = Integer.parseInt(stdIn.readLine());

        stdOut.write(main.solution(dwarfs));
        stdOut.flush();

        stdOut.close();
        stdIn.close();
    }

    String solution(int[] dwarfs) {
        String answer = "";
        int sum = 0;
        for (int dwarf : dwarfs) sum += dwarf;
        for (int x = 0; x < 9; x++) {
            for (int y = x + 1; y < 9; y++) {
                if (sum - dwarfs[x] - dwarfs[y] == 100) {
                    dwarfs[x] = 0;
                    dwarfs[y] = 0;
                    Arrays.sort(dwarfs);
                    for (int i = 2; i < 9; i++) {
                        if (i != 8) {
                            answer += dwarfs[i] + "\n";
                        } else {
                            answer += dwarfs[i];
                        }
                    }
                    return answer;
                }
            }
        }
        return answer;
    }
}
