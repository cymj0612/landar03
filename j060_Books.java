package Java2;

public class j060_Books {
   public static void main(String[] args) {
	   Books book =new Books("��Java�����ŵ���ͨ����2�棩��","���տƼ�","59.8Ԫ");
	   book.display();
   }
}

class Books{
	private String title;
	private String author;
	private String price;
	public Books(String title, String author, String price) {
		this.title=title;
		this.author=author;
		this.price=price;
	}
	public void display() {
		System.out.println("ͼ����Ϣ�� ������"+title);
		System.out.println("���ߣ�"+author);
		System.out.println("�۸�"+price);
	}
}