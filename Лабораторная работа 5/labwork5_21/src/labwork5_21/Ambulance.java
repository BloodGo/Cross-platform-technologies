package labwork5_21;

public class Ambulance implements Plane {

	private String planes;
	public Ambulance() {
		planes = " ��-2, ��-28, �-410, ��-104 \n";
	}
	@Override
	public String fly() {
		return planes;
	}
}
