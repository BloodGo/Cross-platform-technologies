package labwork5_21;

public class Scout implements Plane{

	private String planes;
	public Scout() {
		planes = "Curtiss O-52 Owl, Northrop F-15 Reporter, Mitsubishi Ki-15 \n";
	}
	@Override
	public String fly() {
		return planes;
	}
}
