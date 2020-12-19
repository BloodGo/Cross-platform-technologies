package labwork5_22;

public class FunctionCardDecorator implements Card{

	protected Card decoratedCard;
	public  FunctionCardDecorator(Card decoratedCard) {
		this.decoratedCard = decoratedCard;
	}
	public void use() {
		decoratedCard.use();
	}

}
