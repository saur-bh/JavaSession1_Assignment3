/*
 * Problem Statement :Write a program in java to compare the truth table of Bitwise AND and Logical AND.
 */

package com.acadglid.javasession;

import java.util.Scanner;

public class Session3 {

	public static void main(String[] args) {

		//1. Initialize two bytes 

		byte firstByte,secondByte;

		//2. create instance of scanner class 

		Scanner sc = new Scanner(System.in);

		//3. Ask user to enter first bytes value as 0 or 1 .

		System.out.println("Enter the first byte either 0 or 1");
		firstByte = sc.nextByte();


		//4. Ask user to enter second bytes value as 0 or 1 .

		System.out.println("Enter the second byte either 0 or 1");
		secondByte = sc.nextByte();


		//5. Print the result Bitwise AND 

		System.out.println("bitWise AND for enter numbers" +firstByte+ " and "+secondByte+ " is :" +(firstByte^secondByte));
		
		//6. Print the result of Logical AND
		
		System.out.println("Logical AND for enter numbers" +firstByte+ " and "+secondByte+ " is :" +(firstByte&secondByte));

	}

}