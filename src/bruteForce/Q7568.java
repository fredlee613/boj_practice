package bruteForce;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * 덩치
 */
public class Q7568 {
    static ArrayList<Person> persons;
    public static void main(String[] args) throws IOException {
        Q7568 main = new Q7568();
        BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter stdOut = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(stdIn.readLine());
        persons = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(stdIn.readLine(), " ");
            persons.add(new Person(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
        }

        stdOut.write(main.solution(persons));
        stdOut.flush();

        stdOut.close();
        stdIn.close();
    }

    static class Person {
        int weight;
        int height;

        public Person(int weight, int height) {
            this.weight = weight;
            this.height = height;
        }
    }

    String solution(ArrayList<Person> persons) {
        String answer = "";
        for (Person person: persons) {
            answer += calRank(person) + " ";
        }
        return answer;
    }

    static int calRank(Person person) {
        int rank = 1;
        for (int i = 0; i < persons.size(); i++) {
            Person tmp = persons.get(i);
            if (tmp.height > person.height && tmp.weight > person.weight) rank++;
        }
        return rank;
    }
}
