package labwork4;

public class Kettle implements Devices{
	private boolean state;
	private boolean open;
	private boolean timer;
	String timer_time;
	public Kettle() {
		open=false;
	}
	public void openCap() {
		open=true;
		System.out.println("������ �������!");
	}
	public void closeCap() {
		open=false;
		System.out.println("������ �������!");
	}
	public void stateOn () {
		if ((!open)) {
			state = true;
			System.out.println("������ �������!");
		}
		else System.out.println("������ �������� ���������� �� ������ ������!");
	}
	public void stateOff () {
		state = false;
		System.out.println("������ ��������!");
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
		System.out.println("������������� "+ number);
		System.out.println("���������: " + ((state)?"ON":"OFF"));
		System.out.println("��������� ������:" + ((open)?"Open":"Closed"));
		if(timer)
			System.out.println("������ �� "+ timer_time);
		else System.out.println("��������� �������: "+ ((timer)?"ON":"OFF"));
	}

}
