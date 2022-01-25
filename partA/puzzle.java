package satvik142;
import java.util.*;

public class puzzle {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter n");
		
		int n = s.nextInt(),sum=0;
		while(n!=0)
		{
			sum += n*n;
			n--;
		}
		
		System.out.println(sum);
		
		
	}

}
