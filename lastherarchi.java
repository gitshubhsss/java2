package herarchical_programs;
import java.util.*;
class staff_member
{
	int memberid;
	String mname;
	String memdep;
	
	staff_member()
	{
		Scanner shubham=new Scanner(System.in);
		System.out.println("enter the member id and the name and member department");
		memberid=shubham.nextInt();
		mname=shubham.next();
		memdep=shubham.next();
	}
	staff_member(int memberid,String mname,String memdep)
	{
		this.memberid=memberid;
		this.mname=mname;
		this.memdep=memdep;
	}
	void display()
	{
		System.out.println("member id : "+memberid+"\nname : "+mname+"department name"+memdep);
	}
}
class office_staff extends staff_member
{
	String memberdepartment;
	office_staff()
	{
		Scanner shubham=new Scanner(System.in);
		System.out.println("member department ");
		memberdepartment=shubham.next();
	}
	office_staff(int memberid,String mname,String memdep)
	{
		super(memberid,mname,memdep);
		this.memberdepartment=memberdepartment;
	}
	void show()
	{
		System.out.println("member department :"+memberdepartment);
		
	}
}
public class lastherarchi 
{

	public static void main(String[] args) 
	{
		int memberid,i,n;
		String mname;
		String memberdepartment;
		String memdep;
		staff_member s1=new staff_member();
		s1.display();
		office_staff o1=new office_staff();
		o1.show();
		Scanner shubham=new Scanner(System.in);
		System.out.println("enter the number of records");
		n=shubham.nextInt();
		office_staff o[]=new office_staff[n];
		for(i=1;i<=n;i++)
		{
			System.out.println("enter the member member id and name");
			memberid=shubham.nextInt();
			mname=shubham.next();
			memdep=shubham.next();
			System.out.println("enter the member department");
			memberdepartment=shubham.next();
			o[i]=new office_staff(memberid,mname,memdep);
			o[i].show();
			
		}
		
		

	}

}

