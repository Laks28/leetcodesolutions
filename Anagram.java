package leetcodesolutions;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {

        String str1 = "ANGLEM";
        String str2 = "ANGELS";
        boolean result = isAnagram(str1,str2);
        System.out.println("The strings are anagram:" + result);
        boolean solution = areStringsAnagram(str1,str2);
        System.out.println("The strings are anagram:" + solution);
    }

    //Approach 1: Time Complexity - O(nlogn) ; Space Complexity - O(n)

    public static boolean isAnagram(String str1, String str2) {

        char[] charArr1 = str1.toCharArray();
        char[] charArr2 = str2.toCharArray();

        Arrays.sort(charArr1);
        Arrays.sort(charArr2);

        if(Arrays.equals(charArr1,charArr2)) {
            System.out.println("Strings are anagrams");
            return true;
        }

        return false;
    }

    // Approach 2
    public static boolean areStringsAnagram(String str1, String str2) {

        if(str1.length() != str2.length()) {
            return false;
        }

        char[] word = str1.toCharArray();

        for(char ch : word) {
            int index = str2.indexOf(ch);
            System.out.println("Index:" +index);


            if(index !=-1) {
                str2 = str2.substring(0,index) + str2.substring(index+1,str2.length());
                System.out.println(str2);
            }


        }

        return str2.isEmpty();
    }
}
