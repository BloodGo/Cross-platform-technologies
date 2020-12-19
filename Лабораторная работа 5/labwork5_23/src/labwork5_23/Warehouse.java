package labwork5_23;

public class Warehouse extends BuildProject {
	private String name, type, color, carcass, found, wire, plumb;
	private int floars, rooms;
	
	public Warehouse() {
		name = "Склад";
		type = "Сооружение";
		color = "Белый";
		carcass ="Бетонный";
		found = "Ленточный";
		wire = "Открытая";
		plumb = "Последовательная";
		floars = 1;
		rooms = 4;
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
