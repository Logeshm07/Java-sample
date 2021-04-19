package sample;

public class StaticClass {
			int id;
			String empname;
			static String ceo;
			static
			{
			 ceo="Prasanth";
			//System.out.println("static");
			}
			public StaticClass()
			{
				id=1;
				empname ="kalai";
						
			}
			void perform()
			{
				System.out.println(id+":"+empname+":"+ceo);
				//System.out.println("Non static");

			}
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticClass sc=new 	StaticClass();
		sc.perform();
		StaticClass sc1=new StaticClass();
		sc1.perform();
	}

}
