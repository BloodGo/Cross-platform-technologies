package labwork4;

import java.util.Scanner;

public class labwork4 {

	public static void main (String args[ ]) {
 		Smart_house smart = new Smart_house();
 		Scanner in = new Scanner(System.in);
 		int d;
 		smart.addnew();
		smart.addnew();
		smart.addnew();
		smart.addnew();
		smart.addnew();
 		while(true) {
 			System.out.println("����:"
 					+ "\n1. �������� ���-��"
 					+ "\n2. ������� ���-��"
 					+ "\n3. �������� ���-��\n");
 			d = in.nextInt();
 			switch (d) {
 			case 1: {
 				smart.addnew();
 				smart.showAll();
 				break;
 			}
 			case 2: {
 				smart.delete();
 				smart.showAll();
 				break;
 			}
 			case 3: {
 				smart.change(); 
 				smart.showAll();
 				break;
 			}
 				
 			}
 		}
	}

}
