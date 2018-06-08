package Java2;

public class J063_Vehicle {
  public static void main(String[] args) {
	  Vehicle v = new Vehicle();
	  v.setSize(280);
	  v.setSpeed(60);
	  System.out.println("当前速度："+v.speed);//如果将speed定义为private,则不能用v.speed
	  v.move();
	  v.speedUp();
	  v.speedDown();
  }
}

class Vehicle{
	 int speed;
	private int size;
	public void move() {
		System.out.println("已启动");
	} 
	public void setSpeed(int speed) {
		this.speed=speed;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public void speedUp() {
		speed += 2;
		System.out.println("加速后速度："+speed);
	}
	public void speedDown() {
		if(speed>5) {
			speed -= 5;
			System.out.println("减速后速度："+speed);
		}else {System.out.println("已停止");}
	}
}