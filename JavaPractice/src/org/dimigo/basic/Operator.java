package org.dimigo.basic;

/**
 * <pre>
 * org.dimigo.basic
 *	 |_ Operator
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 3. 23.
 * </pre>
 *
 *	@author      : swc03
 *	@version 	 : 1.0
 */
public class Operator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int price = 1700000;
		int person = 3;
		int num = 1500;
		long res = (long)12*price*person*num;
		
		System.out.println("<<디미베네 연간 인건비>>");
		System.out.println("월 평균 급여 : "+String.format("%,d", price)+'원');
		System.out.println("점포 내 직원 수 : "+person+'명');
		System.out.println("점포 수 : "+String.format("%,d", num)+'개');
		System.out.println("\n연간 인건비 : "+String.format("%,d", res)+'원');

	}

}
