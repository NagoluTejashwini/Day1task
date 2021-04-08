package day1.task1;

import java.util.Scanner;

public class DateSuffix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter date:");
		int date = sc.nextInt();
		if(date < 32 && date > 0) {
			if(date >= 11 && date < 20) {
				System.out.println("output:"+date+"th");
			}
			else {
				int i = date%10;
				if(i == 1) System.out.println("output:"+date+"st");
				else if(i == 2) System.out.println("output:"+date+"nd");
				else if(i == 3) System.out.println("output:"+date+"rd");
				else System.out.println("output:"+date+"th");
			}
		}
		else System.out.println("Wrong date");

	}

}
