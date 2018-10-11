package week1;

public class TimesTableMethod {

	public static void main(String[] args) {
	
		timesTable(8);

	}
	// Print times table of given number
	public static void timesTable(int d) {
			System.out.println("Times Table of " + d);
			System.out.println("====================== ");
		for (int b=1;b<=10;b=b+1) {
			System.out.println(d + " x "+ b +" = "+ d*b);
}
	}
}
