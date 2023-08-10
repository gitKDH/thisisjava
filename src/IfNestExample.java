public class IfNestExample {
    public static void main(String[] args) {
        int score = (int)(Math.random()*20)+81;
        System.out.println(score);

        String grade = "";

        if(score>=90){
            if(score>=95){
                grade = "Grade A+";
            }else{
                grade = "Grade A";
            }
        } else{
            if(score>=85){
                grade = "Grade B+";
            }else {
                grade = "Grade B";
            }
        }
        System.out.println(grade);
    }
}
