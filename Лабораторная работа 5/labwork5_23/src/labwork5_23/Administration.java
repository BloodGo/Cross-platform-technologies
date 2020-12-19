package labwork5_23;

public class Administration extends BuildProject {
	private String name, type, color, carcass, found, wire, plumb;
	private int floars, rooms;
	
	public Administration() {
		name = "Администрация";
		type = "Здание";
		color = "Коричневый";
		carcass ="Бетонный";
		found = "Плитный";
		wire = "Скрытая";
		plumb = "Паралельная";
		floars = 7;
		rooms = 5;
	}
	@Override
	public String getName() {
		return name;
	}
	@Override
	public String getBuildingType() {
		return type;
	}
	@Override
	public String getCountFloars() {
		return String.valueOf(floars);
	}
	@Override
	public String getColor() {
		return color;
	}
	@Override
	public String getFoundation() {
		return found;
	}
	@Override
	public String getFloarCarcass() {
		return carcass;
	}
	@Override
	public String getWiring() {
		return wire;
	}
	@Override
	public String getPlumbing() {
		return plumb;
	}
	@Override
	public String getCountRooms() {
		return String.valueOf(rooms);
	}

}
