package com.javaex.ex01;

public class Customer extends Person{
	
	private int cNo;
	private int point;
	
	public Customer(){
		
	}
	
	public Customer(String name, String hp, int cNo, int point) {
		super(name, hp);
		this.cNo = cNo;
		this.point  = point;
	}

	public int getcNo() {
		return cNo;
	}

	public void setcNo(int cNo) {
		this.cNo = cNo;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}
	
	public void showInfo() {
		System.out.println("#name: "+this.getName()+", #hp: "+this.getHp()+", #cNo: "+cNo+", #point: "+point);
	}
}
