package week1.day1;

public class HelloSelenium {
	public static void main(String[] args) {
		System.out.println("Test Program");
		boolean haveBike=true;
		int noofVehicles=2;
		char bikeLogo='H';
		String bikeName="Hero";
		System.out.println(noofVehicles);
		System.out.println(bikeName+" "+bikeLogo+" "+noofVehicles);
		
		for (int i = 0; i <= 20; i++) {
			if(i%2!=0) {
				System.out.println(i);
			}	
		}
		System.out.println("Loop Done");
	}

}
