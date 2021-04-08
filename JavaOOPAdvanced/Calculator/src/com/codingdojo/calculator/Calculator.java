package com.codingdojo.calculator;

public class Calculator {
	
	private Double numOne = 0.0;
	private Double numTwo = 0.0;
	private Double total = 0.0;
	private String oper = "";
	
	public Calculator() {
	}
	public Calculator(Double numOne, String oper, Double numTwo) {
		this.numOne = numOne;
		this.oper = oper;
		this.numTwo = numTwo;
	}
	
	
	
	public Double getNumOne() {
		return numOne;
	}
	public void setNumOne(Double numOne) {
		this.numOne = numOne;
	}
	public Double getNumTwo() {
		return numTwo;
	}
	public void setNumTwo(Double numTwo) {
		this.numTwo = numTwo;
	}
	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
	public String getOper() {
		return oper;
	}
	public void setOper(String oper) {
		this.oper = oper;
	}
	
	public void performOperation() {
		if(getOper().equals("+")) {
			Double total = getNumOne() + getNumTwo();
			setTotal(total);
		}
		else if(getOper().equals("-")) {
			Double total = getNumOne() - getNumTwo();
			setTotal(total);
		}
	}
	
	public void getResults() {
		System.out.println(getTotal());
	}
	
	
}
