package satvik142;
import java.util.*;

public class Lexicographic {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the 5 strings");
		String lexStrings[] = new String[5];
		
		for(int i = 0; i < 5; i++)
			lexStrings[i] = s.next();
		
		for(int i = 0; i < 5; i++) {
			for(int j = i; j < 5-1; j++)
			{
				if(lexStrings[j].compareTo(lexStrings[j+1]) > 0) {
					String temp = lexStrings[j];
					lexStrings[j] = lexStrings[j+1];
					lexStrings[j+1] = temp;
				}
					
			}
		}
		
		for(int i = 0; i < 5; i++)
			System.out.println(lexStrings[i]);
	}

}
