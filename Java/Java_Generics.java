import java.io.IOException;
import java.lang.reflect.Method;
// The problem want you to write the generics method, not using method overloading
class Printer
{
   public <T> void printArray(T[] array){
        for (T elements : array) {
            System.out.println(elements);
        }
   }
}

public class Solution {
    public static void main( String args[] ) {
        Printer myPrinter = new Printer();
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = {"Hello", "World"};
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);
        int count = 0;

        for (Method method : Printer.class.getDeclaredMethods()) {
            String name = method.getName();
            if(name.equals("printArray"))
                count++;
        }

        if(count > 1)System.out.println("Method overloading is not allowed!");
    }
}
