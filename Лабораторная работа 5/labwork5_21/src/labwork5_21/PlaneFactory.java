package labwork5_21;

public class PlaneFactory extends AbstractFactory{
	@Override
	public Plane getPlane(String planeType) {
		if (planeType.equalsIgnoreCase("AGRICULTURE")) {
			return new Agricultural();
		}
		else if (planeType.equalsIgnoreCase("AMBULANCE")) {
			return new Ambulance();
		}
		else if (planeType.equalsIgnoreCase("SCOUT")) {
			return new Scout();
		}
		return null;
	}
	@Override
	public Plant getPlant(String plant) {
		return null;
	}
}
