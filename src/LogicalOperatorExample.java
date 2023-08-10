public class LogicalOperatorExample {
    public static void main(String[] args) {
        int charCode = 'A';

        if((65<=charCode)&(charCode<=90)){
            System.out.println("대문자입니다.");
        }
        if((97<=charCode)&(charCode<=122)){
            System.out.println("소문자입니다.");
        }
        if((648<=charCode)&(charCode<=57)){
            System.out.println("숫자입니다.");
        }

        int value = 6;

        if((value%2==0)|(value%3==0)){
            System.out.println("2또는 3의 배수");
        }

        boolean result = (value%2==0) || (value%3==0);
        if (!result){
            System.out.println("2또는 3의 배수가 아니다.");
        }
    }
}
