import java.util.Scanner;

public class ConditionalOperationExample {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);

        int a = value.nextInt();
        char grade = (a > 90) ? 'A' : ((a > 80) ? 'B' : 'C');
        System.out.println(grade);
    }
}
