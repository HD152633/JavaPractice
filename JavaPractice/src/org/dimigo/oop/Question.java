package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.oop
 *	 |_ Question
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 4. 3.
 * </pre>
 *
 *	@author      : swc03
 *	@version 	 : 1.0
 */
public class Question {
	
	public static void main(String[] args) {
		String[] questions = {"1. 가장 좋아하는 가수는?", "2. 가장 좋아하는 배우는?", "3. 가장 좋아하는 과목은?"};
		String[] anwers = {"장용준", "심은경", "미적분"};
		
		Scanner scanner = new Scanner(System.in);
		StringBuilder result = new StringBuilder("<<결과 출력>>");
		
		for(int i=0; i<3; i++){
			
			System.out.println(questions[i]);
			String anwer = scanner.nextLine();
			if(anwer.equals(anwers[i])) {
				System.out.println("정답입니다!");
			}
			else System.out.println("틀렸습니다!");
		}

		StringBuilder sb = new StringBuilder();
		for(int i=0; i<3; i++){
			sb.append(questions[i]).append(anwers[i]).append("입니다.\n");
		}
		
		System.out.println(sb);
			
	
	}
	
}
	
