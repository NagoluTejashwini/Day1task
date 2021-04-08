package day1.task1;

import java.util.Scanner;

public class SalaryBreakUpOfAnEmployee {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter basicSalary:");
		int basicSalary = sc.nextInt();
		double hra = basicSalary*0.40;
		double da = (basicSalary+hra)*0.60;
		double annualSalary=(basicSalary+hra+da)*12;
		double tax;
		if(annualSalary < 200000)
			tax = 0;
		else if(annualSalary >= 200000 && annualSalary < 600000)
			tax = (annualSalary*0.10);
		else
			tax = (annualSalary*0.20);
		double res = (annualSalary-tax);
		System.out.println("Annual Salary :"+annualSalary);
		System.out.println("Tax :"+tax);
		System.out.println("Annual take home salary:"+res);
		
	}

}
