package Algorithm;

public class PrefixSum {
  public static void main(String[] args) {
    int[] A = {3, 2, 5, 1, 4, 6, 9, 7, 8, 1};
    int l = 3;
    int r = 7;

    int length = A.length;

    int[] P = new int[length+ 1];
    for (int i = 1; i <= length; i++) {
      P[i] = P[i-1] + A[i-1];
    }

    // l~r 까지의 누적합;
    int sum = P[r+1] - P[l];

    System.out.println("누적합 : " + sum);

  }
}
