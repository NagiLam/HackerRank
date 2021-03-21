import java.util.*;
public class Java_If_Else {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		if (N%2 != 0) {
			System.out.println("Weird");
		}
		if (N%2 == 0) {
			if(N >= 2 && N <= 5) {
				System.out.println("Not Weird");
			}
			if(N >= 6 && N <= 20) {
				System.out.println("Weird");
			}
			else if(N>20) {
				System.out.println("Not Weird");
			}
		}
		scanner.close();
	}
}
