package Java2;

public class J067_Employee {
    public static void main(String[] args) {
    	Employee employee = new Employee("001","Ami",4000.00,1500.00);
    	employee.add(4000.00, 1500.00);
    }
}

class Employee{
	String id;
	String name;
	double salary;
	double addsalary;
	public Employee(String id, String name, double salary, double addsalary) {
	 this.id=id;
	 this.name=name;
	 this.salary=salary;
	 this.addsalary=addsalary;
	}
	public void add(double salary, double addsalary) {
	double	totalsalary=salary + addsalary;
	System.out.println("��ţ�"+id+" "+"������"+name+" "+"����н��:"+salary+" "+"нˮ�����"+addsalary+" "+"�����ܶ"+totalsalary);
	}
}
