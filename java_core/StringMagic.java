package java_core;

public class StringMagic {
	public static boolean areAnagrams(String str1, String str2) {
		char[] array1 = str1.toLowerCase().toCharArray();
		char[] array2 = str2.toLowerCase().toCharArray();
		if(array1.length!=array2.length) return false;
		for (int i = 0; i < array2.length; i++) {
			if(array1[i]==array2[array2.length-i-1]) return true;
		}
        return false;
    }
	public static String reverseString(String sentence) {
		char[] array1 = sentence.toCharArray();
		char[] array2 = new char[array1.length];
		String res = "";
		for (int i = 0; i < array1.length; i++) {
			array2[i] = array1[array1.length-i-1];
			res+=array2[i];
		}
		return res;
	}
	public static String reverseSB(String sentence) {
		StringBuffer sbSentence = new StringBuffer();
		for(String word:sentence.split(" ")) {
			StringBuffer sbWord = new StringBuffer(word).reverse();
			sbSentence.append(sbWord).append(" ");
		}
		return sbSentence.toString();
	}
	public static void main(String[] args) {
		String s1 = "";
		String s2 = "Helllo Vinh";
		System.out.println(reverseSB(s2));
	}
}
