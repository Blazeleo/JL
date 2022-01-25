package satvik142;
import java.util.*;

class parent{
	public void op(int arr[][])
	{
		int len = arr.length, m = 0, n = 0;
		int odd[] = new int[len*len];
		int even[] = new int[len*len];
		for(int i = 0; i < len; i+=1)
		{
			for(int j = 0; j < len; j+=1)
			{
				if(arr[i][j] % 2 == 0)
				{
					even[m++] = arr[i][j];
				}
				else
					odd[n++] = arr[i][j];
			}
		}
		

		System.out.println("Odd");
		
		for(int i = 0; i <= m; i+=1)
		{
			System.out.print(odd[i] + " ");
		}
		
		System.out.println("\nEven");
		
		for(int i = 0; i <= n; i+=1)
		{
			System.out.print(even[i] + " ");
		}
	}
}

public class ArraySplit extends parent{
	
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 3x3 array");
		int a[][] = new int[3][3];
		for(int i = 0; i < 3; i+=1)
		{
			for(int j = 0; j < 3; j+=1)
			{
				a[i][j] = s.nextInt();
			}
		}
		ArraySplit obj = new ArraySplit();	
		obj.op(a);
		
		for(int i = 0; i < 3; i+=1)
		{
			for(int j = 0; j < 3; j+=1)
			{
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}
	public void op(int arr[][])
	{
		super.op(arr);
		int len = arr.length;
		int arr2[][] = new int[len][len];
		
		System.out.println("\nTranspose");
		for(int i = 0; i < len; i+=1)
		{
			for(int j = 0; j < len; j+=1)
			{
				arr2[i][j] = arr[j][i];
			}
		}
		
		for(int i = 0; i < len; i+=1)
		{
			for(int j = 0; j < len; j+=1)
			{
				arr[i][j] = arr2[i][j];
			}
		}
	}

}
