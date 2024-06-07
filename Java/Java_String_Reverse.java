import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String A = sc.next();

        // create a reverse String then compare it with the original String
        StringBuilder reverse = new StringBuilder();
        for (int i = A.length()-1; i >= 0 ; i--) {
            reverse.append(String.valueOf(A.charAt(i)));
        }

        if (A.equals(reverse.toString())){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
    }
}



