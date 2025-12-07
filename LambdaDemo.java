import java.util.function.Predicate;

public class LambdaDemo {
	public static void main(String[] args) {
	
		Predicate<Integer> isEven = (num) -> {
			return num % 2 == 0;
		};
		
		System.out.println("4 even? " + isEven.test(4));
		System.out.println("5 even? " + isEven.test(5));
		
		Predicate<Integer> isPositive = num -> num > 0;
		
		java.util.Comparator<String> lengthCompare = (s1, s2) -> s1.length() - s2.length();
		System.out.println("Compare 'hi' and 'hello': " + lengthCompare.compare("hi", "hello"));
		
		Runnable greet = () -> System.out.println("Hello from lambda");
		greet.run();
	}
}