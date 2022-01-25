package partB;

public class NestedTry {

	public static void main(String[] args) {
		try {
			try {
				int a = 100/0;
			}catch(ArithmeticException e) {
				System.out.println("Don't divide by 0");
			}
			
			try {
				int[] a = new int[5];
				a[5] = 90;
			}catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Array Index is out of bound");
			}
			
		}catch(Exception e) {
			System.out.println("Unidentified exception");
		}
	}

}
