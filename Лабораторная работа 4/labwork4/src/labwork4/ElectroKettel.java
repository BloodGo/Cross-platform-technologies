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
			System.out.println("Чайник включен!");
		}
		else System.out.println("Нельзя включить устройство не закрыв крышку!");
	}
	public void stateOff () {
		state = false;
		System.out.println("Чайник выключен!");
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
		System.out.println("Электрочайник "+ number);
		System.out.println("Состояние: " + ((state)?"ON":"OFF"));
		if(timer)
			System.out.println("Таймер на "+ timer_time);
		else System.out.println("Состояние таймера: "+ ((timer)?"ON":"OFF"));
	}

}
