package org.itstep.model;

public class Multiplication {
	private int a;
	private long b;
	private double c;
	
	private double mult1 = a*b;
	private double mult2 = b*c;
	private double mult3 = c*a;
	
	
	public void printArea() {
		
		if (mult1 > mult2 && mult1 > mult3){
			System.out.println("Maximal value: a multiplied by b = " + getMult1());
		}
		else if (mult2 > mult1 && mult2 > mult3) {
			System.out.println("Maximal value: b multiplied by c = " + getMult2());
		}
		else if (mult3 > mult1 && mult3 > mult2) {
			System.out.println("Maximal value: a multiplied by c = " + getMult3());
		}
		else {
			System.out.println("Error");
		}
	}
			
			

	public double getMult1() {
		return mult1;
	}


	public double getMult2() {
		return mult2;
	}


	public double getMult3() {
		return mult3;
	}


	public void setA(int a) {
		this.a = a;
	}
	
	public void setB(long b) {
		this.b = b;
	}
	
	public void setC(double c) {
		this.c = c;
	}
		
}

