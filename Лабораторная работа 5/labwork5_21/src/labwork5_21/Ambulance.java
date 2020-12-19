package labwork5_21;

public class Ambulance implements Plane {

	private String planes;
	public Ambulance() {
		planes = " Ан-2, Ан-28, Л-410, Ту-104 \n";
	}
	@Override
	public String fly() {
		return planes;
	}
}
