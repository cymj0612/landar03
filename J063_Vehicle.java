package Java2;

public class J063_Vehicle {
  public static void main(String[] args) {
	  Vehicle v = new Vehicle();
	  v.setSize(280);
	  v.setSpeed(60);
	  System.out.println("��ǰ�ٶȣ�"+v.speed);//�����speed����Ϊprivate,������v.speed
	  v.move();
	  v.speedUp();
	  v.speedDown();
  }
}

class Vehicle{
	 int speed;
	private int size;
	public void move() {
		System.out.println("������");
	} 
	public void setSpeed(int speed) {
		this.speed=speed;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public void speedUp() {
		speed += 2;
		System.out.println("���ٺ��ٶȣ�"+speed);
	}
	public void speedDown() {
		if(speed>5) {
			speed -= 5;
			System.out.println("���ٺ��ٶȣ�"+speed);
		}else {System.out.println("��ֹͣ");}
	}
}