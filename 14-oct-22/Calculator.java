package oct14Assg;

/*Write a java program to illustrate Calculator class 
with addition, subtraction,
multiplication methods that can take any number of 
parameters to perform 
the operation, without using method/constructor overloading*/


import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1,n2,n3;
		System.out.println(" enter the first number");
		System.out.println(" enter the second number");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3=n1+n2;
		System.out.println(" addition:" +"  "+(n1+n2));
		System.out.println(" substaction:"+ "  "+(n1-n2));
		System.out.println(" multiplication:" +"  "+(n1*n2));
		System.out.println(" division:" +"  "+(n1/n2));

	 }}
	
