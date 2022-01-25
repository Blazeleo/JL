package satvik142;
import java.util.*;

/*for(int i=n; i>0;i--)
{
	for(int k = n-i;k>0;k--)
		System.out.print(" ");
	for(int j=0;j<i;j++)
		System.out.print("*");
	System.out.println();
}*/

public class InvertedPyramid {
	
	public void pattern1(int n)
	{
		System.out.println("First pattern");

		for(int i=0; i<n;i++)
		{
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<n-i;k++) {
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println();
		}
	}

	public void pattern2(int n)
	{
		System.out.println("Second pattern");

		for(int i=0; i<n;i++)
		{
			for(int j=0;j<n-i-1;j++) {
				System.out.print(" ");
			}
			for(int k = 0;k<=i;k++) {
				System.out.print("*");

			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		InvertedPyramid obj = new InvertedPyramid();
		int n = s.nextInt();
		obj.pattern1(n);
		obj.pattern2(n);
	}

}
