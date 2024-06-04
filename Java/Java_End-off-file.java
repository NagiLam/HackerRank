import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = 1;
        String s;
        while (sc.hasNext()){
            s = sc.nextLine();
            System.out.printf("%d %s%n", n, s);
            n++;
        }
    }
    
    
}
