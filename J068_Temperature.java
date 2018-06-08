package Java2;

import java.util.Scanner;

public class J068_Temperature {
  public static void main(String[] args) {
	  Scanner scanner = new Scanner(System.in);
	  double tempe = scanner.nextFloat();
	  System.out.println("华氏度为："+translate(tempe)); //用static double定义方法时，不能按照常规的变量.方法名()，而应该是方法（变量）
  }
    
  public static double translate(double temp) {
	  double fahrenheit = 1.8 * temp + 32;
	  return fahrenheit;  //这种方式定义变量，需要return返回值
  }
}
