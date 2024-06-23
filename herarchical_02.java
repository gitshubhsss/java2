package herarchical_programs;
import java.util.*;
class Vehicle
{
	double price;
	String cname;
	
	Vehicle(double price,String cname)
	{
		this.price=price;
		this.cname=cname;
	}
	void display()
	{
		System.out.println("MRP price "+price);
		System.out.println("componey name : "+cname);
	}
}
class light_motar extends Vehicle
{
	double milage;
	light_motar(double price,String cname,double milage)
	{
		super(price,cname);
		this.milage=milage;
	}
	void show()
	{
		System.out.println("milage :"+milage);
	}
}
class heavy_motar extends Vehicle
{
	double capacity;
	double LRA;
	heavy_motar(double price,String cname,double LRA)
	{
		super(price,cname);
		this.capacity=capacity;
		this.LRA=LRA;
		
	}
	void show1()
	{
		System.out.println(" LRA="+LRA);
		capacity=LRA/36;
		System.out.println("capacity in tons"+capacity);
	}
}
public class herarchical_02 
{

	public static void main(String[] args) 
	{
		int ch,i,n;
		double price,capacity,milage,LRA;
		String cname;
		Scanner shubham=new Scanner(System.in);
		
		do
		{
			System.out.println("1:Enter the number of vehicles");
			System.out.println("2:Accept all the imformation of light motar");
			System.out.println("3:Accept all the imformation of heavy motar");
			System.out.println("4:Exit");
			System.out.println("Enter your choise");
			ch=shubham.nextInt();
			
			switch(ch)
			{
			case 1:
				System.out.println("enter the number of vehicles");
				n=shubham.nextInt();
				Vehicle v1[]=new Vehicle[n];//object creation	
				for(i=1;i<=n;i++)
				{
					System.out.println("enter the price and componey name");
					price=shubham.nextDouble();
					cname=shubham.next();
					v1[i]=new Vehicle(price,cname);
					v1[i].display();
					
					
					
				}
				break;
			
			case 2:
				System.out.println("enter the price\ncomponey name\nmilage");
				price=shubham.nextDouble();
				cname=shubham.next();
				milage=shubham.nextDouble();
				light_motar l1=new light_motar(price,cname,milage);
				l1.display();
				l1.show();
				
				break;
				
			case 3:System.out.println("enter the price \ncomponey name\nLRA");
			      price=shubham.nextDouble();
			      cname=shubham.next();
			      LRA=shubham.nextDouble();
			      heavy_motar h1=new heavy_motar(price,cname,LRA);
			      h1.display();
			      h1.show1();
			      break;
			      
			case 4:
				System.exit(0);
				break;
				default:System.out.println("invalid choise entered");
			      
			      
				
			}
			
		}while(ch<=4);

	}

}
