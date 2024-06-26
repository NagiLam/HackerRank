import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class Solution{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

class MyRegex{
    String oneIPGroup = "(\\d|[0-9]\\d|[0-1]\\d\\d|2([0-4]\\d|5[0-5]))";

    String pattern = "^" + oneIPGroup + "\\." + oneIPGroup + "\\." + oneIPGroup + "\\." + oneIPGroup + "$";
    }
