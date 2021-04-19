package sample;

public class StaticDemo {
	int id;
	String job;
	int salary;
	static String ceo;
	void show()
	{
		System.out.println(id+" "+job+" "+salary+" "+ceo);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticDemo logesh=new StaticDemo();
		logesh.id=667264;
		logesh.job="developer";
		logesh.salary=4349;
		//logesh.ceo="Santhosh";
		
		StaticDemo balaji=new StaticDemo();
		balaji.id=667254;
		balaji.job="Networking";
		balaji.salary=4359;
		//balaji.ceo="Prasanth";
		StaticDemo.ceo="Prasanth";
		logesh.show();
		balaji.show();
		
	}

}
