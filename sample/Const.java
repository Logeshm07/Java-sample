package sample;

public class Const {
	int i=5;

	public Const()
	{
		System.out.println(i);
	}
	Const(int log)
	{
		int k=log;
		System.out.println(log);
		
	}

	public static void main(String[] args) {
		
		Const c=new Const();
		Const c1=new Const(5442);
		

	}

}
