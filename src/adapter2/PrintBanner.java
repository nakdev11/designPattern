package adapter2;

class PrintBanner extends Print {

	private Banner banner;

	PrintBanner(String string) {
		this.banner = new Banner(string);
	}

	@Override
	void printWeek() {
		banner.showWithParen();
	}

	@Override
	void printStrong() {
		banner.showWithAster();
	}

}
