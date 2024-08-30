package Algorithm;

public class SlidingWindow_MaxSum {
  public static void main(String[] args) {
    int[] arr = {2, 1, 5, 1, 3, 2, 5, 8, 9, 1};
    int k = 5;

    System.out.println("구간 내 최댓값 : " + maxSum(arr, k));

  }

  public static int maxSum(int[] arr, int win) {

    // 윈도우 크기 검증
    if (win > arr.length) {
      return -1;
    }

    // 초기 윈도우 합
    int winSum = 0;
    for (int i = 0; i < win; i++) {
      winSum += arr[i];
    }

    // 윈도우 이동하면서 합max 찾기
    int maxSum = winSum;
    for (int i = win; i < arr.length; i++) {
      winSum += arr[i] - arr[i - win];

      maxSum = Math.max(winSum, maxSum);
    }

    return maxSum;
  }

}
