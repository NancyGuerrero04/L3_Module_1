package SearchingAndSortingAlgorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		for (int i = 0; i < eggs.size(); i++) {
			if (eggs.get(i) == "cracked") {
				return i;
			}
		}
		return -1; // <- this needs changing
	}

	public static int countPearls(List<Boolean> oysters) {
		// TODO Auto-generated method stub
		int pearlCount = 0;
		for (int i = 0; i < oysters.size(); i++) {
			if (oysters.get(i) == true) {
				pearlCount++;

			}
		}
		return pearlCount;
	}

	public static double findTallest(List<Double> peeps) {
		// TODO Auto-generated method stub
		double tallest = 0;
		for (int i = 0; i < peeps.size(); i++) {
			if (peeps.get(i) >= tallest) {
				tallest = peeps.get(i);

			}
		}
		return tallest;
	}

	public static String findLongestWord(List<String> words) {
		// TODO Auto-generated method stub
		int longest = 0;
		String longestWord = "";

		for (int i = 0; i < words.size(); i++) {
			String curWord = words.get(i);
			if (curWord.length() > longest) {
				longest = curWord.length();
				longestWord = curWord;

			}

		}
		return longestWord;
	}

	public static boolean containsSOS(List<String> message1) {
		// TODO Auto-generated method stub
		for (String message : message1) {
			if (message.contains("... --- ...") == true) {
				return true;

			}
		}
		return false;
	}

	public static List<Double> sortScores(List<Double> results) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < results.size(); i++) {
			double smallest = 999;
			int smallestI = 999;

			for (int j = i; j < results.size(); j++) {

				if (results.get(j) <= smallest) {
					smallest = results.get(j);
					smallestI = j;

				}

			}
			Collections.swap(results, smallestI, i);
			System.out.println(results);
		}

		
		return results;

	}

	public static Object sortDNA(List<String> unsortedSequences) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < unsortedSequences.size(); i++) {
			
			String smallest = unsortedSequences.get(0);
			
			int smallestI = 0;

			for (int j = i; j < unsortedSequences.size(); j++) {

				if (unsortedSequences.get(j).length() <= smallest.length()) {
					smallest = unsortedSequences.get(j);
					smallestI = j;

				}

			}
			Collections.swap(unsortedSequences, smallestI, i);
			System.out.println(unsortedSequences);
		}

		
		return unsortedSequences;

	}

	}

	// Add other methods here

