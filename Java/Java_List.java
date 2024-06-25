import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sizeOfList = Integer.parseInt(in.nextLine());
        List <Integer> listL = new ArrayList<Integer>(sizeOfList);

        // Read a line contains space-separated integers describing elements into listL
        String[] elements = in.nextLine().split(" ");
        for (int i = 0; i < elements.length; i++){
            listL.add(Integer.parseInt(elements[i]));
        }

        // Query part
        int numberofQuery = Integer.parseInt(in.nextLine());
        for (int i = 0; i < numberofQuery; i++){
            String s = in.next();
            if (s.equals("Insert")){
                listL.add(in.nextInt(), in.nextInt());
            }
            if (s.equals("Delete")){
                listL.remove(in.nextInt());
            }
        }

        in.close();
        for (int i = 0; i < listL.size(); i++) {
            System.out.print(listL.get(i) + " ");
        } 
    }
}
