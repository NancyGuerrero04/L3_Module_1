package SearchingAndSortingAlgorithms;

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
	 for(int i = 0; i < peeps.size(); i++) {
		 if(peeps.get(i)>=tallest) {
			tallest = peeps.get(i);
			
		 }
	 }
	 return tallest;
 }

public static String findLongestWord(List<String> words) {
	// TODO Auto-generated method stub
	int longest = 0; 
	String longestWord = ""; 
	

	for(int i = 0; i < words.size(); i++) {
		String curWord = words.get(i);
		if(curWord.length() > longest) {
			longest = curWord.length();
			longestWord = curWord;	
			
			
			
		}
		
	}
	return longestWord;
}

public static boolean containsSOS(List<String> message1) {
	// TODO Auto-generated method stub
	for(String message: message1) {
		if(message.contains("... --- ...") == true){
			return true; 
			
		}
	}
	return false; 
}

 //Add other methods here
 }

