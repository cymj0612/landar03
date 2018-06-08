package Java2;

public class j060_Books {
   public static void main(String[] args) {
	   Books book =new Books("《Java从入门到精通（第2版）》","明日科技","59.8元");
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
		System.out.println("图书信息： 书名："+title);
		System.out.println("作者："+author);
		System.out.println("价格："+price);
	}
}