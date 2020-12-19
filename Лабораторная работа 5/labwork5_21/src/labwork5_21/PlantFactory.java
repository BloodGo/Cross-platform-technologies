package labwork5_21;

public class PlantFactory extends AbstractFactory{
	@Override
	public Plane getPlane(String plane) {
		return null;
	}
	@Override
	public Plant getPlant(String plantType) {
		if (plantType.equalsIgnoreCase("ForAgricultural")) {
			return new PlantForAgri();
		}
		else if (plantType.equalsIgnoreCase("ForAmbulance")) {
			return new PlantForAmbul();
		}
		else if (plantType.equalsIgnoreCase("ForScout")) {
			return new PlantForScout();
		}
		return null;
	}
}
