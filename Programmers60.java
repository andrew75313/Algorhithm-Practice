import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Programmers60 {
    public static void main(String[] args) {
        int number = 15;
        int limit = 10;
        int power = 1;

        int answer = 0;
        int[] knights = new int[number];


        for (int i = 0; i < knights.length; i++) {
            // 약수 갯수 구하기
            int count = 0;
            int sqrt = (int) Math.sqrt(i + 1);
            for (int j = 1; j <= sqrt; j++) {
                if (((i + 1) % j) == 0) {
                    // 중복일 경우 처리
                    if (j == (i + 1) / j) {
                        count++;
                    } else {
                        count += 2;
                    }
                }
            }

            // 약수 넣기
            knights[i] = count;
        }

        // 초과할 경우 power로
        for (int i = 0; i < knights.length; i++) {
            if (knights[i] > limit) {
                knights[i] = power;
            }

            answer += knights[i];
        }


        System.out.println(answer);
    }
}
