package Java2;

public class J059_Address {
  public static void main(String[] args) {
	  Address ad = new Address("中国","重庆","北碚","天生街道","400700");
	  ad.display();
  }
}

class Address{
	private String national;
	private String province;
	private String city;
	private String street;
	private String zipcode;
	public Address(String national, String province, String city, String street, String zipcode) {
		this.national=national;
		this.province=province;
		this.city=city;
		this.street=street;
		this.zipcode=zipcode;
	}
	public void display() {
		System.out.println(national+"，"+province+"，"+city+"，"+street+"，"+zipcode);
	}
}