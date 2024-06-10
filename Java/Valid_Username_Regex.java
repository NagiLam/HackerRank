import java.util.Scanner;

class UsernameValidator {
    /*
     * ^ indicates the start of string
       The first [] matches a single character from a->z and A->Z
       The second [] matches characters from a->z and A->Z and number.
       {7, 29} meaning the second [] can be repeat between 7 and 29 time.
       The reason it not {8, 30} is because we need to minus the first character.
       $ indicates the end of string
     */
    public static final String regularExpression = 
    "^[a-zA-Z][a-zA-Z\\d_]{7,29}$";
}


public class Solution {
    private static final Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }           
        }
    }
}
