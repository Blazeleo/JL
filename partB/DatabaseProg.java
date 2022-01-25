package partB;
import java.util.*;

public class DatabaseProg {

	public static void main(String[] args) {
		
		int[] EmpId={1001,1002,1003,1004,1005,1006,1007};
		String[] EmpName={"Abc","Opqr","Ghi","Wxyz","Jklmn","Stuv","Def"};
		String[] JoinDate={"01/04/2009","23/08/2012","12/11/2008","29/01/2013","16/07/2005","01/01/2000","12/06/2006"};
		char[] DesigCode={'e','c','k','r','m','e','c'};
		String[] Department={"R&D","PM","Acct","Front Desk","Engg","Manufacturing","PM"};
		double[] Basic={20000,30000,10000,12000,50000,23000,29000};
		double[] HRA={8000,12000,8000,6000,20000,9000,12000};
		double[] IT={3000,9000,1000,2000,20000,4400,10000};
		char[] DesignationCode={'e','c','k','r','m'};
		String[] Designation={"Engineer","Consultant","Clerk","Receptionist","Manager"};
		double[] DA={20000,32000,12000,15000,40000};
		
		System.out.println("Enter Emp ID ");		
		int id = Integer.parseInt(args[0]);
		boolean flag = false;
		for(int i = 0; i < EmpId.length; i++)
		{
			if (id == EmpId[i]) {
				flag = true;
				
				System.out.println("Emp Id.	 Emp Name	Department	Designation	   DA");
				System.out.print(EmpId[i]+" 	  "+EmpName[i]+" 		"+Department[i]);
				
				for(int j=0;j<DesignationCode.length;j++)
				{
					if(DesigCode[i]==DesignationCode[j])
					{	System.out.print(" 		"+Designation[j]+" 	");
						double sum=Basic[i]+HRA[i]+DA[j]-IT[i];
						System.out.print(sum);
					}
				}	
				
			}
		}
		
		if(!flag)
		{
			System.out.println("Emp not found");
		}
	}

}
