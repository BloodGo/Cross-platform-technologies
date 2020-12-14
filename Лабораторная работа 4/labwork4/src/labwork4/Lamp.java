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
		System.out.println("Яркость установлена!");
	}
	
	public void stateOn () {
		if ((bright>5)) {
			state = true;
			System.out.println("Светильник включен!");
		}
		else System.out.println("Яркость должна быть больше 5%!");
	}
	public void stateOff () {
		state = false;
		System.out.println("Светильник выключен!");
	}
	
	public void timer (String timme) {
		if(timme=="") {
			timer = false;
			System.out.println("Таймер выключен!");
		}
		else {
			timer = true;
			timer_time = timme;
			System.out.println("Таймер установлен!");
		}
	}
	public void getPrint(int number) {
		System.out.println("Светильник "+ number);
		System.out.println("Состояние: " + ((state)?"ON":"OFF"));
		System.out.println("Яркость: " + (bright) + "%");
		if(timer)
			System.out.println("Таймер на "+ timer_time);
		else System.out.println("Состояние таймера: "+ ((timer)?"ON":"OFF"));
	}
	

}
