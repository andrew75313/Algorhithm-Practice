package Algorithm;

public class GCDandLCM {

  public static void main(String[] args) {
    int a = 11;
    int b = 13;

    System.out.println("GCD : " + gcd(a, b)); // 4
    System.out.println("LCM : " + lcm(a, b)); // 32
  }

  public static int gcd(int a, int b) {
    int minValue = Math.min(a, b);
    int maxValue = Math.max(a, b);

    while (minValue != 0) {
      int remainder = maxValue % minValue;
      maxValue = minValue;
      minValue = remainder;
    }
    return maxValue;
  }

  public static int lcm(int a, int b) {

    return Math.abs(a * b) / gcd(a, b);
  }
}
