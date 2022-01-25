package satvik142;

import java.util.Scanner;

public class AutomorphicNum {
	
	static void AutoNum(int n)
	{
		int sqnum = n*n;
		int num = n;
		int digit = 0;
		boolean isAuto = true;
		while(num > 0)
		{
			digit = num%10;
			if(digit != sqnum%10)
			{
				isAuto = false;
				break;
			}
				
			num /= 10;
			sqnum /= 10;
		}
		
		if(isAuto)
			System.out.println("Automorphic");
		else
			System.out.println("Not Automorphic");
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		AutoNum(num);
	}

}
