package sep30Assg;
/*Develop a program which prints the prime numbers 
 * between 1 and 150
The output should be printed in this format
1,3,5……goes on till it prints the last prime number.
Prime number definition: A prime number (or a prime) 
is a natural number greater than 1 that has no positive 
divisors other than 1 and itself. 
For example 5 is prime, as only 1 and 5 divide it.*/
import java.util.Scanner;

public class PrimeNum {

	public static void main(String[] args) {
		int i;
		for(i=1; i<=150;i++) {
			if(i%3==0||i%5==0|| i%3==0 && i%5==0){
				System.out.print(i +", ");	
				
			}
			for(int k=2;k<=i;k++) {
				if(i%k!=0) {
					System.out.print(i+ " ");}}
		
		}}}
	


