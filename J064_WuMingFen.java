package Java2;

public class J064_WuMingFen {
      public static void main(String[] args) {
      WuMingFen f1 = new WuMingFen("ţ��",3,true);
      WuMingFen f2 = new WuMingFen("ţ��",2);
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
		this.theMa="������";
		this.quantity=2;
		this.likeSoup=true;
	}
	
	public void check() {
		System.out.println("���룺"+theMa);
		System.out.println("�۵ķ�����"+quantity);
		if(!this.refer) {System.out.println("�Ƿ������"+(this.likeSoup==true?"����":"������"));
	}else {
		System.out.println("�Ƿ������δ֪");
	}
  }
}