import java.io.*;
import java.math.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String n = bufferedReader.readLine();
        bufferedReader.close();
      
        BigInteger isPrime = new BigInteger(n);
        String result = isPrime.isProbablePrime(1) ? "prime" : "not prime";
        System.out.println(result);
    }
}
