import java.util.ArrayList;
import java.util.Scanner;

public class Add {
	Add(ArrayList<UserData> data, int no){
		Scanner scan = new Scanner(System.in);
		int temp = 0;
		int scanNum = -1;
		String userName;
		do {
			temp = 0;
			System.out.print("Input a number[0 - 100]: ");
			try {
				scanNum = scan.nextInt();
				scan.nextLine();
			}catch(Exception e) {
				scan.nextLine();
				System.out.print("Input must ne numeric");
				scan.nextLine();
				temp = 1;
			}
			
		}while(temp == 1 || scanNum < 0 || scanNum > 100);
		
		do {
			temp = 0;
			System.out.print("Could you give me your username[5 - 20 characters]? ");
			userName = scan.nextLine();
			
			for (UserData userData : data) {
				if(userName.equals(userData.name)) {
					System.out.println("Username has already been taken!!");
					temp = 1;
					break;
				}
			}
		}while(temp == 1 || userName.length() < 5 || userName.length() > 20);
		
		System.out.println("You are the " + no + " that joins the game");
		
		System.out.print("You share number : " + scanNum);
		UserData a = new UserData(no, userName, scanNum);
		data.add(a);
		scan.nextLine();
	}
}
