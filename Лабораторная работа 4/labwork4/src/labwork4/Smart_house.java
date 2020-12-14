package labwork4;

//import java.lang.*;
import java.util.*;

public class Smart_house {
	private CoffeeGrinder[] coff = new CoffeeGrinder[2];
	private Hood[] hood = new Hood[2];
	private Lamp[] lamp = new Lamp[2];
	private Freezer[] freez = new Freezer[2];
	private Kettle[] ket = new Kettle[2];
	private Scanner in = new Scanner(System.in);
	public void addnew() 
	{
		System.out.println("Выберите устройство для добавления:");
		String name = device();
		int p;
		try {
			switch (name) {
			case "Вытяжка": {
				p=hnull(hood);
				if(p!=3) {
					inputH(p);
				}	else System.out.println("Что бы добавить новое устройство удалите старое!");		
				break;
				}
			case "Светильник": {
				p=lnull(lamp);
				if(p!=3) {
					inputL(p);
				}	else System.out.println("Что бы добавить новое устройство удалите старое!");
				break;
				}
			case "Кофемолка": {
				p=cnull(coff);
				if(p!=3) {
					inputC(p);
				}	else System.out.println("Что бы добавить новое устройство удалите старое!");
				break;
				}
			case "Морозильная камера":{
				p=fnull(freez);
				if(p!=3) {
					inputFre(p);
				}	else System.out.println("Что бы добавить новое устройство удалите старое!");
				break;
				}
			case "Электрочайник":{
				p=knull(ket);
				if(p!=3) {
					inputK(p);
				}	else System.out.println("Что бы добавить новое устройство удалите старое!");
				break;
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public void delete()  {
		int p,d;
		try{
			System.out.println("Выберите устройство для удаления");
			String name = device();
			switch(name) {
				case "Вытяжка": {
					p=hnull(hood);
					if((hood[0]==null)&&(hood[1]==null)) System.out.println("Нет устройств для удаления! ");
					else {
						if(p==3) {
							for(int i=0;i<hood.length;i++)
								hood[i].getPrint(i+1);
						} else if(p==-2) hood[1].getPrint(2);
						else hood[p-1].getPrint(p);
						System.out.println("Введите номер устройства для удаления: ");
						d=in.nextInt();
						hood[d-1] = null;
					}
					break;
				}
				case "Светильник": {
					p=lnull(lamp);
					if((lamp[0]==null)&&(lamp[1]==null)) System.out.println("Нет устройств для удаления! ");
					else {
						if(p==3) {
							for(int i=0;i<lamp.length;i++)
								lamp[i].getPrint(i+1);
						} else if(p==-2) lamp[1].getPrint(2);
						else lamp[p-1].getPrint(p);
						System.out.println("Введите номер устройства для удаления: ");
						d=in.nextInt();
						lamp[d-1] = null;
					}
				break;
				}
				case "Кофемолка": {
					p=cnull(coff);
					if((coff[0]==null)&&(coff[1]==null)) System.out.println("Нет устройств для удаления! ");
					else {
						if(p==3) {
							for(int i=0;i<coff.length;i++)
								coff[i].getPrint(i+1);
						} else if(p==-2) coff[1].getPrint(2);
						else coff[p-1].getPrint(p);
						System.out.println("Введите номер устройства для удаления: ");
						d=in.nextInt();
						coff[d-1] = null;
					}
				break;
				}
				case "Морозильная камера":{
					p=fnull(freez);
					if((freez[0]==null)&&(freez[1]==null)) System.out.println("Нет устройств для удаления! ");
					else {
						if(p==3) {
							for(int i=0;i<freez.length;i++)
								freez[i].getPrint(i+1);
						} else if(p==-2) freez[1].getPrint(2);
						else freez[p-1].getPrint(p);	
						System.out.println("Введите номер устройства для удаления: ");
						d=in.nextInt();
						freez[d-1] = null;
					}
				break;
				}
				case "Электрочайник":{
					p=knull(ket);
					if((ket[0]==null)&&(ket[1]==null)) System.out.println("Нет устройств для удаления! ");
					else {
						if(p==3) {
							for(int i=0;i<ket.length;i++)
								ket[i].getPrint(i+1);
						} else if(p==-2) ket[1].getPrint(2);
						else ket[p-1].getPrint(p);	
						System.out.println("Введите номер устройства для удаления: ");
						d=in.nextInt();
						ket[d-1] = null;
					}
				break;
				}
			}
		} catch (Exception e) { System.out.println(e.getMessage());}
	}
	public void change() {
		int p,d;
		try{
			System.out.println("Выберите устройство для изменения");
			String name  = device();
			switch(name) {
				case "Вытяжка": {
				p=hnull(hood);
				if((hood[0]==null)&&(hood[1]==null)) System.out.println("Нет устройств для изменения! ");
				else {
					if(p==3) {
						for(int i=0;i<hood.length;i++)
							hood[i].getPrint(i+1);
					} else if(p==-2) hood[1].getPrint(2);
					else hood[p-1].getPrint(p);	
					System.out.println("Введите номер устройства для изменения: ");
					d=in.nextInt();
					inputH(d-1);
				}
				break;
				}
				case "Светильник": {
					p=lnull(lamp);
					if((lamp[0]==null)&&(lamp[1]==null)) System.out.println("Нет устройств для изменения! ");
					else {
						if(p==3) {
							for(int i=0;i<lamp.length;i++)
								lamp[i].getPrint(i+1);
						} else if(p==-2) lamp[1].getPrint(2);
						else lamp[p-1].getPrint(p);	
						System.out.println("Введите номер устройства для изменения: ");
						d=in.nextInt();
						inputL(d-1);
					}
				break;
				}
				case "Кофемолка": {
					p=cnull(coff);
					if((coff[0]==null)&&(coff[1]==null)) System.out.println("Нет устройств для изменения! ");
					else {
						if(p==3) {
							for(int i=0;i<coff.length;i++)
								coff[i].getPrint(i+1);
						} else if(p==-2) coff[1].getPrint(2);
						else coff[p-1].getPrint(p);	
						System.out.println("Введите номер устройства для изменения: ");
						d=in.nextInt();
						inputC(d-1);
					}
				break;
				}
				case "Морозильная камера":{
					p=fnull(freez);
					if((freez[0]==null)&&(freez[1]==null)) System.out.println("Нет устройств для изменения! ");
					else {
						if(p==3) {
							for(int i=0;i<freez.length;i++)
								freez[i].getPrint(i+1);
						} else if(p==-2) freez[1].getPrint(2);
						else freez[p-1].getPrint(p);
						System.out.println("Введите номер устройства для изменения: ");
						d=in.nextInt();
						inputFre(d-1);
					}
				break;
				}
				case "Электрочайник":{
					p=knull(ket);
					if((ket[0]==null)&&(ket[1]==null)) System.out.println("Нет устройств для изменения! ");
					else {
						if(p==3) {
							for(int i=0;i<ket.length;i++)
								ket[i].getPrint(i+1);
						} else if(p==-2) ket[1].getPrint(2);
						else ket[p-1].getPrint(p);		
						System.out.println("Введите номер устройства для изменения: ");
						d=in.nextInt();
						inputK(d-1);
					}
				break;
				}
			}
		} catch (Exception e) { System.out.println(e.getMessage());}
	}
	public void showAll() {
		int k = hnull(hood);
		if((hood[0]!=null)||(hood[1]!=null)) {
			if (k==3) {
				for(int i=0;i<hood.length;i++)
					hood[i].getPrint(i+1);
			} else if(k==-2) hood[1].getPrint(2);
			else hood[k-1].getPrint(k);
		}else System.out.println("Нет доступных вытяжек!");
		k=lnull(lamp);
		if((lamp[0]!=null)||(lamp[1]!=null)) {
			if (k==3) {
				for(int i=0;i<lamp.length;i++)
					lamp[i].getPrint(i+1);
			} else if(k==-2)lamp[1].getPrint(2);
			else lamp[k-1].getPrint(k);
		}else System.out.println("Нет доступных светильников!");
		k=cnull(coff);
		if((coff[0]!=null)||(coff[1]!=null)) {
			if (k==3) {
				for(int i=0;i<coff.length;i++)
					coff[i].getPrint(i+1);
			} else if(k==-2)coff[1].getPrint(2);
			else coff[k-1].getPrint(k);
		}else System.out.println("Нет доступных кофемолок!");
		k=fnull(freez);
		if((freez[0]!=null)||(freez[1]!=null)) {
			if (k==3) {
				for(int i=0;i<freez.length;i++)
					freez[i].getPrint(i+1);
			} else if(k==-2)freez[1].getPrint(2);
			else freez[k-1].getPrint(k);
		}else System.out.println("Нет доступных морозильных камер!");
		k=knull(ket);
		if((ket[0]!=null)||(ket[1]!=null)) {
			if (k==3) {
				for(int i=0;i<ket.length;i++)
					ket[i].getPrint(i+1);
			} else if(k==-2)ket[1].getPrint(2);
			else ket[k-1].getPrint(k);
		}else System.out.println("Нет доступных чайников!");
	}
	private String device () {
		while(true) {
			System.out.print("1. Вытяжка"
					+ "\n2. Светильник"
					+ "\n3. Кофемолка"
					+ "\n4. Морозильная камера"
					+ "\n5. Электрочайник\n");
			int d = in.nextInt();
			switch (d) {
			case 1: return "Вытяжка";
			case 2: return "Светильник";
			case 3:return "Кофемолка";
			case 4: return "Морозильная камера";
			case 5: return "Электрочайник";
			default: 
			}
		}
		
	}
	private void inputH(int p) throws Exception {
		int d;
		try{
			System.out.println(" Вытяжка ");
			hood[p] = new Hood();
			System.out.print("Выберите режим:"
					+ "\n1. Min"
					+ "\n2. Medium"
					+ "\n3. Max\n");
			d = in.nextInt();
			switch (d) {
			case 2: hood[p].setMode("Medium"); break;
			case 3: hood[p].setMode("Max"); break;
			default: hood[p].setMode("Min"); break;
			}
			System.out.print("Установить таймер? 1. Да, 2. Нет ");
			d = in.nextInt();
			if(d==1) {
				System.out.print("Введите время: ");
				hood[p].timer(in.next());
			}
			System.out.print("Включить устройство? 1. Да, 2. Нет ");
			d = in.nextInt();
			if (d==1) hood[p].stateOn();
			else hood[p].stateOff();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	private void inputFre(int p) throws Exception {
		int d;
		try{
			System.out.println(" Морозильная камера ");
			freez[p] = new Freezer();
			System.out.print("Введите температуру: ");
			d = in.nextInt();
			freez[p].setTemperature(d);
			System.out.print("Выберите режим:"
					+ "\n1. Быстрая заморозка"
					+ "\n2. Защита от детей"
					+ "\n3. Без режима\n");
			d = in.nextInt();
			switch (d) {
			case 1: freez[p].setMode("Быстрая заморозка"); break;
			case 2: freez[p].setMode("Защита от детей"); break;
			default: freez[p].setMode("Без режима"); break;
			}
			System.out.print("Установить таймер? 1. Да, 2. Нет ");
			d = in.nextInt();
			if(d==1) {
				System.out.print("Введите время: ");
				freez[p].timer(in.next());
			}
			System.out.print("Включить устройство? 1. Да, 2. Нет ");
			d = in.nextInt();
			if (d==1) freez[p].stateOn();
			else freez[p].stateOff();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	private void inputC(int p) throws Exception {
		int d;
		try{
			System.out.println(" Кофемолка ");
			coff[p] = new CoffeeGrinder();
			System.out.print("Выберите режим:"
					+ "\n1. Min"
					+ "\n2. Medium"
					+ "\n3. Max\n");
			d = in.nextInt();
			switch (d) {
			case 2: coff[p].setMode("Medium"); break;
			case 3: coff[p].setMode("Max"); break;
			default: coff[p].setMode("Min"); break;
			}
			System.out.print("Установить таймер? 1. Да, 2. Нет ");
			d = in.nextInt();
			if(d==1) {
				System.out.print("Введите время: ");
				coff[p].timer(in.next());
			}
			System.out.print("Включить устройство? 1. Да, 2. Нет ");
			d = in.nextInt();
			if (d==1) coff[p].stateOn();
			else coff[p].stateOff();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	private void inputK(int p) throws Exception {
		int d;
		try{
			System.out.println(" Электрочайник ");
			ket[p] = new Kettle();
			System.out.print("Состояние крышки: 1. Открыть, 2. Закрыть");
			d = in.nextInt();
			if (d==2) ket[p].closeCap(); 
			else {
				ket[p].openCap();
				System.out.print("Хотите закрыть крышку? 1. Да, 2. Нет");
				d = in.nextInt();
				if(d==1) ket[p].closeCap();
			}
			System.out.print("Установить таймер? 1. Да, 2. Нет ");
			d = in.nextInt();
			if(d==1) {
				System.out.print("Введите время: ");
				ket[p].timer(in.next());
			}
			System.out.print("Включить устройство? 1. Да, 2. Нет ");
			d = in.nextInt();
			if (d==1) ket[p].stateOn();
			else ket[p].stateOff();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	private void inputL(int p) throws Exception {
		int d;
		try{
			System.out.println(" Светильник ");
			lamp[p] = new Lamp();
			System.out.print("Яркость в процентах (от 5 до 100): ");
			d = in.nextInt();
			lamp[p].setBrightness(d);
			System.out.print("Установить таймер? 1. Да, 2. Нет ");
			d = in.nextInt();
			if(d==1) {
				System.out.print("Введите время: ");
				lamp[p].timer(in.next());
			}
			System.out.print("Включить устройство? 1. Да, 2. Нет ");
			d = in.nextInt();
			if (d==1) lamp[p].stateOn();
			else lamp[p].stateOff();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	private int hnull(Hood[] mas) {
		int k=-1;
		for(int i=0; i<mas.length;i++) {
			if(mas[i]==null) {k=i; break;}
		} 
		if((mas[0]==null)&&(mas[1]!=null)) k=-2;
		if((mas[0]!=null)&&(mas[1]!=null)) k=3;
		return k;
	}
	private int lnull(Lamp[] mas) {
		int k=-1;
		for(int i=0; i<mas.length;i++) {
			if(mas[i]==null) {k=i; break;}
		}
		if((mas[0]==null)&&(mas[1]!=null)) k=-2;
		if((mas[0]!=null)&&(mas[1]!=null)) k=3;
		return k;
	}
	private int cnull(CoffeeGrinder[] mas) {
		int k=-1;
		for(int i=0; i<mas.length;i++) {
			if(mas[i]==null) {k=i; break;}
		}
		if((mas[0]==null)&&(mas[1]!=null)) k=-2;
		if((mas[0]!=null)&&(mas[1]!=null)) k=3;
		return k;
	}
	private int fnull(Freezer[] mas) {
		int k=-1;
		for(int i=0; i<mas.length;i++) {
			if(mas[i]==null) {k=i; break;}
		}
		if((mas[0]==null)&&(mas[1]!=null)) k=-2;
		if((mas[0]!=null)&&(mas[1]!=null)) k=3;
		return k;
	}
	private int knull(Kettle[] mas) {
		int k=-1;
		for(int i=0; i<mas.length;i++) {
			if(mas[i]==null) {k=i; break;}
		}
		if((mas[0]==null)&&(mas[1]!=null)) k=-2;
		if((mas[0]!=null)&&(mas[1]!=null)) k=3;
		return k;
	}

}

