package recursive;

import java.io.*;

/**
 * 팩토리얼 2
 */
public class Q27433 {

    public long factorial(long n) {
        if (n <= 1) return 1;
        else return n * factorial(n - 1);
    }
    public static void main(String[] args) throws IOException {
        Q27433 main = new Q27433();
        BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter stdOut = new BufferedWriter(new OutputStreamWriter(System.out));

        stdOut.write(String.valueOf(main.factorial(Long.parseLong(stdIn.readLine()))));
        stdOut.flush();

        stdOut.close();
        stdIn.close();

    }
}
