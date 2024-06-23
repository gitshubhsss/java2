package herarchical_programs;
import java.util.*;
class mainemp
{
	double id;
	String name,deg;
	mainemp(double id,String name,String deg)
	{
		this.id=id;
		this.name=name;
		this.deg=deg;
		
	}
	void display()
	{
		System.out.println("employee id : "+id);
		System.out.println("name - "+name);
		System.out.println("designation -"+deg);
	}
}
class part_time extends mainemp
{
	double hr_rate,sl;
	int n_hr;
	part_time(double id,String name,String deg,double hr_rate,int n_hr)
	{
		super(id,name,deg);
		this.hr_rate=hr_rate;
		this.n_hr=n_hr;
	}
	void show()
	{
		System.out.println("hr rate ="+hr_rate);
		System.out.println("numner of hr="+n_hr);
		sl=(n_hr*hr_rate);
		System.out.println("sallary = "+sl);
	}
}
class full_time extends mainemp
{
	double day_rate,sal;
	int n_day;
	full_time(double id,String name,String deg,double day_rate,int n_day)
	{
		super(id,name,deg);
		this.day_rate=day_rate;
		this.n_day=n_day;
	}
	void show1()
	{
		System.out.println("day rate ="+day_rate);
		System.out.println("number of days "+n_day);
	    System.out.println("sallary:"+n_day*day_rate);
	}
	
}
public class heracchical_01 
{

	public static void main(String[] args) 
	{
		double id,hr_rate,sl,day_rate,sal;
		String name,deg;
		int n_hr, n_day;
		int ch;
		Scanner shubham=new Scanner(System.in);
		do
		{
			System.out.println("1: Accept details from part time employee");
			System.out.println("2: Accept details from full time empoyee");
			System.out.println("3: Exit");
			System.out.println("Enter you choise");
			ch=shubham.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("enter employee id\tname\tdeg\tnumber of hr\thr rate");
				id=shubham.nextDouble();
				name=shubham.next();
				deg=shubham.next();
				n_hr=shubham.nextInt();
				hr_rate=shubham.nextDouble();
				part_time p1=new part_time(id,name,deg,hr_rate,n_hr);
				p1.display();
				p1.show();
				
				break;
			case 2:
				System.out.println("enter the emplyee id \tname\tdeg\tday_rate\tn_day");
				id=shubham.nextDouble();
				name=shubham.next();
				deg=shubham.next();
				day_rate=shubham.nextDouble();
				n_day=shubham.nextInt();
				full_time f1=new full_time(id,name,deg,day_rate,n_day);
				f1.display();
				f1.show1();
				
				break;
				
			case 3:
				System.exit(0);
				break;
				default:System.out.println("invalid choise entered");
				
			}
			
		}
		while(ch<=3);
	}
}

	


