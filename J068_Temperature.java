package Java2;

import java.util.Scanner;

public class J068_Temperature {
  public static void main(String[] args) {
	  Scanner scanner = new Scanner(System.in);
	  double tempe = scanner.nextFloat();
	  System.out.println("���϶�Ϊ��"+translate(tempe)); //��static double���巽��ʱ�����ܰ��ճ���ı���.������()����Ӧ���Ƿ�����������
  }
    
  public static double translate(double temp) {
	  double fahrenheit = 1.8 * temp + 32;
	  return fahrenheit;  //���ַ�ʽ�����������Ҫreturn����ֵ
  }
}
