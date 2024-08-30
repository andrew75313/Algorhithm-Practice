package Algorithm;

public class BinarySearch {
  public static void main(String[] args) {
    int[] arr = {1, 3, 5, 7, 9, 11, 13, 15};
    int target = 17;

    int answer = findIndex(arr, target);

    if (answer == -1){
      System.out.println("찾지 못함");
    } else {
      System.out.println("찾은 인덱스 번호 : " + answer);
    }

  }

  public static int findIndex(int[] arr, int target) {
    int left = 0;
    int right = arr.length - 1;

    while(left <= right) {
      int mid = left + (right - left) / 2;

      if (arr[mid] == target) {
        return mid;
      } else if (arr[mid] < target) {
        left = mid + 1;
      } else {
        right = mid - 1;
      }
    }

    return -1;
  }

}
