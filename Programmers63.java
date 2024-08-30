import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.stream.Collectors;

public class Programmers63 {
    public static void main(String[] args) {
        String X = "12321";
        String Y = "42531";

        String[] xArray = X.chars().mapToObj(c -> String.valueOf((char)c)).toArray(String[]::new);
        String[] yArray = Y.chars().mapToObj(c -> String.valueOf((char)c)).toArray(String[]::new);

        ArrayList<String> matchList = new ArrayList<>();
        for (int num = 0; num <= 9; num++) {
            // 문구 갯수 확인
            int xCount = 0;
            int yCount = 0;

            for (String s : xArray) {
                if (s.equals(String.valueOf(num))) {
                   xCount++;
                }
            }

            for (String y : yArray) {
                if (y.equals(String.valueOf(num))) {
                    yCount++;
                }
            }

            for (int i = 0; i < Math.min(xCount, yCount); i++) {
                matchList.add(String.valueOf(num));
            }
        }

        matchList.sort(Collections.reverseOrder());

        String answer = matchList.stream()
                .collect(Collectors.joining(""));

        if (answer.isEmpty()) {
            answer = "-1";
        }

        if (answer.matches("0+")) {
            answer = "0";
        }

        System.out.println(answer);

    }
}
