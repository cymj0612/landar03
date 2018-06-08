package Java2;

public class J065_Vehicles {
	public static void main(String[] args) {
	Vehicles v= new Vehicles("����","��ɫ");
	v.run();
	v.showInfo();
	Car car = new Car("����","��ɫ",4);
	car.run();
	car.showCar();
	Truck truck =new Truck("����","��ɫ",4.5f);
	truck.run();
	truck.showTruck();
  }
}

class Vehicles{
	String brand;
	String color;
	public Vehicles(String brand, 	String color) {
		this.brand=brand;
		this.color=color;
	}
	public void run() {
		System.out.println("���Ѿ�������");
	}
	public void showInfo() {
		System.out.println("�̱꣺"+brand+"  "+"��ɫ��"+color);
	}
}

class Car extends Vehicles{
	int seats;
	public Car(String brand, String color, int seats) {
		super(brand,color);  //super����ָ��ǰ����ĸ���
		this.seats=seats; //��ʾָ��������һ��ָ��
	}
	public void showCar() {
		System.out.println("�̱꣺"+brand+"  "+"��ɫ��"+color+"  "+"��λ����"+seats);
	}
}

class Truck extends Vehicles{
	float load;
	public Truck(String brand, String color, float load) {
		super(brand,color);  //super����ָ��ǰ����ĸ���
		this.load=load; //��ʾָ��������һ��ָ��
	}
	public void showTruck() {
		System.out.println("�̱꣺"+brand+"  "+"��ɫ��"+color+"  "+"�����أ�"+load);
	}
}
