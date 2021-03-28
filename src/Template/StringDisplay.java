package Template;

class StringDisplay extends AbstractDisplay {

	String str;

	StringDisplay(String str) {
		this.str = str;
	}

	@Override
	public void open() {
		System.out.print("+");
		for (int i = 0; i < str.length(); i++) {
			System.out.print("-");
		}
		System.out.println("+");
	}

	@Override
	public void print() {
		System.out.println("|" + str + "|");
	}

	@Override
	public void close() {
		System.out.print("+");
		for (int i = 0; i < str.length(); i++) {
			System.out.print("-");
		}
		System.out.println("+");
	}

}
