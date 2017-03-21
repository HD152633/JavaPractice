package org.dimigo.basic;

import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.basic
 *	 |_ game
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 3. 16.
 * </pre>
 *
 *	@author      : swc03
 *	@version 	 : 1.0
 */
public class Loop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		while(true){
					
	    System.out.println("--------------------");
		System.out.println("<<게임 메뉴>>");
		System.out.println("1. 공격력 증가");
		System.out.println("2. 공격력 감소");
		System.out.println("3. 캐릭터 설정");
		System.out.println("9. 종료");
		System.out.println("--------------------");
		System.out.println("");	
			int choice = scanner.nextInt();
			System.out.println(choice);
			//if(choice==)
			if(choice==9) break;
		}
	}

}
