import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close(); 
        
        // we need to use trim() to delete 
        // leading and trailing spaces. 
        s = s.trim();

        // First check if String is empty or null. If so we return 0
        if (s.length() == 0 || s == null){
            System.out.println(0);
            return;
        }
        
        /* If it passed the check then we create a new string array 
        and split the input string based on the specified delimiters 
        and print the resulting array of strings.
        */

        // Alternatively we can use String regex = "[^a-zA-Z]+";
      
        String regex = "[\\s!,?._'@]+";
        String[] tokenofS = s.split(regex);
        System.out.println(tokenofS.length);
            
        for (String item : tokenofS) {
            System.out.println(item);
        }
        
    }
        
}


