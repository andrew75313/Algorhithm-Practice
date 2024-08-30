public class Programmers62 {
    public static void main(String[] args) {
        String[] babbling = {"ayayemaaya"};


        String[] vocabs = {"aya", "ye", "woo", "ma"};
        int count = 0;

        for (String babble : babbling) {

            babble = babble.replace("aya", "A,");
            babble = babble.replace("ye", "B,");
            babble = babble.replace("woo", "C,");
            babble = babble.replace("ma", "D,");

            String[] strArray = babble.split(",");


            boolean valid = true;

            for (String string : strArray) {
                if (!string.equals("A") && !string.equals("B") && !string.equals("C") && !string.equals("D")) {
                    valid = false;
                    break;
                }
            }

            if (valid) {
                for (int i = 0; i < strArray.length - 1; i++) {
                    if (strArray[i].equals(strArray[i + 1])) {
                        valid = false;
                        break;
                    }
                }
            }


            if (valid) {
                count++;
            }
        }

        System.out.println(count);

    }
}
