import java.util.LinkedList;
import java.util.Queue;

public class Programmers53 {
    public static void main(String[] args) {
        int n = 4; // 칸수
        int m = 1; // 롤러 길이
        int[] section = {1,2,3,4};

        int answer = 1;

        //최대 칠하는 횟수
        int max = (int) Math.ceil(n / m);

        int paintArea = section[0] + m - 1;

        for (int paint = 0; paint < max; paint++) {

            for (int j = 0; j < section.length; j++) {
                if (section[j] > paintArea) {
                    answer++;
                    paintArea = section[j] + m - 1;
                    break;
                }
            }

        }

        System.out.println(answer);

    }
}
