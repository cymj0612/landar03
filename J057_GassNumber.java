package Java2;

import java.util.Scanner;

public class J057_GassNumber {
	   public static void main(String[] agrs) {
		   A a= new A();
		   Scanner scanner = new Scanner(System.in);//newΪһ����������ڴ棬���ߴ���һ����ʵ��
		   int num = scanner.nextInt();
		   if(num > a.v) {
			   System.out.println("�´���");
		   }else if(num < a.v) {
			   System.out.println("��С��");
		   }else {
			   System.out.println("�²�ɹ�");
		   }
	   }
}	
//�¶�����࣬һ��Ҫ����ԭ�������   
   class A{
	   int v=100;
   }

