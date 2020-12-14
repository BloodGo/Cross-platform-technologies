package labwork4;

public class Lamp implements Devices{

	private boolean state;
	private boolean timer;
	private int bright;
	String timer_time;
	public Lamp() {
		bright=0;
	}
	public void setBrightness(int bright) {
		this.bright=bright;
		System.out.println("������� �����������!");
	}
	
	public void stateOn () {
		if ((bright>5)) {
			state = true;
			System.out.println("���������� �������!");
		}
		else System.out.println("������� ������ ���� ������ 5%!");
	}
	public void stateOff () {
		state = false;
		System.out.println("���������� ��������!");
	}
	
	public void timer (String timme) {
		if(timme=="") {
			timer = false;
			System.out.println("������ ��������!");
		}
		else {
			timer = true;
			timer_time = timme;
			System.out.println("������ ����������!");
		}
	}
	public void getPrint(int number) {
		System.out.println("���������� "+ number);
		System.out.println("���������: " + ((state)?"ON":"OFF"));
		System.out.println("�������: " + (bright) + "%");
		if(timer)
			System.out.println("������ �� "+ timer_time);
		else System.out.println("��������� �������: "+ ((timer)?"ON":"OFF"));
	}
	

}
