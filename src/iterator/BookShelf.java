package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookShelf {

	private List<Book> books = new ArrayList<>();

	public Book getBookAt(int index) {
		return books.get(index);
	}

	public void appendBook(Book book) {
		books.add(book);
	}

	public int getLength() {
		return books.size();
	}

	public Iterator iterator() {
		return new BookShelfIterator(this);
	}
}
