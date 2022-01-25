package satvik142;
import java.util.*;

interface A{
	public void armstrong(int n);
}

interface B{
	public void disarium(int n);
}

public class InterfaceProg implements A,B{
	
	public void armstrong(int n)
	{
		int sum=0,count=0;
		int dupe = n;
		while(dupe>0)
		{
			dupe /= 10;
			count++;
		}
		while(n>0)
		{
			int r = n%10;
			sum += Math.pow(r,count);
			n /= 10;
		}
		if(sum == n)
			System.out.println("Armstrong");
	}
	
	public void disarium(int n)
	{
		int sum=0,count=0;
		int dupe = n;
		while(dupe>0)
		{
			dupe /= 10;
			count++;
		}
		while(n>0)
		{
			int r = n%10;
			sum += Math.pow(r,count);
			n /= 10;
			count--;
		}
		if(sum == n)
			System.out.println("Disarium");
	}
	public static void main(String[] args) {
		InterfaceProg obj = new InterfaceProg();
		Scanner s = new Scanner(System.in);
		int arm = s.nextInt();
		obj.armstrong(arm);
		int dis = s.nextInt();
		obj.disarium(dis);
	}

}
