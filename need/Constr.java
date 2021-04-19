package need;
public class Constr {
	int id;
	String name;
	public Constr()
	{
		id=10;
		name="Vera";
		System.out.println(id+" "+name);
	}
	public Constr(int id)
	{
		System.out.println(id);
	}
	public Constr(int id,String name,int number)
	{
		System.out.println(id+" "+number+" "+name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constr c=new Constr();
		Constr c1=new Constr(98);
		Constr c2=new Constr(98,"vera",87);

	}

}
