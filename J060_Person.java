package Java2;

public class J060_Person {
	public static void main(String[] args) {
		Person person = new Person("����", 23);
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

	public void display() { // ���巽����Ҫ����viod����static����
		System.out.println("����:" + name + " " + "����:" + age);
	}
}
