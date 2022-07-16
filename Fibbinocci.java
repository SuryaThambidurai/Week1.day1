package Week1.day1;

public class Fibbinocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int firstnum = 0;
		int secnum = 1;
		int sum = 0;
		System.out.println(firstnum);
		System.out.println(secnum);
for (int i = 1; i <=9; i++) {
	sum = firstnum+secnum;
	System.out.println(sum);
	firstnum = secnum;
	secnum = sum;
}
	}

}
