package com.greedy.level04.advanced.shape.model.dto;

public class ShapeDTO {

	private int type;
	private double height;
	private double width;
	private String color;
	
	/* 기본 생성자 명시적 작성 */
	public ShapeDTO() {}
	
	/* 매개변수로 전달 받은 값으로 필드를 초기화 */
	public ShapeDTO(int type, double height, double width) {
		this.type = type;
		this.height = height;
		this.width = width;
		this.color = "white";
	}
	
	/* 설정자(setter) 메소드 */
	public void setType(int type) {
		this.type = type;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	/* 접근자(getter) 메소드 */
	public int getType() {
		return type;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double getWidth() {
		return width;
	}
	
	public String getColor() {
		return color;
	}
}
