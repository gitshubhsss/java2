package herarchical_programs;
import java.util.*;
class continent
{
   String conti,nation,state,place;
   continent(String conti,String nation,String state,String place)
   {
	   this.conti=conti;
	   this.nation=nation;
	   this.state=state;
	   this.place=place;
	  
   }
   void display()
   {
	   System.out.println("continent :"+conti);
	   System.out.println("contry : "+nation);
	   System.out.println("state : "+state);
	   System.out.println("place : "+place);   
   }
}
class contry extends continent
{
	String name;
	contry (String conti,String nation,String state,String place)
	{
		super(conti,nation,state,place);
	}
	void show()
	{
		contry c1=new contry(conti,nation,state,place);
		c1.display();
	}
}
class stat extends contry
{
	String na;
	stat(String conti,String nation,String state,String place)
	{
		super(conti,nation,state,place);	
	}
	void show1()
	{
		stat s1=new stat(conti,nation,state,place);
		s1.display();
	}
}
public class continent_07
{
	public static void main(String []args)
	{
		String conti,place;
		String nation;
		String state;
		Scanner shubham=new Scanner(System.in);
		System.out.println("enter the continet ");
		conti=shubham.next();
		System.out.println("enter the name of the contry");
		nation=shubham.next();
		System.out.println("enter the state");
		state=shubham.next();
		System.out.println("enter the place");
		place=shubham.next();
		stat s1=new stat(conti,nation,state,place);
		s1.display();
	}
}
