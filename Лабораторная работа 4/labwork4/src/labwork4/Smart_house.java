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
		System.out.println("�������� ���������� ��� ����������:");
		String name = device();
		int p;
		try {
			switch (name) {
			case "�������": {
				p=hnull(hood);
				if(p!=3) {
					inputH(p);
				}	else System.out.println("��� �� �������� ����� ���������� ������� ������!");		
				break;
				}
			case "����������": {
				p=lnull(lamp);
				if(p!=3) {
					inputL(p);
				}	else System.out.println("��� �� �������� ����� ���������� ������� ������!");
				break;
				}
			case "���������": {
				p=cnull(coff);
				if(p!=3) {
					inputC(p);
				}	else System.out.println("��� �� �������� ����� ���������� ������� ������!");
				break;
				}
			case "����������� ������":{
				p=fnull(freez);
				if(p!=3) {
					inputFre(p);
				}	else System.out.println("��� �� �������� ����� ���������� ������� ������!");
				break;
				}
			case "�������������":{
				p=knull(ket);
				if(p!=3) {
					inputK(p);
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
			String name = device();
			switch(name) {
				case "�������": {
					p=hnull(hood);
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
					p=lnull(lamp);
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
					p=cnull(coff);
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
					p=fnull(freez);
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
					p=knull(ket);
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
			String name  = device();
			switch(name) {
				case "�������": {
				p=hnull(hood);
				if((hood[0]==null)&&(hood[1]==null)) System.out.println("��� ��������� ��� ���������! ");
				else {
					if(p==3) {
						for(int i=0;i<hood.length;i++)
							hood[i].getPrint(i+1);
					} else if(p==-2) hood[1].getPrint(2);
					else hood[p-1].getPrint(p);	
					System.out.println("������� ����� ���������� ��� ���������: ");
					d=in.nextInt();
					inputH(d-1);
				}
				break;
				}
				case "����������": {
					p=lnull(lamp);
					if((lamp[0]==null)&&(lamp[1]==null)) System.out.println("��� ��������� ��� ���������! ");
					else {
						if(p==3) {
							for(int i=0;i<lamp.length;i++)
								lamp[i].getPrint(i+1);
						} else if(p==-2) lamp[1].getPrint(2);
						else lamp[p-1].getPrint(p);	
						System.out.println("������� ����� ���������� ��� ���������: ");
						d=in.nextInt();
						inputL(d-1);
					}
				break;
				}
				case "���������": {
					p=cnull(coff);
					if((coff[0]==null)&&(coff[1]==null)) System.out.println("��� ��������� ��� ���������! ");
					else {
						if(p==3) {
							for(int i=0;i<coff.length;i++)
								coff[i].getPrint(i+1);
						} else if(p==-2) coff[1].getPrint(2);
						else coff[p-1].getPrint(p);	
						System.out.println("������� ����� ���������� ��� ���������: ");
						d=in.nextInt();
						inputC(d-1);
					}
				break;
				}
				case "����������� ������":{
					p=fnull(freez);
					if((freez[0]==null)&&(freez[1]==null)) System.out.println("��� ��������� ��� ���������! ");
					else {
						if(p==3) {
							for(int i=0;i<freez.length;i++)
								freez[i].getPrint(i+1);
						} else if(p==-2) freez[1].getPrint(2);
						else freez[p-1].getPrint(p);
						System.out.println("������� ����� ���������� ��� ���������: ");
						d=in.nextInt();
						inputFre(d-1);
					}
				break;
				}
				case "�������������":{
					p=knull(ket);
					if((ket[0]==null)&&(ket[1]==null)) System.out.println("��� ��������� ��� ���������! ");
					else {
						if(p==3) {
							for(int i=0;i<ket.length;i++)
								ket[i].getPrint(i+1);
						} else if(p==-2) ket[1].getPrint(2);
						else ket[p-1].getPrint(p);		
						System.out.println("������� ����� ���������� ��� ���������: ");
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
		}else System.out.println("��� ��������� �������!");
		k=lnull(lamp);
		if((lamp[0]!=null)||(lamp[1]!=null)) {
			if (k==3) {
				for(int i=0;i<lamp.length;i++)
					lamp[i].getPrint(i+1);
			} else if(k==-2)lamp[1].getPrint(2);
			else lamp[k-1].getPrint(k);
		}else System.out.println("��� ��������� ������������!");
		k=cnull(coff);
		if((coff[0]!=null)||(coff[1]!=null)) {
			if (k==3) {
				for(int i=0;i<coff.length;i++)
					coff[i].getPrint(i+1);
			} else if(k==-2)coff[1].getPrint(2);
			else coff[k-1].getPrint(k);
		}else System.out.println("��� ��������� ���������!");
		k=fnull(freez);
		if((freez[0]!=null)||(freez[1]!=null)) {
			if (k==3) {
				for(int i=0;i<freez.length;i++)
					freez[i].getPrint(i+1);
			} else if(k==-2)freez[1].getPrint(2);
			else freez[k-1].getPrint(k);
		}else System.out.println("��� ��������� ����������� �����!");
		k=knull(ket);
		if((ket[0]!=null)||(ket[1]!=null)) {
			if (k==3) {
				for(int i=0;i<ket.length;i++)
					ket[i].getPrint(i+1);
			} else if(k==-2)ket[1].getPrint(2);
			else ket[k-1].getPrint(k);
		}else System.out.println("��� ��������� ��������!");
	}
	private String device () {
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
	private void inputH(int p) throws Exception {
		int d;
		try{
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
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	private void inputFre(int p) throws Exception {
		int d;
		try{
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
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	private void inputC(int p) throws Exception {
		int d;
		try{
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
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	private void inputK(int p) throws Exception {
		int d;
		try{
			System.out.println(" ������������� ");
			ket[p] = new Kettle();
			System.out.print("��������� ������: 1. �������, 2. �������");
			d = in.nextInt();
			if (d==2) ket[p].closeCap(); 
			else {
				ket[p].openCap();
				System.out.print("������ ������� ������? 1. ��, 2. ���");
				d = in.nextInt();
				if(d==1) ket[p].closeCap();
			}
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
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	private void inputL(int p) throws Exception {
		int d;
		try{
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

