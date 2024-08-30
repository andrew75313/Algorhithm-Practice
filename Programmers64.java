import java.util.Arrays;

public class Programmers64 {
    public static void main(String[] args) {
        int n = 3;
        int[] lost = {3};
        int[] reserve = {1};

        int count = 0;

        Arrays.sort(lost);
        Arrays.sort(reserve);
        // 본인이 훔침당했을 경우 일단 제외
        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] == reserve[j]) {
                    lost[i] = 0;
                    reserve[j] = 0;
                    count++;
                    break;
                }
            }
        }



        for (int i = 0; i < lost.length; i++) {
            if (lost[i] == 0) continue;
            // 앞 번호가 있는지 확인 -> 없을 경우 뒷번호
            for (int j = 0; j < reserve.length; j++) {
                // 앞번호 확인
                if (reserve[j] == lost[i] - 1) {
                    reserve[j] = 0;
                    lost[i] = 0;
                    count++;
                    break;
                }
                // 뒷번호 확인
                if (reserve[j] == lost[i] + 1) {
                    reserve[j] = 0;
                    lost[i] = 0;
                    count++;
                    break;
                }


            }


        }

        int answer = (n - lost.length) + count ;

        System.out.println(answer);
    }
}
