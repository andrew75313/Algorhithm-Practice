import java.util.HashMap;
import java.util.Map;

public class Gichul01 {
  public static void main(String[] args) {
    String input = "two53eightfour";

    String answer = Gichul01.convertToNum(input);

    System.out.println(answer);
  }

  public static String convertToNum(String input) {

    Map<String, Integer> stringIntegerMap = new HashMap<>();

    stringIntegerMap.put("zero", 0);
    stringIntegerMap.put("one", 1);
    stringIntegerMap.put("two", 2);
    stringIntegerMap.put("three", 3);
    stringIntegerMap.put("four", 4);
    stringIntegerMap.put("five", 5);
    stringIntegerMap.put("six", 6);
    stringIntegerMap.put("seven", 7);
    stringIntegerMap.put("eight", 8);
    stringIntegerMap.put("nine", 9);

    for (String string : stringIntegerMap.keySet()) {
      input = input.replace(string, stringIntegerMap.get(string).toString());
    }

    return input;
  }
}
