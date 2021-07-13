package week2.day1;

public class LearningStatic {

	int a =0;
	static int b=0;
	
	public static void get() {
	}
	
	public void getUpdate() {
		a++;
		b++;
		System.out.println("STATIC: "+b);
		System.out.println("NON-STATIC: "+a);
	}
	
	public static void main(String[] args) {
		LearningStatic ls1= new LearningStatic();
		ls1.getUpdate();
		ls1.getUpdate();
		ls1.getUpdate();
		System.out.println("************");
		LearningStatic ls2= new LearningStatic();
		ls2.getUpdate();
		ls2.getUpdate();
		ls2.getUpdate();
		
	}
}
