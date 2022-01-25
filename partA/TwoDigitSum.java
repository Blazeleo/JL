package satvik142;
import java.util.*;

abstract class meths{
	abstract int sumnRet(int n);
	abstract void digit(int n);
}

public class TwoDigitSum extends meths{

	int sumnRet(int n)
	{
		int num = n, currDig = 0, sum=0;
		while(num > 0)
		{
			currDig = num%10;
			sum += currDig;
			num /= 10;
		}
		
		return sum;
	}
	
	void digit(int n)
	{
		int num = n;
		while(num > 10)
		{
			num = sumnRet(num);
		}
		System.out.println("Recursive sum of digits till less than 10: " + num);
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int input = s.nextInt();
		TwoDigitSum obj = new TwoDigitSum();
		obj.digit(input);
	}

}
