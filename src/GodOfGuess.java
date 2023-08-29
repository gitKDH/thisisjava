import java.util.Scanner;

public class GodOfGuess {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        int[][] submit = new int[3][2];
        for (int i = 0; i < submit.length; i++) {
            System.out.print(i + 1 + "번 문제 답과 점수 : ");
            for (int j = 0; j < 2; j++) {
                submit[i][j] = value.nextInt();
            }
        }
        System.out.println("[{answer : " + submit[0][0] + ", score : " + submit[0][1] + "}, " +
                "{answer : " + submit[1][0] + ", score : " + submit[1][1] + "}, " +
                "{answer : " + submit[2][0] + ", score : " + submit[2][1] + "}]");

        int[] totalScores = new int[3];

        for (int i = 0; i < submit.length; i++) {
            totalScores[submit[i][0] / 2] += submit[i][1];
        }

        int maxScore = Math.max(totalScores[0], Math.max(totalScores[1], totalScores[2]));
        String[] names = {"a", "b", "c"};

        for (int i = 0; i < totalScores.length; i++) {
            if (totalScores[i] == maxScore) {
                System.out.print(names[i] + " : " + maxScore + " ");
            }
        }
    }
}
