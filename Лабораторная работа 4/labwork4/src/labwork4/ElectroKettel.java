package labwork4;

public class ElectroKettel implements Devices{
	private boolean state;
	private boolean open;
	private boolean timer;
	String timer_time;
	public ElectroKettel() {
		open=false;
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
		if(timer)
			System.out.println("������ �� "+ timer_time);
		else System.out.println("��������� �������: "+ ((timer)?"ON":"OFF"));
	}

}
