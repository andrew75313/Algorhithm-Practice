package Algorithm;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Greedy_CoinChange {

  public static void main(String[] args) {
    int[] coins = {500, 100, 50, 10};
    int amount = 170;

    // 동전 별 사용 갯수 저장 map
    Map<Integer, Integer> coinUsage = new HashMap<>();

    // 전체 사용 코인 갯수 출력
    int totalCoin = getMinimumCoins(coins, amount, coinUsage);
    System.out.println("전체 동전 숫자 : " + totalCoin);

    // 코인 별 가지고 갯수 출력
    for (int coin : coins) {
      System.out.println(coin + "원 사용 갯수 : " + coinUsage.get(coin));
    }
  }

  public static int getMinimumCoins(int[] coins, int amount, Map<Integer, Integer> coinUsage) {

    int count = 0;

    // coins 내림차순으로 정렬
    Integer[] coinsInteger = Arrays.stream(coins)
        .boxed()
        .toArray(Integer[]::new);

    Arrays.sort(coinsInteger, Comparator.reverseOrder());

    // 큰 숫자 coin 부터 계산
    for (Integer coin : coinsInteger) {
      // 동전 별 갯수 구하기
      int numCoins = amount / coin;
      // 동전 별 갯수 등록
      coinUsage.put(coin, numCoins);
      // 총 숫자 세기
      count += numCoins;
      // 남은 돈 계산
      amount %= coin;
    }

    return count;
  }
}
