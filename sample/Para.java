package sample;

public class Para {
	int id;
	String name;
	double number;
	int marks;
	int n=60;

	public Para(int n)
	{
		System.out.println(n+" "+n);
	}
	public Para(int id,String name)
	{
		System.out.println(id+" "+name);
	}
	public Para(int id,String name,double number)
	{
		System.out.println(id+" "+name+" "+number);
	}
	public Para(int i,String j,int k)
	{	id=i;
		name=j;
		marks=k;
	
		System.out.println(i+" "+j+" "+k);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Para pa=new Para(32,"Logesh");
		Para pa1=new Para(34,"Vera",54.3);
		Para pa2=new Para(34,"logesh",54);
		Para paa=new Para(5);
		
		
	}

}
