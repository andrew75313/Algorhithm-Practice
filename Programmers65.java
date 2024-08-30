public class Programmers65 {
    public static void main(String[] args) {
        String s = "abracadabra";

        char[] charArray = s.toCharArray();

        int wordsCount = 0;

        for (int index = 0; index < charArray.length; ) {
            char x = charArray[index];
            int matchCount = 0;
            int unmatchCount = 0;

            for (int i = index; i < charArray.length; i++) {
                if (x == charArray[i]) {
                    matchCount++;
                } else {
                    unmatchCount++;
                }

                if (matchCount == unmatchCount) {
                    wordsCount++;
                    index = i + 1;
                    break;
                }

                // 마지막
                if (i == charArray.length - 1) {
                    index = charArray.length;
                    wordsCount++;
                }
            }
        }

        System.out.println(wordsCount);
    }
}
