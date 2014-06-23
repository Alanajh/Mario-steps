package com.Harmon.Mario;

import java.util.Scanner;

public class Mario {

	private int n; //// user input variable
	private int columns = 0; /// columns
	private int rows = 0; /// rows
	
	public Mario() {
		
		///// prompt user and collect user input ///////
		do{
			System.out.println("Please enter an integer between 0 - 24");
			
			Scanner scanner = new Scanner(System.in); /// get user input from scanner
			n = scanner.nextInt(); /// convert input to an integer
		}
		/// checking for correct value between 0 - 24 ///////
		while
			(n <= 0 || n >= 24);
	/// when the user enters the correct input value //////
	for(rows = 1; rows <= n; rows++){
		for(columns = 1; columns <= n; columns++ ){
			if(columns >= n + 1 - rows){
				System.out.print("#");/// print hashes when applicable       
			}
			else{
				System.out.print(" "); /// print spaces when applicable
			}
		}
		System.out.print("\n");
	}
	}
	public static void main(String[] args) {
		new Mario();
	}

}
