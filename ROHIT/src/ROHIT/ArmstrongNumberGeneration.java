/*
 * @Author rohit rathod
 */

package ROHIT;

public class ArmstrongNumberGeneration {

	public static void main(String[] args) {
		int a = 153;
		int rem = 1;
		int count = 0;
		while(a>0) {
			rem = a%10;
			
			a = a/10;
			count = count+1;
			System.out.println(rem+"  "+ count);
			
		}
		
		

	}

}
