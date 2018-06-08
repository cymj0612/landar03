package Java2;

public class J066_Multiplication {
    public static void main(String[] args) {
    Multiplication multi = new Multiplication();
    multi.mul(3, 4);
    multi.mul(3.66, 4.22, 5.77);
    }
}

class  Multiplication{
	public void mul(int a, int b) {
	    int	m = a*b;
		System.out.println(a+"*"+b+"="+m);
	}
	public void mul(double a, double b, double c) {
	    double	n = a*b;
		System.out.println(a+"*"+b+"*"+c+"="+n);
	}
}