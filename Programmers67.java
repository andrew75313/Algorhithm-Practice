import java.util.ArrayList;
import java.util.List;

public class Programmers67 {
    public static void main(String[] args) {
        String s = "aukks";
        String skip = "wbqd";
        int index = 5;
        String answer = "";

        char[] sCharArray = s.toCharArray();



        for (int i = 0; i < sCharArray.length; i++) {
            List<Character> charList = new ArrayList<>();
            int order = 1;
            char lastChar = 0;

            // index 수에 맞을때 종료
            int j = 1;
            while(order <= index) {
                char compare = (char) ('a' + (sCharArray[i] + j - 'a') % 26);
                // skip 인지 검증
                if (!skip.contains(String.valueOf(compare))) {
                    lastChar = compare;
                    order++;
                }
                j++;
            }

            answer += lastChar;
        }

        System.out.println(answer);
    }
}

