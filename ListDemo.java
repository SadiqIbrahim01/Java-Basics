import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {
	public static void main(String[] args) {
		List<String> arrayList = new ArrayList<>();
		arrayList.add("Apple");
		arrayList.add("Banana");
		arrayList.add(1, "Cherry");
		System.out.println(arrayList.get(0));
		arrayList.remove("Banana");
		
		List<String> linkedList = new LinkedList<>();
		linkedList.add("Dog");
		linkedList.addFirst("Cat");
		System.out.println(linkedList);
		
		for(String fruit : arrayList) {
			System.out.println(fruit);
		}
	}

}