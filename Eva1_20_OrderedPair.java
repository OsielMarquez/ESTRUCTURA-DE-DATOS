package EVA1_20;

import java.util.Arrays;

public class Eva1_20_OrderedPair {

	public static void main(String[] args) {
		printAllPossibleOrderedPairs(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 });
	}

	public static void printAllPossibleOrderedPairs(int[] arrayOfItems) {
		for (int primer : arrayOfItems) {
			for (int segundo : arrayOfItems) {
				int[] orderedPair = new int[] { primer, segundo };
				System.out.println(Arrays.toString(orderedPair));
			}
		}
	}

}