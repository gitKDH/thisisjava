public class ReplaceExample {
    public static void main(String[] args) {
        String oldStr = "자바 문자열은 불변하다. 자바 문자열은 String이다.";
        String newStr = oldStr.replace("자바","JAVA");

        System.out.println(oldStr);
        System.out.println(newStr);
    }
}
