import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static ArrayList<UserData> data = new ArrayList<>();
	static void cls() {
		for(int i = 0; i < 30 ; i++) {
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("BJ - SHARE");
		scan.nextLine();
		boolean checkDone;
		int choice = 0;
		int no = 1;
		do {
			checkDone = false;
			cls();
			System.out.println("+==========================+");
			System.out.println("+Options                   +");
			System.out.println("+==========================+");
			System.out.println("+1. Start Sharing          +");
			System.out.println("+2. Update Participant     +");
			System.out.println("+3. Delete Participant	   +");
			System.out.println("+4. Close App              +");
			System.out.println("+==========================+");
			
			try {
				System.out.print("Choice >> ");
				choice = scan.nextInt();
				scan.nextLine();
			}catch(Exception e) {
				scan.nextLine();
				System.out.println("Please input numeric only!");
				System.out.print("Press enter to continue...");
				scan.nextLine();
			}
			
			if(choice == 1) {
				cls();
				new Add(data,no);
				no++;
				checkDone = true;
			}else if(choice == 2) {
				cls();
				new Update(data, no);
				checkDone = true;
			}else if(choice == 3) {
				cls();
				Remove rmv = new Remove(data, no);
				if(rmv.isDeleted)no--;
				checkDone = true;
			}else if(choice == 4) {
				cls();
				new Last(data, no);
			}
			
		}while(choice < 1 || choice > 4 || checkDone);
		scan.close();
	}
}
