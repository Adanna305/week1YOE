package day1;

import java.util.Scanner;

public class warmUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ari = new Scanner(System.in);
		System.out.println("Name?");
		ari.next();//string
		System.out.println("Age?");
		ari.nextInt();//integer
		System.out.println("Favorite color?");
		ari.next();//string
		System.out.println("Best number?");
		ari.nextInt();//integer
		System.out.println("Thank you for you participation");
	 
		ari.close();
	}

}
