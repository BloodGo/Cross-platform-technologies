package labwork5_22;

public class DecoratorPatternDemo {

	public static void main(String[] args) {
		Card electronic = new ElectroCard(); 
		Card passElectroCard = new PassportCardDecorator(new ElectroCard());
		Card insurBankCard = new InsuranceCardDecorator(new BankCard());
		System.out.println("Normal Electronic card ");
		electronic.use();
		System.out.println("\nElectronic card with passport");
		passElectroCard.use();
		System.out.println("\nBanking card with insurance ");
		insurBankCard.use();
	}

}
