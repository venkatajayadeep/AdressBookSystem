package bridgelabz;
	import java.util.Scanner;
	class contactDetail {
	    public final String firstname, lastname;
	    public final String address, city, state;
	    public final String zip;
	    public final String phoneNumber;
	    public final String email;

	    public contactDetail(String firstname, String lastname, String address, String city, String state, String zip, String phonenumber, String email) {
	        this.firstname = firstname;
	        this.lastname = lastname;
	        this.address = address;
	        this.city = city;
	        this.state = state;
	        this.zip = zip;
	        this.phoneNumber = phonenumber;
	        this.email = email;
	    }
	    public void printContactDetails() {
	    System.out.println("Firstname : " + firstname);
	    System.out.println("Lastname : " + lastname);
	    System.out.println("Address : " + address);
	    System.out.println("City : " + city);
	    System.out.println("State : " + state);
	    System.out.println("Zip : " + zip);
	    System.out.println("PhoneNumber : " + phoneNumber);
	    System.out.println("Email : " + email);
	    }
	}
	public class AddressBook {
	 public static void main(String args[]) {
	        contactDetail contact = new contactDetail("venkata", "jayadeep", "sbiroad", "ukd", "Ap", "515812", "9876543210", "jayadeep101097@gmail.com");
	        contact.printContactDetails();
	        }
}


