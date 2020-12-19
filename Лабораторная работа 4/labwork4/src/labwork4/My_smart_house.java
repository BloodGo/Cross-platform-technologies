package labwork4;

//import java.lang.*;
import java.util.*;

public class My_smart_house {
	private CoffeeGrinder[] coff = new CoffeeGrinder[2];
	private Hood[] hood = new Hood[2];
	private Lamp[] lamp = new Lamp[2];
	private Freezer[] freez = new Freezer[2];
	private ElectroKettel[] ket = new ElectroKettel[2];
	private Scanner in = new Scanner(System.in);
	public void addnew() 
	{
		System.out.println("�������� ���������� ��� ����������:");
		String name = printDevice();
		int p;
		try {
			switch (name) {
			case "�������": {
				p=hoodNumder(hood);
				if(p!=3) {
					inputDevices(p, 1);
				}	else System.out.println("��� �� �������� ����� ���������� ������� ������!");		
				break;
				}
			case "����������": {
				p=lampNumber(lamp);
				if(p!=3) {
					inputDevices(p, 2);
				}	else System.out.println("��� �� �������� ����� ���������� ������� ������!");
				break;
				}
			case "���������": {
				p=coffeeNumber(coff);
				if(p!=3) {
					inputDevices(p, 3);
				}	else System.out.println("��� �� �������� ����� ���������� ������� ������!");
				break;
				}
			case "����������� ������":{
				p=freezerNumber(freez);
				if(p!=3) {
					inputDevices(p, 4);
				}	else System.out.println("��� �� �������� ����� ���������� ������� ������!");
				break;
				}
			case "�������������":{
				p=elKettelNumber(ket);
				if(p!=3) {
					inputDevices(p, 5);
				}	else System.out.println("��� �� �������� ����� ���������� ������� ������!");
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
			System.out.println("�������� ���������� ��� ��������");
			String name = printDevice();
			switch(name) {
				case "�������": {
					p=hoodNumder(hood);
					if((hood[0]==null)&&(hood[1]==null)) System.out.println("��� ��������� ��� ��������! ");
					else {
						if(p==3) {
							for(int i=0;i<hood.length;i++)
								hood[i].getPrint(i+1);
						} else if(p==-2) hood[1].getPrint(2);
						else hood[p-1].getPrint(p);
						System.out.println("������� ����� ���������� ��� ��������: ");
						d=in.nextInt();
						hood[d-1] = null;
					}
					break;
				}
				case "����������": {
					p=lampNumber(lamp);
					if((lamp[0]==null)&&(lamp[1]==null)) System.out.println("��� ��������� ��� ��������! ");
					else {
						if(p==3) {
							for(int i=0;i<lamp.length;i++)
								lamp[i].getPrint(i+1);
						} else if(p==-2) lamp[1].getPrint(2);
						else lamp[p-1].getPrint(p);
						System.out.println("������� ����� ���������� ��� ��������: ");
						d=in.nextInt();
						lamp[d-1] = null;
					}
				break;
				}
				case "���������": {
					p=coffeeNumber(coff);
					if((coff[0]==null)&&(coff[1]==null)) System.out.println("��� ��������� ��� ��������! ");
					else {
						if(p==3) {
							for(int i=0;i<coff.length;i++)
								coff[i].getPrint(i+1);
						} else if(p==-2) coff[1].getPrint(2);
						else coff[p-1].getPrint(p);
						System.out.println("������� ����� ���������� ��� ��������: ");
						d=in.nextInt();
						coff[d-1] = null;
					}
				break;
				}
				case "����������� ������":{
					p=freezerNumber(freez);
					if((freez[0]==null)&&(freez[1]==null)) System.out.println("��� ��������� ��� ��������! ");
					else {
						if(p==3) {
							for(int i=0;i<freez.length;i++)
								freez[i].getPrint(i+1);
						} else if(p==-2) freez[1].getPrint(2);
						else freez[p-1].getPrint(p);	
						System.out.println("������� ����� ���������� ��� ��������: ");
						d=in.nextInt();
						freez[d-1] = null;
					}
				break;
				}
				case "�������������":{
					p=elKettelNumber(ket);
					if((ket[0]==null)&&(ket[1]==null)) System.out.println("��� ��������� ��� ��������! ");
					else {
						if(p==3) {
							for(int i=0;i<ket.length;i++)
								ket[i].getPrint(i+1);
						} else if(p==-2) ket[1].getPrint(2);
						else ket[p-1].getPrint(p);	
						System.out.println("������� ����� ���������� ��� ��������: ");
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
			System.out.println("�������� ���������� ��� ���������");
			String name  = printDevice();
			switch(name) {
				case "�������": {
				p=hoodNumder(hood);
				if((hood[0]==null)&&(hood[1]==null)) System.out.println("��� ��������� ��� ���������! ");
				else {
					if(p==3) {
						for(int i=0;i<hood.length;i++)
							hood[i].getPrint(i+1);
					} else if(p==-2) hood[1].getPrint(2);
					else hood[p-1].getPrint(p);	
					System.out.println("������� ����� ���������� ��� ���������: ");
					d=in.nextInt();
					inputDevices(d-1,1);
				}
				break;
				}
				case "����������": {
					p=lampNumber(lamp);
					if((lamp[0]==null)&&(lamp[1]==null)) System.out.println("��� ��������� ��� ���������! ");
					else {
						if(p==3) {
							for(int i=0;i<lamp.length;i++)
								lamp[i].getPrint(i+1);
						} else if(p==-2) lamp[1].getPrint(2);
						else lamp[p-1].getPrint(p);	
						System.out.println("������� ����� ���������� ��� ���������: ");
						d=in.nextInt();
						inputDevices(d-1, 2);
					}
				break;
				}
				case "���������": {
					p=coffeeNumber(coff);
					if((coff[0]==null)&&(coff[1]==null)) System.out.println("��� ��������� ��� ���������! ");
					else {
						if(p==3) {
							for(int i=0;i<coff.length;i++)
								coff[i].getPrint(i+1);
						} else if(p==-2) coff[1].getPrint(2);
						else coff[p-1].getPrint(p);	
						System.out.println("������� ����� ���������� ��� ���������: ");
						d=in.nextInt();
						inputDevices(d-1, 3);
					}
				break;
				}
				case "����������� ������":{
					p=freezerNumber(freez);
					if((freez[0]==null)&&(freez[1]==null)) System.out.println("��� ��������� ��� ���������! ");
					else {
						if(p==3) {
							for(int i=0;i<freez.length;i++)
								freez[i].getPrint(i+1);
						} else if(p==-2) freez[1].getPrint(2);
						else freez[p-1].getPrint(p);
						System.out.println("������� ����� ���������� ��� ���������: ");
						d=in.nextInt();
						inputDevices(d-1, 4);
					}
				break;
				}
				case "�������������":{
					p=elKettelNumber(ket);
					if((ket[0]==null)&&(ket[1]==null)) System.out.println("��� ��������� ��� ���������! ");
					else {
						if(p==3) {
							for(int i=0;i<ket.length;i++)
								ket[i].getPrint(i+1);
						} else if(p==-2) ket[1].getPrint(2);
						else ket[p-1].getPrint(p);		
						System.out.println("������� ����� ���������� ��� ���������: ");
						d=in.nextInt();
						inputDevices(d-1, 5);
					}
				break;
				}
			}
		} catch (Exception e) { System.out.println(e.getMessage());}
	}
	public void showAll() {
		int k = hoodNumder(hood);
		if((hood[0]!=null)||(hood[1]!=null)) {
			if (k==3) {
				for(int i=0;i<hood.length;i++)
					hood[i].getPrint(i+1);
			} else if(k==-2) hood[1].getPrint(2);
			else hood[k-1].getPrint(k);
		}else System.out.println("��� ��������� �������!");
		k=lampNumber(lamp);
		if((lamp[0]!=null)||(lamp[1]!=null)) {
			if (k==3) {
				for(int i=0;i<lamp.length;i++)
					lamp[i].getPrint(i+1);
			} else if(k==-2)lamp[1].getPrint(2);
			else lamp[k-1].getPrint(k);
		}else System.out.println("��� ��������� ������������!");
		k=coffeeNumber(coff);
		if((coff[0]!=null)||(coff[1]!=null)) {
			if (k==3) {
				for(int i=0;i<coff.length;i++)
					coff[i].getPrint(i+1);
			} else if(k==-2)coff[1].getPrint(2);
			else coff[k-1].getPrint(k);
		}else System.out.println("��� ��������� ���������!");
		k=freezerNumber(freez);
		if((freez[0]!=null)||(freez[1]!=null)) {
			if (k==3) {
				for(int i=0;i<freez.length;i++)
					freez[i].getPrint(i+1);
			} else if(k==-2)freez[1].getPrint(2);
			else freez[k-1].getPrint(k);
		}else System.out.println("��� ��������� ����������� �����!");
		k=elKettelNumber(ket);
		if((ket[0]!=null)||(ket[1]!=null)) {
			if (k==3) {
				for(int i=0;i<ket.length;i++)
					ket[i].getPrint(i+1);
			} else if(k==-2)ket[1].getPrint(2);
			else ket[k-1].getPrint(k);
		}else System.out.println("��� ��������� ��������!");
	}
	private String printDevice() {
		while(true) {
			System.out.print("1. �������"
					+ "\n2. ����������"
					+ "\n3. ���������"
					+ "\n4. ����������� ������"
					+ "\n5. �������������\n");
			int d = in.nextInt();
			switch (d) {
			case 1: return "�������";
			case 2: return "����������";
			case 3:return "���������";
			case 4: return "����������� ������";
			case 5: return "�������������";
			default: 
			}
		}
		
	}
	private void inputDevices(int p, int device) throws Exception {
		int d;
		try {
			switch (device) {
			case 1:{
				System.out.println(" ������� ");
				hood[p] = new Hood();
				System.out.print("�������� �����:"
						+ "\n1. Min"
						+ "\n2. Medium"
						+ "\n3. Max\n");
				d = in.nextInt();
				switch (d) {
				case 2: hood[p].setMode("Medium"); break;
				case 3: hood[p].setMode("Max"); break;
				default: hood[p].setMode("Min"); break;
				}
				System.out.print("���������� ������? 1. ��, 2. ��� ");
				d = in.nextInt();
				if(d==1) {
					System.out.print("������� �����: ");
					hood[p].timer(in.next());
				}
				System.out.print("�������� ����������? 1. ��, 2. ��� ");
				d = in.nextInt();
				if (d==1) hood[p].stateOn();
				else hood[p].stateOff();
				break;}
			case 2:{
				System.out.println(" ���������� ");
				lamp[p] = new Lamp();
				System.out.print("������� � ��������� (�� 5 �� 100): ");
				d = in.nextInt();
				lamp[p].setBrightness(d);
				System.out.print("���������� ������? 1. ��, 2. ��� ");
				d = in.nextInt();
				if(d==1) {
					System.out.print("������� �����: ");
					lamp[p].timer(in.next());
				}
				System.out.print("�������� ����������? 1. ��, 2. ��� ");
				d = in.nextInt();
				if (d==1) lamp[p].stateOn();
				else lamp[p].stateOff();
				break;}	
			case 3:{
				System.out.println(" ��������� ");
				coff[p] = new CoffeeGrinder();
				System.out.print("�������� �����:"
						+ "\n1. Min"
						+ "\n2. Medium"
						+ "\n3. Max\n");
				d = in.nextInt();
				switch (d) {
				case 2: coff[p].setMode("Medium"); break;
				case 3: coff[p].setMode("Max"); break;
				default: coff[p].setMode("Min"); break;
				}
				System.out.print("���������� ������? 1. ��, 2. ��� ");
				d = in.nextInt();
				if(d==1) {
					System.out.print("������� �����: ");
					coff[p].timer(in.next());
				}
				System.out.print("�������� ����������? 1. ��, 2. ��� ");
				d = in.nextInt();
				if (d==1) coff[p].stateOn();
				else coff[p].stateOff();
				break;}
			case 4:{
				System.out.println(" ����������� ������ ");
				freez[p] = new Freezer();
				System.out.print("������� �����������: ");
				d = in.nextInt();
				freez[p].setTemperature(d);
				System.out.print("�������� �����:"
						+ "\n1. ������� ���������"
						+ "\n2. ������ �� �����"
						+ "\n3. ��� ������\n");
				d = in.nextInt();
				switch (d) {
				case 1: freez[p].setMode("������� ���������"); break;
				case 2: freez[p].setMode("������ �� �����"); break;
				default: freez[p].setMode("��� ������"); break;
				}
				System.out.print("���������� ������? 1. ��, 2. ��� ");
				d = in.nextInt();
				if(d==1) {
					System.out.print("������� �����: ");
					freez[p].timer(in.next());
				}
				System.out.print("�������� ����������? 1. ��, 2. ��� ");
				d = in.nextInt();
				if (d==1) freez[p].stateOn();
				else freez[p].stateOff();
				break;}
			case 5:{
				System.out.println(" ������������� ");
				ket[p] = new ElectroKettel();
				System.out.print("���������� ������? 1. ��, 2. ��� ");
				d = in.nextInt();
				if(d==1) {
					System.out.print("������� �����: ");
					ket[p].timer(in.next());
				}
				System.out.print("�������� ����������? 1. ��, 2. ��� ");
				d = in.nextInt();
				if (d==1) ket[p].stateOn();
				else ket[p].stateOff();
				break;}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	private int hoodNumder(Hood[] mas) {
		int k=-1;
		for(int i=0; i<mas.length;i++) {
			if(mas[i]==null) {k=i; break;}
		} 
		if((mas[0]==null)&&(mas[1]!=null)) k=-2;
		if((mas[0]!=null)&&(mas[1]!=null)) k=3;
		return k;
	}
	private int lampNumber(Lamp[] mas) {
		int k=-1;
		for(int i=0; i<mas.length;i++) {
			if(mas[i]==null) {k=i; break;}
		}
		if((mas[0]==null)&&(mas[1]!=null)) k=-2;
		if((mas[0]!=null)&&(mas[1]!=null)) k=3;
		return k;
	}
	private int coffeeNumber(CoffeeGrinder[] mas) {
		int k=-1;
		for(int i=0; i<mas.length;i++) {
			if(mas[i]==null) {k=i; break;}
		}
		if((mas[0]==null)&&(mas[1]!=null)) k=-2;
		if((mas[0]!=null)&&(mas[1]!=null)) k=3;
		return k;
	}
	private int freezerNumber(Freezer[] mas) {
		int k=-1;
		for(int i=0; i<mas.length;i++) {
			if(mas[i]==null) {k=i; break;}
		}
		if((mas[0]==null)&&(mas[1]!=null)) k=-2;
		if((mas[0]!=null)&&(mas[1]!=null)) k=3;
		return k;
	}
	private int elKettelNumber(ElectroKettel[] mas) {
		int k=-1;
		for(int i=0; i<mas.length;i++) {
			if(mas[i]==null) {k=i; break;}
		}
		if((mas[0]==null)&&(mas[1]!=null)) k=-2;
		if((mas[0]!=null)&&(mas[1]!=null)) k=3;
		return k;
	}

}

