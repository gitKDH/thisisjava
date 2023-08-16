public class MultidimensionalArrayByNewExample {
    public static void main(String[] args) {
        int[][] mathScores = new int[2][3];

        for (int i = 0; i < mathScores.length; i++) {
            for (int k = 0; k < mathScores[i].length; k++) {
                System.out.println("mathScores : " + mathScores[i][k]);
            }
        }

        System.out.println();

        mathScores[0][0] = 80;
        mathScores[0][1] = 83;
        mathScores[0][2] = 85;
        mathScores[1][0] = 86;
        mathScores[1][1] = 90;
        mathScores[1][2] = 92;

        int totalStudent = 0;
        int totalMathSnm = 0;
        for(int i = 0; i < mathScores.length; i++){
            totalStudent += mathScores[i].length;
            for(int k = 0; k < mathScores[i].length; k++){
                totalMathSnm += mathScores[i][k];
            }
        }
        double totalMathAvg = (double)totalMathSnm / totalStudent;
        System.out.println("수학 평균 : " + totalMathAvg);

        int[][] englishScores = new int[2][0];
        englishScores[0] = new int[2];
        englishScores[1] = new int[3];

        for(int i = 0; i < englishScores.length; i++){
            for(int k = 0; k < englishScores[i].length; k++){
                System.out.println(englishScores[i][k]);
            }
        }
    }
}
