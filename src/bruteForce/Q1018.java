package bruteForce;

import java.io.*;
import java.util.StringTokenizer;

/**
 * 체스판 다시 칠하기(silver4)
 */
public class Q1018 {
    static Boolean[][] chessBoard;
    static int min = 64;
    public static void main(String[] args) throws IOException {
        Q1018 main = new Q1018();
        BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter stdOut = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        st = new StringTokenizer(stdIn.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        chessBoard = new Boolean[n][m];

        for (int x = 0; x < n; x++) {
            String tmp = stdIn.readLine();
            for (int y = 0; y < m; y++) {
                if (tmp.charAt(y) == 'W') chessBoard[x][y] = true;
                else chessBoard[x][y] = false;
            }
        }

        int n_row = n - 7;
        int m_row = m - 7;

        for (int x = 0; x < n_row; x++) {
            for (int y = 0; y < m_row; y++) {
                find(x, y);
            }
        }

        stdOut.write(String.valueOf(min));
        stdOut.flush();

        stdOut.close();
        stdIn.close();
    }

    static void find(int x, int y) {
        int x_end = x + 8;
        int y_end = y + 8;
        int count = 0;

        boolean tf = chessBoard[x][y];

        for (int i = x; i < x_end; i++) {
            for (int j = y; j < y_end; j++) {
                if (chessBoard[i][j] != tf) {
                    count++;
                }
                tf = !tf; // 다음 칸의 색도 달라야 하기 때문에 변경
            }
            tf = !tf; // 아래 줄의 새도 달라야 하기 때문에 변경
        }

        count = Math.min(count, 64 - count);

        min = Math.min(min, count); // 64 - min의 경우 다른 색상으로 시작하는 경우
    }

}
