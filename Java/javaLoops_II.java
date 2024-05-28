import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
import java.util.*;
import java.io.*;

class javaLoops_II{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int sum = a;
            for (int j = 0; j < n; j++){
                int nextEle = (int) Math.pow(2, j)*b;
                sum += nextEle;
                System.out.print(sum +" ");
            }

            if (i <t-1){
                System.out.println("");
            }
        }
        in.close();
    }
}
