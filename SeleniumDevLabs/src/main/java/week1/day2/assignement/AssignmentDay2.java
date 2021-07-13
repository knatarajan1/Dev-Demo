package week1.day2.assignement;

public class AssignmentDay2 {

	public static void main(String[] args) {

		//Find Largest of three numbers
		System.out.println("FIND LARGEST OF THREE NUMBERS: ");
		
		int num1=100;int num2 = 20;int num3 = 710;
		int largeNumber=0;
			if(num2>num1) {
			largeNumber=num2;
			if(num3>num2) {
				largeNumber=num3;
			}
		}
		else if(num2<num1) {
			largeNumber=num1;
			if(num3>num1) {
				largeNumber=num3;
			}
		}
		else
			largeNumber=num1;
		
		System.out.println("LARGE NUMBER :"+largeNumber);
		
	// Switch Case for Browsers
		String browserName = "Chrome";
		
		switch (browserName) {
		case "IE":
			System.out.println("Launch IE Browser");
			break;
		case "Chrome":
			System.out.println("Launch Chrome Browser");
			break;
		case "Firefox":
			System.out.println("Launch Firefox Browser");
			break;
		case "Opera":
			System.out.println("Launch Opera Browser");
			break;
		default:
			System.out.println("Provide correct browser Name");
			break;
		}
		
		// Reverse Name
		System.out.println("Reversal of name:");
		String myName = "Karthik";
		char[] charsInMyName = myName.toCharArray();
		System.out.println();
		for (int i = charsInMyName.length-1; i >=0; i--) {
			System.out.print(charsInMyName[i]);
		}
		System.out.println();
		//Find Number of e in following word
		String word = "Amazon Development Center";
		int count=0;
		for (int i = 0; i < word.length(); i++) {
			if(word.charAt(i)=='e')
				count++;
		}
		System.out.println("Number of e in letter is "+count);
	}

}
