package satvik142;
import java.util.*;

interface happyInt{
	interface B{
		void Happy(int n);
	}
}

public class HappyNum implements happyInt{
	
	static int sqnRet(int n)
	{
		int num = n, currDig = 0, sum=0;
		while(num > 0)
		{
			currDig = num%10;
			sum += Math.pow(currDig, 2);
			num /= 10;
		}
		
		return sum;
	}

	static void Happy(int n) {
		boolean isHappy = false;
		int num = n;
		for(int i = 0; i < 25; i++)
		{
			num = sqnRet(num);
			if(num == 1) {
				isHappy = true;
				break;
			}
		}
		
		if(isHappy)
			System.out.println("Happy");
		else
			System.out.println("Not Happy");
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		Happy(num);
	}

}
