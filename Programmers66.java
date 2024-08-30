import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

public class Programmers66 {
    public static void main(String[] args) {
        String[] keymap = {"ABC"};
        String[] targets = {"DA"};

        ArrayList<Integer> answerList = new ArrayList<>();


        for (String target : targets) {
            char[] charArray = target.toCharArray();

            int count =0;
            for (int i = 0; i < charArray.length; i++) { // 타겟 한 Character씩
                ArrayList<Integer> compare = new ArrayList<>();


                char checkCharacter = charArray[i];

                for (String s : keymap) { // 키맵 안에 있는 거 하나씩

                    char[] keymapCharArray = s.toCharArray();

                    // 각 키맵하나씩 돌리기
                    for (int j = 0; j < keymapCharArray.length; j++) {
                        if (checkCharacter == keymapCharArray[j]) {
                            compare.add(j + 1);
                            break;
                        }
                    }
                }

                if (compare.isEmpty()) {
                    count = -1;
                    break;
                } else  {
                    int min = Collections.min(compare);
                    count += min;
                }
            }

            answerList.add(count);
        }

        int[] answer = answerList.stream().mapToInt(Integer::intValue).toArray();
        System.out.println(Arrays.toString(answer));
    }
}
