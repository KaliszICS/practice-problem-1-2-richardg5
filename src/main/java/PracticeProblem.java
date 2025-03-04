public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static boolean validIndex(int[] arr, int index) {
		try {
			arr[index] = arr[index];
		} catch (IndexOutOfBoundsException e) {
			return false;
		}
		return true;
	}

	public static int divide(int a, int b) {
		try {
			return a / b;
		} catch (ArithmeticException e) {
			return 0;
		}
	}

	public static int safeConvertStringtoInt(String convert) {
		try {
			return Integer.parseInt(convert);
		} catch (NumberFormatException e) {
			return 0;
		}
	}
}
