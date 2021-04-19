package innerclass;

import innerclass.Employee.Manager;

public class InnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee ee=new Employee();
		ee.readable();
		Employee.Manager mg=ee.new Manager();
		mg.writeble();

	}

}
