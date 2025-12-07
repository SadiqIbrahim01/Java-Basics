public class ExceptionDemo {
	public static void main(String[] args) {
		try {
			int x =  10/0;
		} catch(ArithmeticException e) {
			System.out.println("Division by zero: " + e.getMessage());
		} finally {
			System.out.println("Cleanup done");
		}
	}
}