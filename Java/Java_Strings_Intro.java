import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        sc.close();
        
        // Sum lengths of A and B
        System.out.println(A.length() + B.length());
      
        // Check if A is lexicographically greater than B
        if (A.compareTo(B) <= 0){
            System.out.println("No");
        } else{
            System.out.println("Yes");
        }

        // Capitalize the first letter in both A and B
        char a = Character.toUpperCase(A.charAt(0));
        char b = Character.toUpperCase(B.charAt(0));
        System.out.printf("%c%s %c%s", a, A.substring(1, A.length()), b, B.substring(1, B.length())); 
    }
}



