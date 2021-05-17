import java.util.ArrayList;
import java.util.Scanner;

public class Update {
	Scanner scan = new Scanner(System.in);
	Update(ArrayList<UserData> data, int no){
		boolean isValid;
		no -= 1;
		if(no <= 0) {
			System.out.println("There is no data available");
			System.out.print("Press enter to return...");
			scan.nextLine();
			return;
		}
		int noScan = -1;
		int numUpdate = -1;
		do {
			isValid = false;
			System.out.println("+====================================+");
			System.out.println("+ Share List                         +");
			System.out.println("+====================================+");
			for (UserData userData : data) {
				System.out.printf("| %-3d | %-20s | %-5d |\n", userData.no, userData.name, userData.number);
			}
			System.out.println("+====================================+");
			System.out.print("Which participant you would like to update? [1 - " + (no) + "][0 to exit]? ");
			try {
				noScan = scan.nextInt();
				scan.nextLine();
			}catch(Exception e) {
				scan.nextLine();
				System.out.print("Input must be numeric!!");
				scan.nextLine();
				isValid = true;
			}
			if(noScan == 0) {
				return;
			}
		}while(noScan < 0 || noScan > (no) || isValid);
		
		for (UserData userData : data) {
			if(noScan == userData.no) {
				do {
					System.out.print("Input a number [0 - 100]: ");
					numUpdate = scan.nextInt();
					scan.nextLine();
				}while(numUpdate < 0 || numUpdate > 100);
				userData.number = numUpdate;
				System.out.print("Update Successful!!");
				scan.nextLine();
			}
		}
		
	}
}
