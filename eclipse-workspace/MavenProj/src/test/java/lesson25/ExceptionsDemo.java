package lesson25;

public class ExceptionsDemo {

	public static void main(String[] args) {

		System.out.println("Start Running");
		int a = 1;
		int b = 0;

		int[] arr = { 1, 2, 3, 4, 5 };

		try {
			// System.out.println("Result found: " + (a / b));

			System.out.println(arr[5]);
		} catch (Exception e) {
			// TODO handle the exception
			System.out.println("There is exception");
			System.out.println(e.getMessage());
			// e.printStackTrace();

		} finally {
			System.out.println("Finnaly is running");
		}
		System.out.println("Still running");
		System.out.println("Application stoped successfully");

	}
}
