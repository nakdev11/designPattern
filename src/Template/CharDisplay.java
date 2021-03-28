package Template;

class CharDisplay extends AbstractDisplay {

	private char c;

	CharDisplay(char c) {
		this.c = c;
	}

	@Override
	public void open() {
		System.out.print("<<");
	}

	@Override
	public void print() {
		System.out.print(c);
	}

	@Override
	public void close() {
		System.out.println(">>");
	}

}
