package com.tnsif.dayeight.interfacedemo;

public class coder implements beAcoder {
	private int Sid;
	private String Sname;
	public void practice() {
		System.out.println("Working in core java atleast 2hrs");
	}
	public coder() {
		super();
	}
	public coder(int sid,String sname) {
		super();
		this.Sid=sid;
		this.Sname=sname;
	}
	@Override
	public String toString() {
		return "coder [Sid=" + Sid + ", Sname=" + Sname + "]";
	}
	

}
