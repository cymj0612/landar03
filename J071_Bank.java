package Java2;

public class J071_Bank {
  public static void main(String[] args) {
	  Bank information = new Bank("�Ƴ���",1314.52);
	  information.print();
  }
}
class Bank{
	private String name;
	private double overage;
	public Bank(String name, double overage) {
		this.name = name;
		this.overage=overage;
	}
	public void print() {
		System.out.println("�˻����ƣ�"+name+"   "+"��"+overage);
	}
}