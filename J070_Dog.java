package Java2;

public class J070_Dog {
	public static void main(String[] args) {
   Dog dog = new Dog("���","��ɫ",3);
   dog.display();
}
}
class Dog{
	private String name;
	private String color;
	private int age;
	public Dog(String name, String color, int age) {
		this.name=name;
		this.color=color;
		this.age=age;
	}
	public void display() {
		System.out.println("���֣�"+name+"  "+"��ɫ��"+color+"  "+"����:"+age);
	}
}