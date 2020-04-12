class Receipt
{	List<Item> = new List<Item>();
public:
	SLLNode<List> tmp=List.getFirst();
	int zbir=0;
	while(tmp != null)
	{
		zbir+=tmp.element.getPrice;
	}
}