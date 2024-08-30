import java.math.BigInteger;

import java.sql.Array;
import java.sql.SQLOutput;
import java.util.*;
import java.util.regex.*;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
    }
}
//
//        int[] answers = {1, 2, 3, 4, 5};
//        int[] firstTester = {1, 2, 3, 4, 5}; //5개
//        int[] secondTester = {2, 1, 2, 3, 2, 4, 2, 5}; //8개
//        int[] thirdTester = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}; //10개
//
//        int firstCount = 0;
//        int secondCount = 0;
//        int thirdCount = 0;
//
//        for (int index = 0; index < answers.length; index++) {
//            int answerNumber = answers[index];
//
//            if (firstTester[index % 5] == answerNumber) {
//                firstCount++;
//            }
//
//            if (secondTester[index % 8] == answerNumber) {
//                secondCount++;
//            }
//
//            if (thirdTester[index % 10] == answerNumber) {
//                thirdCount++;
//            }
//        }
//
//        HashMap<String, Integer> testerMap = new HashMap<>();
//        testerMap.put("firstTester", firstCount);
//        testerMap.put("secondTester", secondCount);
//        testerMap.put("thirdTester", thirdCount);
//
//        ArrayList<Map.Entry<String, Integer>> testerList = new ArrayList<>(testerMap.entrySet());
//
//        Comparator<Map.Entry<String, Integer>> compareAnswer = new Comparator<Map.Entry<String, Integer>>() {
//            @Override
//            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
//                return Integer.compare(o2.getValue(), o1.getValue());
//            }
//        };
//
//        Collections.sort(testerList, compareAnswer);
//
//        ArrayList<String> orderList = new ArrayList<>();
//        for (int index = 0; index < 3; index++) {
//            if (testerList.get(index).getValue() != 0) {
//                orderList.add(testerList.get(index).getKey());
//            }
//        }
//
//
//
//        System.out.println(orderList);
//    }
//}
//        int[] score = {1, 2, 3, 1, 2, 3, 1};
//        int k = 3; // 최대 점수
//        int m = 4; // 한 상자당 사과 수
//        int answer = 0;
//
//        List<Integer> scoreList = new ArrayList<>();
//        for(int index : score) {
//            scoreList.add(index);
//        }
//
//        Collections.sort(scoreList, Collections.reverseOrder());
//
//        for (int i = 1; i <= (int)(score.length / m); i++) {
//            List<Integer> subList = scoreList.subList((i*m)-m,i*m);
//            // 최저값
//            int min = Collections.min(subList);
//            answer += min * m;
//        }
//
//        System.out.println(answer);
//    }
//}
//        String answer="Yes";
//        String[] cards1 = {"i", "drink", "water"};
//        String[] cards2 = {"want", "to"};
//        String[] goal = {"i", "want", "to", "drink", "water"};
//
//        // Queue로 변환
//        Queue<String> card1Queue = new LinkedList<>(Arrays.asList(cards1));
//        Queue<String> card2Queue = new LinkedList<>(Arrays.asList(cards2));
//
//        // goal 순서 검증
//        for (String goalWord : goal) {
//            if(goalWord.equals(card1Queue.peek())) {
//                card1Queue.poll();
//            } else if (goalWord.equals(card2Queue.peek())) {
//                card2Queue.poll();
//            } else {
//                answer="No";
//            }
//        }
//    }
//}
//        int k = 3;
//        int[] score = {10, 100, 20, 150, 1, 100, 200};
//
//        int[] answer = new int[score.length];
//
//        PriorityQueue<Integer> scoreQueue = new PriorityQueue<>();
//        for (int i = 0; i < score.length; i++) {
//            scoreQueue.offer(score[i]);
//            if (scoreQueue.size() > k) {
//                scoreQueue.poll();
//                answer[i] = scoreQueue.peek();
//            } else {
//                answer[i] = scoreQueue.peek();
//            }
//        }
//        System.out.println(Arrays.toString(answer));
//    }
//}


//        for(int day = 1; day <= k; day++){
//            ArrayList<Integer> scoreQueue = new ArrayList<>();
//            for (int index = day-1 ; index < day ; index++) {
//                scoreQueue.add(score[index]);
//            }
//            answer[day-1] = Collections.min(scoreQueue);
//
//        }


//        int a = 3;
//        int b = 1;
//        int n = 20;
//
//        int total = 0;
//        int reward = 0;
//        int remainder =0;
//        do {
//            reward = (int) (n / a) * b;
//            if(reward!=0){
//                remainder += n % reward;
//            }
//            total += reward + (n % reward);
//            n = reward;
//        } while (reward != 0);
//
//        System.out.println(total);

