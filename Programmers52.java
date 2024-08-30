public class Programmers52 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};

        int answer = 0;

        for (int i = 0; i <= nums.length - 3; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    // 세  수의 합
                    int sum = nums[i] + nums[j] + nums[k];

                    // 합을 2부터 나눴을 때, 0인지 확인
                    int count = 0;
                    for (int l = 2; l < sum; l++) {
                        if ((sum % l) == 0) {
                            count++;
                        }
                    }

                    if (count == 0) {
                        answer++;
                    }

                }

            }
        }

        System.out.println(answer);

    }
}
