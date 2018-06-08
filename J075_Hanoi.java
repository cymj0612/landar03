package Java2;

public class J075_Hanoi {
	public static void main(String[] args) {
		int n = 3;
		char A = 'A';
		char B = 'B';
		char C = 'C';
		J075_Hanoi.hanoi(n, 'A', 'B', 'C');
		int count = (int) (Math.pow(2, n) - 1);
		System.out.println(count);
	}

	public static void move(int disks, char A, char B) {
		System.out.println("从 " + A + " 移动盘子 " + disks + " 号到 " + B);
	}

	public static void hanoi(int n, char A, char B, char C) {
		if (n == 1) {
			J075_Hanoi.move(1, A, C);
		} else {
			hanoi(n - 1, A, C, B);// 将n-1个盘子，移动到B上，借助C
			J075_Hanoi.move(n, A, C);
			hanoi(n - 1, B, A, C);// 再把n-1个盘子从B上移动到C上
		}
	}

}
