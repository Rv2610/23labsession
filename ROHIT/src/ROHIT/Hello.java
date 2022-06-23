package ROHIT;

import java.util.*;
public class Hello {

	public static void main(String[] args) {
		System.out.println("enter number");
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		for(int i = 1 ; i <= 10 ; i++) {
			System.out.print(a+" x "+i + " = "+ a*i);
		}
		
		
		

	}

}
