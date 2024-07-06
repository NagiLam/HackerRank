import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        for (int i = 0; i < testCases; i++) {
            String s = in.nextLine();
            String odd = "";
            String even = "";

            for (int j = 0; j < s.length(); j++) {
                if (j % 2 == 0) {
                    even += s.charAt(j);
                } else {
                    odd += s.charAt(j);
                }
            }
            
            System.out.println(even + " " + odd);
        }
        in.close();
    }
}
