import java.util.Scanner;

public class KeyControlExample {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);

        boolean run = true;
        int speed = 0;

        while(run){
            System.out.println("--------------------");
            System.out.println("1. 증속 2. 감속 3. 종료");
            System.out.println("--------------------");
            System.out.println("선택 : ");

            String strnum = value.nextLine();

            if(strnum.equals("1")){
                speed++;
                System.out.println("현재 속도 : " + speed);
            } else if (strnum.equals("2")) {
                speed--;
                System.out.println("현재 속도 : " + speed);
            } else if (strnum.equals("3")) {
                run = false;
            }
        }
        System.out.println("종료");
    }
}
