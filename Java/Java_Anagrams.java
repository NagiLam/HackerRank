import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Because the test is not case-sensitive so
        // we set both strings to lowercase character
        a = a.toLowerCase();
        b = b.toLowerCase();

        // First, check if 2 Strings have the same length
        if (a.length() != b.length()){
            return false;
        }

        // Create a character Array both String then sort them
        char[] a1 = a.toCharArray();
        char[] a2 = b.toCharArray();

        // Because we can't directly import the class so we have to write it like this
        java.util.Arrays.sort(a1);
        java.util.Arrays.sort(a2);

        // return the boolean result of the comparison between both Array
        return java.util.Arrays.equals(a1, a2);
}

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
