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
				System.out.println("Температура в морозильной камере установлена!");
			}
			else throw new Exception("Температура в морозильной камере должна быть от -1 до -20!");
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}
	public void setMode (String mode) {
		this.mode = mode;
	}
	public void stateOn () {
		state = true;
		System.out.println("Морозильная камера включена!");
	}
	public void stateOff () {
		state = false;
		System.out.println("Морозильная камера выключена!");
	}
	public void timer (String timme) {
		if (timme=="") {
			timer = false;
			System.out.println("Таймер выключен!");
		} 
		else 
		{
			timer = true;
			timer_time = timme;
			System.out.println("Таймер установлен!");
		}
	}
	public void getPrint(int number) {
		System.out.println("Морозильная камера "+ number);
		System.out.println("Состояние: " + ((state)?"ON":"OFF"));
		if (temp == 0) 
			System.out.println("Температура в морозильной камеры не задана!");
		else
			System.out.println("Температура морозильной камеры: "+ temp +" градусов");
		System.out.println("Режим работы: "+ mode);
		if(timer)
			System.out.println("Таймер на "+ timer_time);
		else System.out.println("Состояние таймера: "+ ((timer)?"ON":"OFF"));
	}

}
