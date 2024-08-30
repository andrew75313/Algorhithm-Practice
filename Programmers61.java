import java.util.Arrays;

public class Programmers61 {
    public static void main(String[] args) {
        int[] lottos = {0, 0, 0, 0, 0, 0};
        int[] win_nums = {38, 19, 20, 40, 15, 25};
        int[] answer = new int[2];

        // 맞는 번호 세기
        int count = 0;
        int zeroCount = 0;
        for (int num : lottos) {
            if (num != 0) {
                for (int win_num : win_nums) {
                    if (num == win_num) {
                        count++;
                    }
                }
            } else {
                zeroCount++;
            }
        }

        // 최고 등수
        int first = 0;
        if (count + zeroCount >= 2) {
            first = 7 - count - zeroCount;
        } else {
            first = 6;
        }

        // 최저 등수
        int last = 0;
        if (count >= 2) {
            last = 7 - count;
        } else {
            last = 6;
        }

        answer[0] = first;
        answer[1] = last;

        System.out.println(Arrays.toString(answer));

    }
}
