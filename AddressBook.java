package bridgelabz;
import java.util.Scanner;
import java.util.ArrayList;
public class AddressBook{
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		AddressBook addressObject = new AddressBook();
		String choice = "y";
		while(true) {
			System.out.println("Enter 1: add 2: edit 3: exit");
			System.out.println("Enter choice : ");
			int switchChoice = scan.nextInt();
			scan.nextLine();
			switch(switchChoice) {
				case 1:
					while(choice.equals("y")) {
						System.out.println("Firstname : ");
 						String firstname = scan.nextLine();
						System.out.println("Lastname : ");
						String lastname = scan.nextLine();
						System.out.println("Address : ");
						String address = scan.nextLine();
						System.out.println("City : ");
						String city = scan.nextLine();
						System.out.println("State : ");
						String state = scan.nextLine();
						System.out.println("Zip : ");
						int zip = scan.nextInt();
						System.out.println("PhoneNumber : ");
						long phonenumber = scan.nextLong();
						System.out.println("Email : ");
						scan.nextLine();
						String email = scan.nextLine();
						System.out.println("Do you want add more contact : ");
						choice = scan.nextLine();
						contactDetail contact = new contactDetail(firstname, lastname, address, city, state, zip, phonenumber, email);
						addressObject.insertContact(contact);
					}
				break;
				case 2:
					System.out.println("Enter name of contact to edit : ");
					String nameToEdit = scan.nextLine();
					addressObject.editContact(nameToEdit);
					System.out.println("Contact List : ");
					addressObject.printContactDetails();
				break;
				default:
					System.exit(0);
			}
		}

	}
		
