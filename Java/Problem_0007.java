package solutions;

public final class Problem_0007 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		for (int i = 2; count < 10_001; i++) {
			if (isPrime(i)) {
				count++;
				if (count == 10_001) {
					System.out.println(i);
				}
			}
		}
	}
	
	private static boolean isPrime(int num) {
		for(int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

}
