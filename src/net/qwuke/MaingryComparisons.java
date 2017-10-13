package net.qwuke;

import java.util.Scanner;


public class MaingryComparisons {
//Main class for comparing number sequences and where input handling will go on
	public static void main(String[] args) {
		//First I'm going to initialize the two ints that will contain the sequences and then the scanner that will parse the line
		int seqOne;
		int seqTwo;
		Scanner sc = new Scanner(System.in);
		//Intro or explanation messages
		System.out.println("AAAAAAAAAAAAAAAAAAA");
		System.out.println("I'M AN ANGRY COMPARISON ROBOT");
		System.out.println("I WILL COMPARE TWO SEQUENCES OF NUMBERS OF EQUAL LENGTH FOR YOU");
		System.out.println("IF THE NUMBERS IN EACH OF THE RESPECTIVE POSITIONS IN BOTH SEQUENCES ADD UP TO THE SAME NUMBER, IT IS TRUE");
		System.out.println("DON'T USE SPACES OR PUNCTUATION TO SEPERATE THE NUMBERS");
		System.out.println("AAAAA PLEASE ENTER THE FIRST SEQUENCE: ");
		
		while (!sc.hasNextInt()) {        
		    sc.next(); // Handles the non int then waits for the next input, stopping an infinite angry messages/hang and exception simultaneously
		    System.out.print("NOT AN INT, TRY INPUTTING A SEQUENCE THAT IS AN INT VALUE: ");
		}
		seqOne = sc.nextInt();
		
		System.out.println("YOUR FIRST SEQUENCE LOOKS ALRIGHT");
		System.out.println("NOW I NEED SECOND SEQUENCE. REMEMBER THAT THE SEQUENCES NEED TO BE THE SAME LENGTH.");
		System.out.println("LAY IT ON ME: ");

		boolean seqConfirm = false; //To break the do while loop - is this bad practice? I feel like it is
		String checkOne = Integer.toString(seqOne); //Strings that we can use to compare the number of digits in the sequences
		String checkTwo = "";
		
		do {
			if (!sc.hasNextInt()) {
		        System.out.println("NOT AN INT, TRY AGAIN: ");
		        sc.next();
			} else {
				seqTwo = sc.nextInt();
				checkTwo = Integer.toString(seqTwo);
				
		        System.out.println("SEQUENCE ONE: " + checkOne);
		        System.out.println("SEQUENCE TWO: " + checkTwo);//Gives the user a hint on what sequence length they're trying to match
		        
				if (!(checkOne.length()==checkTwo.length())) {
			        System.out.println("GAH, IT WAS A VALID INTEGER VALUE, BUT YOUR SEQUENCES WERE DIFFERENT LENGTHS!");
			        System.out.println("TRY AGAIN: ");
				} else {
			        System.out.println("YUP THEY'RE BOTH SEQUENCES OF THE SAME LENGTH");
					seqConfirm = true;
				}
			}
		 } while (!seqConfirm);
        System.out.println("NOW WE CAN DETERMINE IF IN EACH PLACE ON THE NUMBERS THE DIGITS ADD TO THE SAME VALUE");
        int[] arrOne = CompareSeq.convert(checkOne);
        int[] arrTwo = CompareSeq.convert(checkTwo);
        //Uses one method to convert the already existing strings into nice arrays that can then be more easily used by the compare method
        if(CompareSeq.compare(arrOne, arrTwo)){
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
        sc.close();
	}

}
