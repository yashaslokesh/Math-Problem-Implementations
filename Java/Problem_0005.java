package solutions;

public final class Problem_0005 {

	/*
	 * in progress
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = 1;
		for (int i = 1; i <= 20; i++) {
			result = leastCommonMultiple(result, i);
		}
		System.out.println(result);
	}
	
	public static int leastCommonMultiple(int x, int y) {
		int product = x * y;
		int gcf = greatestCommonFactor(x, y);
		return product / gcf;
	}
	
	public static int greatestCommonFactor(int x, int y) {
		int bound = Math.min(x, y);
		int result = 0;
		for (int i = 1; i <= bound; i++) {
			if (x % i == 0 && y % i == 0) {
				result = i;
			}
		}
		return result;
	}
}
