package com.kodnest.lastindex;

import java.util.Scanner;

public class LastIndex {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char character = sc.next().charAt(0);
		sc.close();
		
		int lastIndex = findLastIndex(str, character);
		System.out.println(lastIndex);
	}

	public static int findLastIndex(String str, char character) {
		int lastIndex = -1;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == character) {
				lastIndex = i;
			}
		}
		return lastIndex;
	}
}