package sample;

public class Method_Calling {
	
	public void perform()
	{
		int i=20;
		System.out.println(i);
	}
	public void perform(int i)
	{
		System.out.println(i);
	}
	public void perform(int i,int j)
	{
		System.out.println(i);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method_Calling mc = new Method_Calling();
		mc.perform();
		mc.perform(30,40);
		mc.perform(45);
	}

}
