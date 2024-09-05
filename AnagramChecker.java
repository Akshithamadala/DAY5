import java.util.Arrays;

public class AnagramChecker {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        // Convert strings to lowercase
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // Sort the characters in both strings
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Compare the sorted character arrays
        boolean isAnagram = Arrays.equals(charArray1, charArray2);

        if (isAnagram) {
            System.out.println("The strings are anagrams!");
        } else {
            System.out.println("The strings are not anagrams.");
        }
    }
}

