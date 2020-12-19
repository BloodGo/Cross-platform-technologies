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
		String carcass = "��������������";
		return carcass;
	}
	public final void BuildingPlan() {
		System.out.println("\t���� ������ - " + getName());
		System.out.println("������ ������: " + getCarcassBuild());
		System.out.println("��� ������: " + getBuildingType());
		System.out.println("���������� ������: " + getCountFloars());
		System.out.println("���� ������: " + getColor());
		System.out.println("��������� ������: " + getFoundation());
		System.out.println("\t���� �����:");
		System.out.println("������ �����: " + getFloarCarcass());
		System.out.println("���������� ������: " + getCountRooms());
		System.out.println("���������������: " + getWiring());
		System.out.println("����������: " + getPlumbing());
	}
}
