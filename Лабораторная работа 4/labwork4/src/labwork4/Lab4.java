package labwork4;

import java.util.Scanner;

public class Lab4 {

	public static void main (String args[ ]) {
 		My_smart_house my_smart = new My_smart_house();
 		my_smart.addnew();
 		my_smart.addnew();
 		my_smart.addnew();
 		my_smart.addnew();
 		my_smart.addnew();
 		while(true) {
 			switch (printMenu()) {
 			case 1: {
 				my_smart.addnew();
 				my_smart.showAll();
 				break;
 			}
 			case 2: {
 				my_smart.delete();
 				my_smart.showAll();
 				break;
 			}
 			case 3: {
 				my_smart.change(); 
 				my_smart.showAll();
 				break;
 			}
 				
 			}
 		}
	}
	public static int printMenu() {
		int d;
		Scanner in = new Scanner(System.in);
		System.out.println("Меню:"
					+ "\n1. Добавить уст-во"
					+ "\n2. Удалить уст-во"
					+ "\n3. Изменить уст-во\n");
			d = in.nextInt();
			return d;
	}

}
