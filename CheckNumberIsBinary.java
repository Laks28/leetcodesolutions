package leetcodesolutions;

public class CheckNumberIsBinary {

    public static void main(String[] args) {

        int num1 = 1234;
        int num2 = 1010;

        String regEx = "[10][10]+";

        boolean checkFirstNum = Integer.toString(num1).matches(regEx);
        System.out.println("The first number is a boolean:" +checkFirstNum);
        boolean checkSecondNum = Integer.toString(num2).matches(regEx);
        System.out.println("The second number is a boolean:" +checkSecondNum);
    }
}
