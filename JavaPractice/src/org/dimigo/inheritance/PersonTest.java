package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *	 |_ PersonTest
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 5. 25.
 * </pre>
 *
 *	@author      : swc03
 *	@version 	 : 1.0
 */
public class PersonTest {
	
	public static void main(String[] args) {
		
		Person a = new Person("Tom");
		System.out.println(a.toString());
		Person k = new Korean("홍길동");
		System.out.println(k.toString());
		Person j = new Japanese("다나카");
		System.out.println(j.toString());
		Person c = new Chinese("왕밍");
		System.out.println(c.toString());
		
		System.out.println();
		
		a.sayHello();
		k.sayHello();
		j.sayHello();
		c.sayHello();
		
		System.out.println();
		
		a.sayBye();
		k.sayBye();
		j.sayBye();
		c.sayBye();
		
	}

}
