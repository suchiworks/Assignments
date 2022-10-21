package oct21Assg;
/*Write a program in Java to display the cube of the number
 up to given an integer..*/

import java.util.Scanner;

public class Cube1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,num;
		System.out.println("enter the number: ");
		 Scanner in = new Scanner(System.in);
		    num = in.nextInt();
            for(i=1;i<=num;i++) {
  System.out.println("Number of : "+i +"cube is:"+(i*i*i));     
 }}}