package satvik142;
import java.util.Scanner;

public class BinSrch {
	public void BinarySearch(int arr[], int n, int key)
	{
		int low = 0, high = n-1;
		int mid;
		boolean found = false;
		
		while(low <= high)
		{
			mid = (low+high)/2;
			if(key > arr[mid])
			{
				high = mid-1;
			}
			else if(key < arr[mid]) {
				low = mid+1;
			}
			else {
				found = true;
				System.out.println("Element found at position " + (mid+1));
				break;
			}
		}
		if(!found)
			System.out.println("Element not found");

	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n = s.nextInt();
		int a[] = new int[n];
		int key;
		System.out.println("Enter the array");
		
		for(int i = 0; i < n; i++) {
			a[i] = s.nextInt();
		}
		
		BinSrch b = new BinSrch();
		System.out.println("Enter the key");
		key = s.nextInt();
		b.BinarySearch(a, n, key);
		
	}

}
