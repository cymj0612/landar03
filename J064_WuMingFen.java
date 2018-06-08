package Java2;

public class J064_WuMingFen {
      public static void main(String[] args) {
      WuMingFen f1 = new WuMingFen("牛肉",3,true);
      WuMingFen f2 = new WuMingFen("牛肉",2);
      WuMingFen f3 = new WuMingFen();
      f1.check();
      f2.check();
      f3.check();
      }
}

class WuMingFen{
	String theMa;
	int quantity;
	boolean likeSoup;
	boolean refer=false;
	//
	public WuMingFen(String theMa, int quantity, boolean likeSoup) {
		this.theMa=theMa;
		this.quantity=quantity;
		this.likeSoup=likeSoup;
	}
	
	public WuMingFen(String theMa, int quantity) {
		this.theMa=theMa;
		this.quantity=quantity;
		this.refer=false;
	}
	
	public WuMingFen() {
		this.theMa="酸辣粉";
		this.quantity=2;
		this.likeSoup=true;
	}
	
	public void check() {
		System.out.println("面码："+theMa);
		System.out.println("粉的分量："+quantity);
		if(!this.refer) {System.out.println("是否带汤："+(this.likeSoup==true?"带汤":"不带汤"));
	}else {
		System.out.println("是否带汤：未知");
	}
  }
}