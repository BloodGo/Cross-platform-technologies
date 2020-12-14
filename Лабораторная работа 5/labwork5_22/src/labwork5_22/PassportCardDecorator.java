package labwork5_22;

public class PassportCardDecorator extends FunctionCardDecorator{

	public PassportCardDecorator(Card decoratedCard) {
		super(decoratedCard);
	}
	@Override
	public void use() {
		decoratedCard.use();
		passportCard();
	}
	
	public void passportCard() {
		System.out.println("Function: Include Passport");
	}

}
