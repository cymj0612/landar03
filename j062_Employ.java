package Java2;

public class j062_Employ {
  public static void mian(String[] args) {
	  Employ employ = new Employ("白发魔女",21,"女",6000);
	  employ.print();
  }
}
 
class Employ{
	private String name;
	private int age;
	private String sex;
	private int salary;
	public Employ(String name, int age, String sex, int salary) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.salary = salary;
	}
	public void print(){
		System.out.println("姓名："+name+"年龄："+age+"性别："+sex+"薪水："+salary);
	}
}