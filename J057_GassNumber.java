package Java2;

import java.util.Scanner;

public class J057_GassNumber {
	   public static void main(String[] agrs) {
		   A a= new A();
		   Scanner scanner = new Scanner(System.in);//new为一个对象分配内存，或者创建一个新实例
		   int num = scanner.nextInt();
		   if(num > a.v) {
			   System.out.println("猜大了");
		   }else if(num < a.v) {
			   System.out.println("猜小了");
		   }else {
			   System.out.println("猜测成功");
		   }
	   }
}	
//新定义的类，一定要放在原类的外面   
   class A{
	   int v=100;
   }

