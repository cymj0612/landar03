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
		System.out.println("�� " + A + " �ƶ����� " + disks + " �ŵ� " + B);
	}

	public static void hanoi(int n, char A, char B, char C) {
		if (n == 1) {
			J075_Hanoi.move(1, A, C);
		} else {
			hanoi(n - 1, A, C, B);// ��n-1�����ӣ��ƶ���B�ϣ�����C
			J075_Hanoi.move(n, A, C);
			hanoi(n - 1, B, A, C);// �ٰ�n-1�����Ӵ�B���ƶ���C��
		}
	}

}
