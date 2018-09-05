package workbook;

public class UpLowerCase {

	public static void main(String[] args) {

		String firstname = "vijay";
		String lastname = "kumar";
		System.out.print(firstname.toUpperCase());
		System.out.print(lastname.toLowerCase());

		if (firstname == "vijay") {
			System.out.print("valid");
		} else {
			System.out.print("invalid");
		}

		if (firstname.equals("vijay")) {
			System.out.print("valid");
		} else {
			System.out.print("invalid");
		}

		if (firstname.equalsIgnoreCase("Vijay")) {
			System.out.print("valid");
		} else {
			System.out.print("invalid");
		}

		if (firstname.startsWith("vij")) {
			System.out.print("valid");
		} else {
			System.out.print("invalid");
		}

		if (firstname.contains("vijay")) {
			System.out.print("valid");
		} else {
			System.out.print("invalid");
		}

	}
}