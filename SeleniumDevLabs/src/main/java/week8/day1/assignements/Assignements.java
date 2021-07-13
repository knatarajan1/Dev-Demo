package week8.day1.assignements;

import java.util.Iterator;

public class Assignements {
public static void main(String[] args) {
	int[] array = {10,9,55,23,12,1,5,33,20};
	int max = array[0];
	int min = array[0];
for (int i = 1; i < array.length; i++) {
		if(max<array[i])
			max=array[i];
		if(min>array[i])
			min=array[i];
}
int sum=max+min;
int diff = max-min;
	System.out.println("MAX is "+max);
	System.out.println("MIN is "+min);
	System.out.println("SUM OF MAX & MIN: "+sum);
	System.out.println("DIFF OF MAX & MIN: "+diff);
	
int a = 10;
int b=20;

a =a+b;
b=a-b;
a=a-b;
System.out.println("A is "+a);
System.out.println("B is "+b);


}
}
