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
	System.out.println("编号："+id+" "+"姓名："+name+" "+"基本薪资:"+salary+" "+"薪水增长额："+addsalary+" "+"工资总额："+totalsalary);
	}
}
