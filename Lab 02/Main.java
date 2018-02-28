import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	
	public static void main (String[] args) {
		
		
		ArrayList<Integer> myList = new ArrayList<Integer>(5);
		Scanner input = new Scanner(System.in);
		
		System.out.println("Choose your option"
				+ "\n1.Add a number at the end of the list"
				+ "\n2.Remove a number from the list"
				+ "\n3.Print the size of the array"
				+ "\n9.Exit the program");
		int option = input.nextInt();
		boolean entered = false;
		while (option != 9) {
			
			if (option == 1) {
				System.out.print("Enter the value to add to the arraylist ... ");
				int value = input.nextInt();
				myList.add(value);
				System.out.println(myList);
				entered = true;
			}
			else if (option == 2) {
				if (entered == false)
					System.out.println("No values have been added to the list\n");
				else {
					System.out.print("Enter the value to remove from the arraylist ... ");
					int value = input.nextInt();
					for (int i=myList.size()-1; i>=0; i--) {
						if (myList.get(i).equals(value)) {
							myList.remove(i);
						}
					}
					System.out.println(myList);
				}
			}
			else if (option == 3) {
				System.out.println(myList.size());
			}
			else if (option == 9) {
				input.close();
			}
			else 
				System.out.println("ERROR! Invalid input value ... ");
			
			System.out.println("Choose your option"
					+ "\n1.Add a number at the end of the list"
					+ "\n2.Remove a number from the list"
					+ "\n3.Print the size of the array"
					+ "\n9.Exit the program");
			
			option = input.nextInt();
				
		}
		
		input.close();
	}
	
}

