package com.QuestionsEntity.QuestionsEntity.Entity;

public class Options {
	private String a;
	private String b;
	private String c;
	private String d;
	public Options(String a, String b, String c, String d) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}
	public String getA() {
		return a;
	}
	public void setA(String a) {
		this.a = a;
	}
	public String getB() {
		return b;
	}
	public void setB(String b) {
		this.b = b;
	}
	public String getC() {
		return c;
	}
	public void setC(String c) {
		this.c = c;
	}
	public String getD() {
		return d;
	}
	public void setD(String d) {
		this.d = d;
	}
	public Options() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Options [a=" + a + ", b=" + b + ", c=" + c + ", d=" + d + ", getA()=" + getA() + ", getB()=" + getB()
				+ ", getC()=" + getC() + ", getD()=" + getD() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
}
