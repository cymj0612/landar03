package Java2;

public class J065_Vehicles {
	public static void main(String[] args) {
	Vehicles v= new Vehicles("宝马","银色");
	v.run();
	v.showInfo();
	Car car = new Car("宝马","银色",4);
	car.run();
	car.showCar();
	Truck truck =new Truck("宝马","银色",4.5f);
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
		System.out.println("我已经开动了");
	}
	public void showInfo() {
		System.out.println("商标："+brand+"  "+"颜色："+color);
	}
}

class Car extends Vehicles{
	int seats;
	public Car(String brand, String color, int seats) {
		super(brand,color);  //super用来指向当前对象的父类
		this.seats=seats; //表示指向对象本身的一个指针
	}
	public void showCar() {
		System.out.println("商标："+brand+"  "+"颜色："+color+"  "+"座位数："+seats);
	}
}

class Truck extends Vehicles{
	float load;
	public Truck(String brand, String color, float load) {
		super(brand,color);  //super用来指向当前对象的父类
		this.load=load; //表示指向对象本身的一个指针
	}
	public void showTruck() {
		System.out.println("商标："+brand+"  "+"颜色："+color+"  "+"车载重："+load);
	}
}
