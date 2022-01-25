package satvik142;
import java.util.*;

public class NumberPuzzle {
	void printPuzzle(int n)
	{
		for(int i=0; i<n;i++)
		{
			for(int j=0;j<n-i-1;j++) {
				System.out.print(" ");
			}
			
			int num = i+1;
			int limit = (2*(i+1) -1 );
			boolean set = false;
			
			for(int k = 0;k<=2*i;k+=1) {
				if(num == limit) {
					set = true;
				}
				if(!set)
				{
					System.out.print(num++);
				}
				else
				{
					System.out.print(num--);
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = s.nextInt();
		NumberPuzzle obj = new NumberPuzzle();
		obj.printPuzzle(n);
	}

}
