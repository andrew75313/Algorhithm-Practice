import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Programmers68 {
    public static void main(String[] args) {
        int[] ingredient = {2, 2, 2, 2, 2, 2, 1, 2, 1, 2, 3, 1, 3, 1};

        // 아래부터 빵1-야채2-고기3-빵1

        String ingredientString = IntStream.of(ingredient).mapToObj(String::valueOf).collect(Collectors.joining());


        int count = 0;
        while (ingredientString.contains("1231")) {
            ingredientString = ingredientString.replace("1231", "H");

            // A 세기
            char[] charArray = ingredientString.toCharArray();
            for (char c : charArray) {
                if (c == 'H') {
                    count++;
                }
            }

            ingredientString = ingredientString.replace("H", "");

            System.out.println(ingredientString);
        }

        System.out.println(count);
    }
}
