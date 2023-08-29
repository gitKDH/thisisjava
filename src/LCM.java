import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);

        System.out.print("배열의 길이 : ");
        int n = value.nextInt();
        int[] arr = new int[n];
        System.out.print("배열의 원소 : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = value.nextInt();
        }
        int result = solution(arr);
        System.out.println(result);
    }

    public static int solution(int[] arr) {
        int result = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                result += getLcm(arr[i], arr[j]);
            }
        }
        return result;
    }

    public static int getGcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int getLcm(int a, int b) {
        int lcm = a * b / getGcd(a, b);
        return lcm;
    }

}
