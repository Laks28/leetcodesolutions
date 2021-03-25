package leetcodesolutions;

public class ReverseInteger {

    public static void main(String[] args) {

        int num = 1234;
        System.out.println("The reverse of a number is:" + reverseInteger(num));
    }

    public static int reverseInteger(int num) {
        int rev =0;
        System.out.println(num);
        while(num !=0) {
            int temp = num%10;
            rev = rev*10 + temp;
            num/= 10;
        }
        return rev;
    }
}