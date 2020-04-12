class Item {
	int id;
	String name;
	double price;
	char tipDanok;
	//TODO add variable.

	//TODO constructor

	public Item(int id) {
		this.id = id;
	}

	//TODO setters and getters

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public char getTipDanok() {
		return tipDanok;
	}

	public void setTipDanok(char tipDanok) {
		this.tipDanok = tipDanok;
	}


	//TODO
	double getTaxReturn(int price){
		return (double) price * (15/100);
	}
}