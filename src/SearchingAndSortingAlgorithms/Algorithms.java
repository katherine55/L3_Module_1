package SearchingAndSortingAlgorithms;

import java.util.List;

public class Algorithms {

	public static int findBrokenEgg(List<String> x) {
		for (int i = 0; i < x.size(); i++) {
			if (x.get(i).equals("cracked")) {
				return i;
			}
		}
		return -1;
	}

	public static int countPearls(List<Boolean> x) {
		int pearls = 0;
		for (int i = 0; i < x.size(); i++) {
			if (x.get(i)) {
				pearls++;
			}
		}
		return pearls;
	}

	public static double findTallest(List<Double> x) {
		double tallest = 0.0;
		for (int i = 0; i < x.size(); i++) {
			if (x.get(i) > tallest) {
				tallest = x.get(i);
			}
		}
		return tallest;
	}

	public static String findLongestWord(List<String> x) {
		int length = 0;
		String longest = "";
		for (int i = 0; i < x.size(); i++) {
			if (x.get(i).length() > longest.length()) {
				longest = x.get(i);
			}
		}
		return longest;
	}

	public static Boolean containsSOS(List<String> x) {
		Boolean contained;
		for (int i = 0; i < x.size(); i++) {
			if (x.get(i).contains("... --- ...")) {
				contained = true;
				return contained;
			}
		}
		contained = false;
		return contained;
	}

	public static List<Double> sortScores(List<Double> x) {
		double a;
		double b;
		for (int n = 0; n < x.size() - 1; n++) {
			for (int i = 0; i < x.size() - 1; i++) {
				a = x.get(i);
				b = x.get(i + 1);
				if (a > b) {
					x.set(i, b);
					x.set(i + 1, a);
				}
			}
		}
		return x;
	}

}
