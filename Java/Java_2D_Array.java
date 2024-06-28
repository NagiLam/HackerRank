import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList()));
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        bufferedReader.close();
        
        int temp = 0;
        int sum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.size(); j++) {
                if (i > 1 && j > 1) {
                    temp = arr.get(i).get(j) + arr.get(i).get(j - 1) + arr.get(i).get(j - 2)
                            + arr.get(i - 1).get(j - 1)
                            + arr.get(i - 2).get(j) + arr.get(i - 2).get(j - 1) + arr.get(i - 2).get(j - 2);
                    if (temp > sum) {
                        sum = temp;
                    }
                }
            }
        }
        System.out.println(sum);
    }
}
