package com.mru.logics;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 123;
		int x = num;
		int rev = 0;

		while(num != 0) {
			int last = num % 10;
			rev = rev*10 + last;
			num = num/10;
			
		}
		System.out.println(rev);
		
		if(x == rev) {
			System.out.println("Palindrome Number");
		}else {
			System.out.println("No Palindrome Number");
			
		}
		
	}

}
