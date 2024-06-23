package herarchical_programs;
import java.util.*;
class movie
{
	String title;
    double amount;
    int n_oftickets;
    
    movie(String title,double amount,int n_oftickets)
    {
    	this.title=title;
    	this.amount=amount;
    	this.n_oftickets=n_oftickets;
    }
    void display()
    {
    	System.out.println("movie name: "+title);
    	System.out.println("ticket price : "+amount);
    	System.out.println("number of tickets : "+n_oftickets);
    }
}
class tax_movie extends movie
{
	double tax;
	double finalamount;
	tax_movie(String title,double amount,int n_oftickets)
	{
		super(title,amount,n_oftickets);
		this.tax=tax;
		this.finalamount=finalamount;
	}
	void show()
	{
		tax=amount*0.05;
		finalamount=amount+tax;
		System.out.println("tax amount :"+tax);
		System.out.println("fianal amount : "+finalamount);
	}
	
	
}
class tax_free extends movie
{
	double totalamount;
	tax_free(String title,double amount,int n_oftickets)
	{
		super(title,amount,n_oftickets);
		this.totalamount=totalamount;
	}
	void show1()
	{
		totalamount=n_oftickets*amount;
		System.out.println(" total tickets price : "+totalamount);
	}
}
public class movie_07 
{

	public static void main(String[] args) 
	{
		int i,ch,n;
		String title;
	    double amount,tax,finalamount,totalamount;
	    int n_oftickets;
	    Scanner shubham=new Scanner(System.in);	
	    System.out.println("enter the name of the movie");
	    title=shubham.next();
	    System.out.println("enter the amount and the number of tickets");
	    amount=shubham.nextDouble();
	    n_oftickets=shubham.nextInt();
	    
	    
	    
	    tax_movie t1=new tax_movie(title,amount,n_oftickets);
	    t1.display();
	    t1.show();
	    
	    tax_free t2=new tax_free(title,amount,n_oftickets);
	    t2.display();
	    t2.show1();
	    
	    System.out.println("enter the number of records");
	    n=shubham.nextInt();
	    movie m1[]=new movie[n];
	    
	    for(i=1;i<=n;i++)
	    {
	    	System.out.println("enter the title ");
	    	title=shubham.next();
	    	System.out.println("enter the amount");
	    	amount=shubham.nextDouble();
	    	System.out.println("enter the number of tickets");
	    	n_oftickets=shubham.nextInt();
	    	m1[i].display();
	    	
	    	
	    }
		
	  

	}

}
