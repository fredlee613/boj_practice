package recursive;

import java.io.*;

/**
 * 피보나치 수 5
 */
public class Q10870 {

    public int fibonacci(int n) {
        if (n == 0) return 0;
        else if (n == 1) return 1;
        else return fibonacci(n - 1) + fibonacci(n - 2);
    }
    public static void main(String[] args) throws IOException {
        Q10870 main = new Q10870();
        BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter stdOut = new BufferedWriter(new OutputStreamWriter(System.out));

        stdOut.write(String.valueOf(main.fibonacci(Integer.parseInt(stdIn.readLine()))));
        stdOut.flush();

        stdOut.close();
        stdIn.close();

    }
}
