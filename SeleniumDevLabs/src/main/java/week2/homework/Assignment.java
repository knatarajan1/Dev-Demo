package week2.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Assignment {

	public static void main(String[] args) {
		
		
		System.out.println("PROBLEM 1: FIND MAXIMUM OCCURRING CHARACHTER IN STRING");
		String str = "Amazon Web Development";
		char[] strCharArray  = str.toCharArray();
		List<String> strListChar = new ArrayList<String>();	
		Set<String> strSetChar = new TreeSet<String>();	
		for (char ch : strCharArray) {
			strListChar.add(ch+"");
		}
		System.out.println("CHAR LIST: "+strListChar);
		for (String ch : strListChar) {
			strSetChar.add(ch);
		}
		strSetChar.remove(" ");
		for (Iterator iterator = strSetChar.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			
		}
		
		System.out.println("SET LIST: "+strSetChar);
		Map<String,Integer> map = new HashMap<String,Integer>();
		
		for (String ch : strSetChar) {
			map.put(ch, findCharCountFromString(ch,str));
		}
		System.out.println("MAP: "+map);
		
		
	}
	
	private static int findCharCountFromString(String ch,String word) {
		int count = 0;
		
		for (int i = 0; i <= word.length()-1; i++) {
			String strCh = word.charAt(i)+"";
			if (strCh.equalsIgnoreCase(ch)) {
				count++;
			}
		}
		
		return count;
	}
	
}
