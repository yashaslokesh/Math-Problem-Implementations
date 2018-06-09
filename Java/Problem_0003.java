package solutions;

public final class Problem_0003 {

	/*
	 * The prime factors of 13195 are 5, 7, 13 and 29. What is the largest prime
	 * factor of the number 600851475143 ?
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long num = 600_851_475_143L;
		while (num != smallestFactor(num)) {
			num /= smallestFactor(num);
		}
		System.out.println(num);
	}

	private static long smallestFactor(long num) {
		for (int i = 2; i < Math.sqrt(num); i++) {
			if (num % i == 0) {
				return i;
			}
		}
		return num;
	}
}
