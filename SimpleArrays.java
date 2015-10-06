import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class SimpleArrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Array of primitives");
		int[] ints = {9,6,3};
		Arrays.sort(ints);
		for(int i=0; i < ints.length ; i++){
			System.out.println(ints[i]);
		}
		
		System.out.println("\nArray of Strings");
		String[] strings = {"Red","Green","Blue"};
		Arrays.sort(strings);
		for(String colors : strings){
			System.out.println(colors);
		}
		
		
		System.out.println("\nSetting an Initial size");
		int[] sized = new int[10];
		
		for(int i = 0; i < sized.length; i++){
			sized[i] = i * 100;
			System.out.println(sized[i]);
		}
		
		System.out.println("\nCopying an array");
		int[] copied = new int[5];
		System.arraycopy(sized, 5, copied, 0, 5);
		for(int value : copied){
			System.out.println(value);
		}
		
		System.out.println("\n\nMultidimensional Arrays");
		//Multidimensional Arrays
		String[][] states = new String[3][2]; //this is a 2 dimm array
		
		states[0][0] = "Florida";
		states[0][1] = "Tallahasee";
		
		states[1][0] = "Massachussetts";
		states[1][1] = "Boston";

		states[2][0] = "Washington";
		states[2][1] = "Olympia";
		
		for(int i = 0; i < states.length; i++){
			StringBuilder sb = new StringBuilder();
			sb.append("The capital of ")
				.append(states [i][0])
				.append(" is ")
				.append(states[i][1])
				.append(".");
			System.out.println(sb);
		}
		
		System.out.println("\n\nManaging unorder data with HashMap");
		
		Map<String,String> map = new HashMap<>();
		
		map.put("California", "Sacramento");
		map.put("Florida","Tallahasee");
		map.put("New York","New York");
		System.out.println(map);
		
		String cap = map.get("Florida");
		System.out.println(cap);
		
		
		//iterating on collections
		System.out.println("\n\nIterating on collections");
		
		System.out.println("\nOrdered Data");
		List<String> list = new ArrayList<>();
		list.add("California");
		list.add("Oregon");
		list.add("Washington");
		System.out.println(list);
		
		System.out.println("\nArrayList iterator");
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()){
			String value = iterator.next();
			System.out.println(value);
		}
		
		System.out.println("\n");
		
		//this might be a little bit of memory efficient and less code
		System.out.println("ArrayList ForEach");
		for(String value : list){
			System.out.println(value);
		}
		
		//this method only exists on Java 8 or later (it does not exist in google android java)
		/*
		list.forEach(System.out::println);
		*/
		
		System.out.println("\n\nUnordered data");
		Map<String,String> unOrderedmap = new HashMap<String, String>();
		unOrderedmap.put("California", "Sacramento");
		unOrderedmap.put("Florida","Tallahasee");
		unOrderedmap.put("Washington", "Olympia");
		System.out.println(unOrderedmap);
		
		System.out.println("\n\nHashMap Iterator");
		Set<String> keys = unOrderedmap.keySet();
		Iterator<String> iterator1 = keys.iterator();
		while(iterator1.hasNext()){
			String key = iterator1.next();
			System.out.println("The capitol of " + key + " is " + map.get(key));
		}
		
		System.out.println("HashMap forEach");
		for (String key : keys){
			System.out.println("The capitol of " + key + "is" + map.get(key));
		}

	}

}
