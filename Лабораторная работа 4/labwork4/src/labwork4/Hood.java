package labwork4;

public class Hood {

	private boolean state;
	private boolean timer;
	private String timer_time;
	private String mode;
	
	public Hood() {
		timer = false;
		state = false;
		timer_time = "";
		mode = "Min";
	}
	
	public void setMode (String mode) {
		this.mode = mode;
	}
	public void stateOn () {
		state = true;
		System.out.println("������� ��������!");
	}
	public void stateOff () {
		state = false;
		System.out.println("������� ���������!");
	}
	public void timer (String timme) {
		if (timme=="") {
			timer = false;
			System.out.println("������ ��������!");
		} 
		else 
		{
			timer = true;
			timer_time = timme;
			System.out.println("������ ����������!");
		}
	}
	public void getPrint(int number) {
		System.out.println("������� "+ number);
		System.out.println("���������: " + ((state)?"ON":"OFF"));
		System.out.println("����� ������: "+ mode);
		if(timer)
			System.out.println("������ �� "+ timer_time);
		else System.out.println("��������� �������: "+ ((timer)?"ON":"OFF"));
	}

}
