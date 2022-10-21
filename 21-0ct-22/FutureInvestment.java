package oct21Assg;

public class FutureInvestment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float P =1000, R =10, T =5;
		  float SI =(P * T * R)/100;        
		   for(int i=1;i<=T;i++) {
			  System.out.println("Simple interest ="+i+" "+SI);
    }
}}
