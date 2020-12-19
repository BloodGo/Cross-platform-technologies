package labwork5_22;

public class InsuranceCardDecorator extends FunctionCardDecorator{

	public InsuranceCardDecorator(Card decoratedCard) {
		super(decoratedCard);
	}
	@Override
	public void use() {
		decoratedCard.use();
		insuranceCard();
	}
	
	public void insuranceCard() {
		System.out.println("Function: Include Insurance");
	}

}
