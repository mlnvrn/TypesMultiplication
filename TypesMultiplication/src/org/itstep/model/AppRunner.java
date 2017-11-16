package org.itstep.model;

public class AppRunner {

	public static void main(String[] args) {
		Multiplication multiplication = new Multiplication();
		multiplication.setA(3);
		multiplication.setB(100);
		multiplication.setC(5);
		multiplication.getMult1();
		multiplication.getMult2();
		multiplication.getMult3();
	}

}
