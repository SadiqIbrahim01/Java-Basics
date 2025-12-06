import java.util.HashMap;
import java.util.TreeMap;
import java.util.Map;

public class MapDemo {
	public static void main(String[] args) {
		Map<String, Integer> hashMap = new HashMap<>();
		hashMap.put("Alice", 30);
		hashMap.put("Bob", 25);
		System.out.println(hashMap.get("Alice"));
		hashMap.entrySet().forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
		
		Map<String, Integer> treeMap = new TreeMap<>();
		treeMap.put("Zoe", 28);
		treeMap.put("Adam", 35);
		System.out.println(treeMap);
	}

}