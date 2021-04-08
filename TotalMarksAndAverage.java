package day1.task1;

import java.util.Scanner;

public class TotalMarksAndAverage {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter englishMarks:");
		int englishMarks = sc.nextInt();
		System.out.println("Enter javaMarks:");
		int javaMarks = sc.nextInt();
		System.out.println("Enter dbMarks:");
		int dbMarks = sc.nextInt();
		System.out.println("Enter springToolsMarks:");
		int springToolsMarks = sc.nextInt();
		
		float totalMarks = englishMarks+javaMarks+dbMarks+springToolsMarks;
		float avg = totalMarks/4;
		System.out.println("TotalMarks:"+totalMarks);
		System.out.println("Average:"+avg);

	}

}
