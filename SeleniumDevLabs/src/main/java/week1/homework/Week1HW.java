package week1.homework;

import java.util.Iterator;

public class Week1HW {
public static void main(String[] args) {
	
	System.out.println("PROBLEM 1: FIND AVERAGE");
	int[] values = {1,2,3,4,5};
	 int total = 0;
	 for (int value : values) {
		total+=value;
	}
	 double avg = total/(values.length);
	 System.out.println("Average: "+avg);
	 System.out.println("PROBLEM 2: FIND ODD NUMBERS BETWEEN 79 to 187");
	 for (int i = 79; i <= 187; i++) {
		if (!(i%2==0)) {
			System.out.print(i+", ");
		}
	}
	 System.out.println("PROBLEM 3: CHECK PRIME NUMBER");
	 int numToCheck = 14;
	 
	 boolean isPrime = true;
	 
	 for (int i = 2; i < numToCheck/2; i++) {
		if (numToCheck==1 || numToCheck==2) {
			break;
		}
		 if (numToCheck%i==0) {
			isPrime=false;
			break;
		}
	}
	 if (isPrime) 
	 System.out.println("GIVEN NUMBER "+numToCheck+" IS PRIME");
	 else
	 System.out.println("GIVEN NUMBER "+numToCheck+" IS NOT PRIME");
	 System.out.println("PROBLEM 4: FIND SUM OF DIGITS");
	 System.out.println("PROBLEM 5: REVERSE THE NUMBER");

	 int number = 14230;
	 int temp = number;
	 int sumOfDigits=0;
	 String reverse = "";
	 while(temp>0) {
		 reverse=reverse+temp%10;
		 sumOfDigits=sumOfDigits+temp%10;
		 temp=temp/10;
	 }
	 
	 System.out.println("SUM OF DIGITS OF "+number+ " IS "+sumOfDigits);
	 System.out.println("REVERSE OF NUMBER "+number+" IS "+reverse.trim());
	 System.out.println("PROBLEM 6: FIND DUPLICATE IN ARRAY");
	 int[] intArray = new int[]{12, 32, 12, 45, 65, 93, 0, 23, 45, 6};
	 int[] duplicateArray = new int[10];
	 int dupCount=0;
	 for (int i = 0; i < intArray.length-1; i++) {
		for (int j = i+1; j < intArray.length-1; j++) {
			if(intArray[i]==intArray[j]) {
				duplicateArray[dupCount]=intArray[i];
				dupCount++;
				break;
			}
		}
	}
		System.out.println("DUPLICATE VALUES IN ARRAY:");
		for (int dupValue : duplicateArray) {
			if(dupValue!=0)
			System.out.println(dupValue);
		}
}
}
