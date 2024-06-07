import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.*;
import java.util.Collection;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "z";
        String largest = "";
 /*     Another way to implement this task if we can import List and Collection
        List <String> subStrings = new ArrayList<>();

        for (int i = 0; i < s.length()-k+1; i++){
            subStrings.add(s.substring(i, i+k));
        }

        Collections.sort(subStrings); 
        
        smallest = subStrings.getFirst();
        largest = subStrings.getLast(); */

        // because we can't import List and Collection for this task, we use the implement below
        // We loop through the whole string and compare the smallest / largest string with each substring of length k 
        for (int i = 0; i < s.length()-k+1; i++) {
            if (s.substring(i, i+k).compareTo(smallest) <= 0){
                smallest = s.substring(i, i+k);
            } 

            if (s.substring(i, i+k).compareTo(largest) > 0){
                largest = s.substring(i, i+k);
            }
        } 
         
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
