public class MultiplicationTableExample {
    public static void main(String[] args) {
        for(int m = 2; m <= 9; m++){
            System.out.println("***"+m+"단***");
            for(int i = 1; i <= 9; i++){
                System.out.println(m*i);
            }
        }
        System.out.println(" ");

        int sum = 0;
        for(int i = 1; i<=10; i++){
            sum+=i;
        }
        System.out.println(sum);
    }
}
