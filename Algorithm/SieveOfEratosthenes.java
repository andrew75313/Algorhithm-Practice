package Algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SieveOfEratosthenes {

  public static void main(String[] args) {
    int n = 45;

    boolean[] isPrime = sieve(n);

    int answer = 0;
    List<Integer> answerList = new ArrayList<>();

    for (int i = 2; i < isPrime.length; i++) {
      if (isPrime[i]) {
        answer++;
        answerList.add(i);
      }
    }

    System.out.println("모든 소수의 갯수 : " + answer);
    System.out.println("모든 소수 : " + answerList);

  }

  public static boolean[] sieve(int n) {

    boolean[] isPrime = new boolean[n + 1];

    Arrays.fill(isPrime, true);

    isPrime[0] = false;
    isPrime[1] = false;

    for (int i = 2; i * i <= n; i++) {
      if (isPrime[i]) {
        for (int j = i * i; j <= n; j += i) {
          isPrime[j] = false;
        }
      }
    }

    return isPrime;
  }
}
