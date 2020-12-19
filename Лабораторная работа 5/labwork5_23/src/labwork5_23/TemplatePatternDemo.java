package labwork5_23;

public class TemplatePatternDemo {

	public static void main(String[] args) {
		BuildProject building = new Administration();
		building.BuildingPlan();
		System.out.println("");
		building = new Warehouse();
		building.BuildingPlan();
	}

}
