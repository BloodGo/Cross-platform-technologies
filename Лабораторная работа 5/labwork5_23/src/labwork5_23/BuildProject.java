package labwork5_23;

public abstract class BuildProject {

	public abstract String getName();
	public abstract String getBuildingType();
	public abstract String getCountFloars();
	public abstract String getColor();
	public abstract String getFoundation();
	public abstract String getFloarCarcass();
	public abstract String getWiring();
	public abstract String getPlumbing();
	public abstract String getCountRooms();
	public final String getCarcassBuild() {
		String carcass = "Железобетонный";
		return carcass;
	}
	public final void BuildingPlan() {
		System.out.println("\tПлан здания - " + getName());
		System.out.println("Каркас здания: " + getCarcassBuild());
		System.out.println("Тип здания: " + getBuildingType());
		System.out.println("Количество этажей: " + getCountFloars());
		System.out.println("Цвет здания: " + getColor());
		System.out.println("Фундамент здания: " + getFoundation());
		System.out.println("\tПлан этажа:");
		System.out.println("Каркас этажа: " + getFloarCarcass());
		System.out.println("Количество комнат: " + getCountRooms());
		System.out.println("Электропроводка: " + getWiring());
		System.out.println("Сантехника: " + getPlumbing());
	}
}
