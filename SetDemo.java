import java.util.HashSet;
import java.util.TreeSet;
import java.util.Set;

public class SetDemo {
	public static void main(String[] args) {
		Set<Integer> hashSet = new HashSet<>();
		hashSet.add(5);
		hashSet.add(3);
		hashSet.add(5);
		System.out.println(hashSet);
		System.out.println(hashSet.contains(3));
		
		Set<String> treeSet = new TreeSet<>();
		treeSet.add("Zebra");
		treeSet.add("Apple");
		System.out.println(treeSet);
	}

}