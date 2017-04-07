package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *	 |_ SnackTest
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 4. 7.
 * </pre>
 *
 *	@author      : swc03
 *	@version 	 : 1.0
 */
public class SnackTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Snack[] snacks = new Snack[] {
				new Snack("새우깡", "농심", 1100, 2),
				new Snack("콘칩", "크라운", 1200, 1),
				new Snack("허니버터칩", "해태", 1500, 4)
		};
		
		int sum = 0;
		
		for(int i=0; i<3; i++)
		{
			System.out.println(snacks[i]);
			System.out.println();
			sum+=snacks[i].calcPrice();
			
		}
		System.out.println("총 구매 금액 :"+String.format("%,d", sum)+"원");
	}

}
