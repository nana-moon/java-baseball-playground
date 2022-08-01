import java.util.*;

//public class NumberBaseBall {
//}
public class Main{
    public static void main(String[] args) {
        while(true) {
            // 1. 랜덤으로 숫자를 뽑아 answer를 만든다.
            Random random = new Random();
            List<Integer> answerNumber = new ArrayList<>();
            for (int i = 0; i < 3; i++) {
                int randomNumber = random.nextInt(9) + 1;
                if (answerNumber.contains(randomNumber)) {
                    continue;
                } else {
                    answerNumber.add(randomNumber);
                }
            }
            // 2. 입력한 숫자를 받아 mynum을 만든다.
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.println("숫자를 입력하세요.");
                List<Integer> myNumber = new ArrayList<>();
                String input = scanner.nextLine();
                for (String num : input.split("")) {
                    myNumber.add(Integer.parseInt(num));
                }
                // 3. mynum과 answer를 비교하여 출력해준다.
                int total = 0, strike = 0;
                for (int j = 0; j < 3; j++) {
                    if (answerNumber.contains(myNumber.get(j))) {
                        total += 1;
                    }
                    if (Objects.equals(answerNumber.get(j), myNumber.get(j))) {
                        strike += 1;
                    }
                }
                int ball = total - strike;

                if (total == 0) {
                    System.out.println("nothing");
                } else if (strike == 3) {
                    System.out.println("정답입니다.");
                    break;
                } else if (total != 0) {
                    System.out.println(String.format("%d볼, %d스트라이크입니다.", ball, strike));
                }

            }
            System.out.println("경기 다시 시작: 1, 종료: 2");
            String replay = scanner.nextLine();
            if (Objects.equals(replay, "1")) {
                continue;
            } else if (Objects.equals(replay, "2")) {
                System.out.println("게임을 종료합니다.");
                break;
            }
        }

    }
}