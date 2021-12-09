package com.javaex.ex03;

public class Shape {
	
	/*
	 * private --> protected  (instance도 사용할 수 있도록)
	 * 
	 */
	protected String fillColor;
	protected String lineColor;
	
	/*
	 * super implicit ? 
	 * 
	 */
	public Shape() {
		
	}
	
	public Shape(String fillColor, String lineColor) {
		this.fillColor = fillColor;
		this.lineColor = lineColor;
	}

//	public String getFillColor() {
//		return fillColor;
//	}

	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}

//	public String getLineColor() {
//		return lineColor;
//	}

	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}
	
	
	
}

