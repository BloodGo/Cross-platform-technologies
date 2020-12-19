package labwork5_21;

public class Agricultural implements Plane{

	private String planes;
	public Agricultural() {
		planes = "Т-500,  Ми-2, Cessna 188 AGWagon \n";
	}
	@Override
	public String fly() {
		return planes;
	}
}

