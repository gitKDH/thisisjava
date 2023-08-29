import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        System.out.println("값을 입력하세요.");
        int a;
        boolean min = true;
        do {
            a = value.nextInt();
            if (a > 3) {
                break;
            }
            System.out.println("3이하입니다. 다시 입력하세요. ");
        } while (min);
        int answer = solution(a);
        System.out.print("a : " + a + " > " + answer);
    }

    public static int solution(int a) {
        int sum = 0;
        for (int num = 2; num <= a; num++) {
            if (isPrime(num)) {
                sum += num;
            }
        }
        return sum;
    }

    public static boolean isPrime(int num) {
        boolean isprime = true;
        if (num <= 1) {
            isprime = false;
        }

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return isprime;
    }
}
