package net.qwuke;

public class CompareSeq {
	//Class which the comparison function will happen between sequence one and two which will be passed to it
	
	public static int[] convert(String a) {
	//This function will return the stringed sequences we used when handling the input back as arrays		

		int[] convertedArray = new int[a.length()];
		for (int i = 0; i < a.length(); i++)
		{
			convertedArray[i] = a.charAt(i) - '0';
		}
		return convertedArray;
	}
	
	public static boolean compare (int[] b, int[] c) {
	//This will compare the int arrays and determine if in each position they are the same length
	
		int compareNum = b[0] + c[0];
		for(int i = 0; i < b.length; i++) {
			if(compareNum !=(b[i] + c[i])) {
				return false;
			}
		}
		return true;	
	}
}
