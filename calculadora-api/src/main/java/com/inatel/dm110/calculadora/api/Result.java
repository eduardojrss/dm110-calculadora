package com.inatel.dm110.calculadora.api;

public class Result {
	private double first;
	private double second;
	private double result;
	public Result(double first, double second, double result) {
		this.first = first;
		this.second = second;
		this.result = result;
	}
	public double getFirst() {
		return first;
	}
	public void setFirst(double first) {
		this.first = first;
	}
	public double getSecond() {
		return second;
	}
	public void setSecond(double second) {
		this.second = second;
	}
	public double getResult() {
		return result;
	}
	public void setResult(double result) {
		this.result = result;
	}
}
