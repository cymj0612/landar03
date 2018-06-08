package Java2;

public class J060_Person {
	public static void main(String[] args) {
		Person person = new Person("张三", 23);
		person.display();
	}
}

class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void display() { // 定义方法需要声明viod或者static类型
		System.out.println("姓名:" + name + " " + "年龄:" + age);
	}
}
