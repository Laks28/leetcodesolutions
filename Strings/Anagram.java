package leetcodesolutions.Strings;

import java.util.Arrays;

/**
 * Problem Statement:
 * Given two strings, check if they are anagrams of each other.

 * Constraints:
 * - Two strings are anagrams if they contain the same characters with the same frequency.
 * - Example: "listen" and "silent" are anagrams.

 * Approach 1: Sorting both strings and comparing them.
 * Approach 2: Removing matched characters from one string.
 */
public class Anagram {

    public static void main(String[] args) {

        String str1 = "ANGLEM";
        String str2 = "ANGELS";

        // Approach 1: Sorting
        boolean result = isAnagram(str1, str2);
        System.out.println("The strings are anagrams (Sorting approach): " + result);

        // Approach 2: Removing matched characters
        boolean solution = areStringsAnagram(str1, str2);
        System.out.println("The strings are anagrams (Removing characters): " + solution);
    }

    /**
     * Approach 1: Sort both strings and compare.
     *
     * Time Complexity: O(n log n) - Sorting both strings.
     * Space Complexity: O(n) - Temporary storage for sorted arrays.
     *
     * @param str1 First string.
     * @param str2 Second string.
     * @return true if the strings are anagrams, false otherwise.
     */
    public static boolean isAnagram(String str1, String str2) {
        // Convert strings to character arrays
        char[] charArr1 = str1.toCharArray();
        char[] charArr2 = str2.toCharArray();

        // Sort both arrays
        Arrays.sort(charArr1);
        Arrays.sort(charArr2);

        // Compare sorted arrays
        return Arrays.equals(charArr1, charArr2);
    }

    /**
     * Approach 2: Remove matched characters from the second string.
     *
     * Time Complexity: O(n^2) - Iterating and modifying the second string.
     * Space Complexity: O(1) - In-place comparison.
     *
     * @param str1 First string.
     * @param str2 Second string.
     * @return true if the strings are anagrams, false otherwise.
     */
    public static boolean areStringsAnagram(String str1, String str2) {
        // Check if the lengths are different
        if (str1.length() != str2.length()) {
            return false;
        }

        // Iterate over the characters of the first string
        for (char ch : str1.toCharArray()) {
            // Find the character's index in the second string
            int index = str2.indexOf(ch);
            if (index == -1) {
                return false; // Character not found, not an anagram
            }
            // Remove the matched character from the second string
            str2 = str2.substring(0, index) + str2.substring(index + 1);
        }

        // If all characters are matched, the second string should be empty
        return str2.isEmpty();
    }
}
