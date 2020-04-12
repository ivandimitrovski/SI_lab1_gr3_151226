class Item {
	int id;
	String name;
	double price;
	char dodatok[3];

	//TODO add variable.
public:
	Item(int id=0; String name=""; double price=0; char dodatok='')
	{
		this id=id;
		this name=name;
		this price=price;
		for (i=0;i<3;i)++
		{
		this dodatok=dodatok;
		}
	}

	int getId()
	{ return this id; }

	String getName()
	{ return this name; }

	double getPrice()
	{ return this price; }

	char getDodatok()
	{ return this dodatok; }
	
	void setId(int id)
	{ this id=id; }

	void setName(String name)
	{ this name=name; }

	void setPrice(double price)
	{ this price=price }

	void setDodatok(char dodatok)
	{ this dodatok=dodatok }



	double taxReturn () 
	{
	int sum=0;
	if (dodatok=='A')  sum=item.getPrice*1.18;
	if (dodatok=='B')  sum=item.gerPrice*1.05;
	if (dodatok=='C')  sum=item.getPrice;
	return sum*0.15;
	}
}