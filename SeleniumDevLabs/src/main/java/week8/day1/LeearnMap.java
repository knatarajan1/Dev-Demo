package week8.day1;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class LeearnMap {
	
	
	public static void main(String[] args) {
		String name = "Karthikeyan Kandhasamy Natarajan";
		char[] charArray = name.toCharArray();
		Map<String, Integer> map = new TreeMap<>();
		for (char string : charArray) {
			map.put(string+"", 0);
		}
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			String key = entry.getKey();
			int value=0;
			for(int i=0;i<charArray.length;i++) {
				if(key.equals(charArray[i]+""))
					value++;
			}
			map.put(key, value);
		}
		
		entrySet = map.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			System.out.println("Number of Ocurance of '"+entry.getKey()+"' is "+entry.getValue() );
		}
		
	}
	
	private void testMethod() {
		System.out.println("Test method for Merge conflict");
	}
	

}
