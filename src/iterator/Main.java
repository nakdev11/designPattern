package iterator;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		BookShelf bookShelf = new BookShelf();
		bookShelf.appendBook(new Book("独習Git"));
		bookShelf.appendBook(new Book("テスト駆動開発"));
		bookShelf.appendBook(new Book("デザインパターン入門"));
		bookShelf.appendBook(new Book("キングダム"));
		bookShelf.appendBook(new Book("ハイキュー"));

		Iterator it = bookShelf.iterator();
		while (it.hasNext()) {
			Book book = (Book)it.next();
			System.out.println(book.getName());
		}
	}
}
