import java.util.List;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Last {
	Last(ArrayList<UserData> data, int no){
		System.out.println("Here's the completed share list");
		System.out.println("Remember, sharing is caring, happy sharing :D");
		System.out.println("+============================================+");
		System.out.println("+ Share list                                 +");
		System.out.println("+============================================+");
		System.out.println("+ Username               | Before  | After   +");
		System.out.println("+============================================+");
		Collections.sort(data, (p1,p2) -> p1.name.compareTo(p2.name));
		
//		int[] person = new int[no-1];
//		
//		int ctr = 0;
//		for (UserData userData : data) {
//			person[ctr] = userData.number;
//			ctr++;
//		}
//		
//		Random rand = new Random();
//		
//		for(int i = 0 ; i < person.length ; i++) {
//			int swap = rand.nextInt(person.length);
//			int temp = person[swap];
//			person[swap] = person[i];
//			person[i] = temp;
//		}
//		
//		int x = person.length-1;
//		for (UserData userData : data) {
//			System.out.printf("| %-22s | %-7d | %-7d |\n", userData.name, userData.number, person[x]);
//			x--;
//		}
		
		Integer[] people = new Integer[no-1];
		int count = 0;
		for(UserData userData : data) {
			people[count] = userData.number;
			count++;
		}
		List<Integer> lists = Arrays.asList(people);
		Collections.shuffle(lists);
		lists.toArray(people);
		Collections.reverse(Arrays.asList(people));
		int x = 0;
		for (UserData userData : data) {
			System.out.printf("| %-22s | %-7d | %-7d |\n", userData.name, userData.number, people[x]);
			x++;
		}
		
		System.out.println("+============================================+");
	}
}
