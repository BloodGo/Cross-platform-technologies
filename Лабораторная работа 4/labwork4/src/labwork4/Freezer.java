package labwork4;

public class Freezer implements Devices{

	private boolean state;
	private boolean timer;
	private String timer_time;
	private int temp;
	private String mode;
	
	public Freezer() {
		timer = false;
		state = false;
		temp=0;
		timer_time = "";
		mode = "";
	}
	public Freezer(int temp) throws Exception {
		setTemperature(temp);
	}
	
	public void setTemperature(int temp) throws Exception {
		try {
			if((temp<=-1)&&(temp>=-20)) {
				this.temp = temp;
				System.out.println("����������� � ����������� ������ �����������!");
			}
			else throw new Exception("����������� � ����������� ������ ������ ���� �� -1 �� -20!");
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}
	public void setMode (String mode) {
		this.mode = mode;
	}
	public void stateOn () {
		state = true;
		System.out.println("����������� ������ ��������!");
	}
	public void stateOff () {
		state = false;
		System.out.println("����������� ������ ���������!");
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
		System.out.println("����������� ������ "+ number);
		System.out.println("���������: " + ((state)?"ON":"OFF"));
		if (temp == 0) 
			System.out.println("����������� � ����������� ������ �� ������!");
		else
			System.out.println("����������� ����������� ������: "+ temp +" ��������");
		System.out.println("����� ������: "+ mode);
		if(timer)
			System.out.println("������ �� "+ timer_time);
		else System.out.println("��������� �������: "+ ((timer)?"ON":"OFF"));
	}

}
