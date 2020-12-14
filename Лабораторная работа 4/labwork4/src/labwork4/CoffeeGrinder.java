package labwork4;

public class CoffeeGrinder implements Devices {

	private boolean state;
	private boolean timer;
	private String timer_time;
	private String mode;
	
	public CoffeeGrinder() {
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
		System.out.println("Кофемолка включена!");
	}
	public void stateOff () {
		state = false;
		System.out.println("Кофемолка выключена!");
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
		System.out.println("Кофемолка "+ number);
		System.out.println("Состояние: " + ((state)?"ON":"OFF"));
		System.out.println("Режим работы: "+ mode);
		if(timer)
			System.out.println("Таймер на "+ timer_time);
		else System.out.println("Состояние таймера: "+ ((timer)?"ON":"OFF"));
	}

}
