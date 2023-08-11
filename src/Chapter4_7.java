import java.util.Scanner;

public class Chapter4_7 {
    public static void main(String[] args) {

        boolean result = true;
        int money = 0;
        Scanner value = new Scanner(System.in);

        while (result) {

            System.out.println("---------------------------");
            System.out.println("1. 예금 2. 출금 3. 잔고 4. 종료");
            System.out.println("---------------------------");
            System.out.print("선택 > ");

            String input = value.nextLine();

            switch (input) {
                case "1":
                    System.out.print("예금액> ");
                    money += value.nextInt();
                    break;
                case "2":
                    System.out.print("출금액> ");
                    money -= value.nextInt();
                    break;
                case "3":
                    System.out.print("잔액> ");
                    System.out.println(money);
                    break;
                case "4":
                    result = false;
                    break;
            }
            System.out.println();
        }
        System.out.println("종료");
    }
}