//        ArrayList<String> stringList = new ArrayList<>(Arrays.asList("apple", "coconut", "coconut", "banana", "orange", "grape"));
//
//
//        // Set을 String 배열로 변환
//        String[] stringArray = stringList.toArray(new String[stringList.size()]);
//
//        Arrays.sort(stringArray);
//
//        System.out.println(Arrays.toString(stringArray));
//
//    }
//}

//        int[] numbers = {2, 1, 3, 4, 1};
//        Set<Integer> answerSet = new TreeSet<>();
//
//        for (int i = 0; i < numbers.length; i++) {
//            for (int j = i + 1; j < numbers.length; j++) {
//                answerSet.add(numbers[i] + numbers[j]);
//            }
//        }
////        int[] answer = answerSet.stream().mapToInt(Integer::intValue).toArray();
////        Arrays.sort(answer);
//        System.out.println(answerSet);
//    }
//}

//        String[] strings = {"abce", "abcd", "cdx"};
//        int n = 2;
//
//        ArrayList<String> stringsList = new ArrayList<>(Arrays.asList(strings));
//
//        Collections.sort(stringsList, new Comparator<String>(){
//            @Override
//            public int compare(String string1, String string2) {
//            // n번쨰 인덱스에 대한 비교
//                char char1 = string1.charAt(n);
//                char char2 = string2.charAt(n);
//                return Character.compare(char1, char2);
//            }
//        } );
//
//        System.out.println("stringsList = " + stringsList);

//        for (int i = 0; i<100; ++i) {
//            System.out.println("i = " + i);
//        }
//    }
//}


//        char charcac = ' ';
//        int num = 99;
//        System.out.println((int)charcac);
//        System.out.println((char)num);


//        String t = "3141592";
//        String p = "271";
//        int answer = 0;
//        int pLenth = p.length();
//        char[] charArray = t.toCharArray();
//
//        for (int i = 0; i <= charArray.length - pLenth; i++) {
//            String unit = t.substring(i, i + pLenth);
//
//            System.out.println(unit);
//
//
//            if (Integer.parseInt(unit) <= Integer.parseInt(p)) {
//                answer++;
//            }
//
//
//        }
//
//
//        System.out.println(answer);

//        /*다어별 알고리즘 만들어서 세우기*/
//        String s = "I am A Boy ";
//        StringTokenizer stringTokens = new StringTokenizer(s," ",true);
//        String[] stringArray = new String[stringTokens.countTokens()];
//
//        for (int arrayIndex = 0; arrayIndex < stringArray.length; arrayIndex++) {
//            char[] charArray = stringTokens.nextToken().toCharArray();
//            for (int index = 0; index < charArray.length; index++) {
//                if (index % 2 == 0) {
//                    charArray[index] = Character.toUpperCase(charArray[index]);
//                } else {
//                    charArray[index] = Character.toLowerCase(charArray[index]);
//                }
//            }
//            stringArray[arrayIndex] = String.valueOf(charArray);
//        }
//        String answer = String.join("", stringArray);
//        System.out.println(answer);


//          /*진수 변환*/
//        int n =125;
//        /*3진수로 변환*/
//        StringBuffer answerBuffer = new StringBuffer();
//        String base3="";
//        while(n>0){
//            int remainder = n%3;
//            answerBuffer.insert(0, remainder);
//            n=(int)n/3;
//        }
//
//        int answer = Integer.parseInt(answerBuffer.toString());
//        System.out.println(answer);
//
//        /*정규식 활용*/
//        String s = "12345asdas";
//
//
//        System.out.println(s.matches("\\d.*")); // true 반환


//        /*sort, comparator 사용*/
//        String[] stringArray = {"String", "str", "StringString", "s"};
//        List<String> stringList = new ArrayList(Arrays.asList(stringArray));
//        Collections.sort(stringList, Comparator.comparingInt(String::length));
//        Collections.reverse(stringList);
//
//        System.out.println(stringList);

//        /*최대 공약수, 최소 공배수 구하기*/
//        int n = 16;
//        int m = 8;
//        int gcd = getGCD(n, m);
//        int lcm = n * m / gcd;
//        int[] answer = {gcd, lcm};
//        System.out.println(Arrays.toString(answer));
//    }
//    public static int getGCD(int n, int m) {
//        //작은값 큰값 구분
//        int min = Math.min(n, m);
//        int max = Math.max(n, m);
//
//
//        while (min != 0) {
//            int remain = max % min;
//            max = min;
//            min = remain;
//        }
//        return max;


