public class Chapter4_4 {
    public static void main(String[] args) {


        boolean result = true;

        while(result){
            int a = (int)(Math.random()*6)+1;
            int b = (int)(Math.random()*6)+1;

            System.out.println("나온 주사위 눈 : "+a+", "+b);
            if(a+b==5){
                result = false;
            }
        }

    }
}
