package Week1.day1;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 15;
		boolean isPrime = false;
		for (int j = 2; j <=i/2; j++) {
			if (i%j==0) {
				isPrime = true;
				break;
				
			}
			
		}
if (isPrime) {
	System.out.println(i+"Prime number");
} else {
System.out.println(i+"not a prime number");
}
	}

}

