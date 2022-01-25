package satvik142;
import java.util.*;
import java.util.Random.*;

public class PasswordGen {
	
	static String passGen(String RoomNo, String Mob, String Name)
	{
		char one = RoomNo.charAt(0);
		String two = "" + Mob.charAt(0) + Mob.charAt(9);
		String three = "" + Name.charAt(0) + Name.charAt(Name.length() - 1);
		char[] spec = {'/','@','#','$','%','^'};
		char specialSymb = spec[(int)(Math.random() * spec.length - 1)];
		String ret = "" + one + two + three + specialSymb;
		return ret;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String RoomNo, Mob, Name;
		System.out.println("Enter room no.");
		RoomNo = s.next();
		System.out.println("Enter mob no.");
		Mob = s.next();
		System.out.println("Enter customer name.");
		Name = s.next();
		
		System.out.println("Random password is: " + passGen(RoomNo, Mob, Name));
	}

}
