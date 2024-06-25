import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Read the number of lines then create a main ArrayList with 
        // smaller ArrayList as it's elements 
        int numofLine = Integer.parseInt(in.nextLine());
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<ArrayList<Integer>>();

        // run a for loop for n lines, for each line we add all space-separated 
        // integers into a separated ArrayList 
        for (int i = 0; i < numofLine; i++){
            int numOfInteger = in.nextInt();
            ArrayList <Integer> smallList = new ArrayList<Integer>();
            for (int j = 0; j < numOfInteger; j++){
                smallList.add(in.nextInt());
           }
           mainList.add(smallList);
        }

        // The query part
        int numOfQuery = in.nextInt(); 
        for (int k = 0; k < numOfQuery; k++) {
            int x = in.nextInt();
            int y = in.nextInt();
            try{
            System.out.println(mainList.get(x-1).get(y-1));
            }
            catch(Exception e){
                System.out.println("ERROR!");
            }
        }
        in.close();
        }
}
