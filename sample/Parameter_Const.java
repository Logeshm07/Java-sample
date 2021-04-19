package sample;

public class Parameter_Const {

	
		int id;
		String name;
	
		Parameter_Const(int i,String n)
		{
			 id=i;
			 name=n;
				System.out.println(id+" "+name);
		}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parameter_Const pc = new Parameter_Const(23,"logesh");
		Parameter_Const pc1 = new Parameter_Const(24,"Vera");
	
	}

}
