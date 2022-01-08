package com.greedy.level04.advanced.shape.manager;

import com.greedy.level04.advanced.shape.model.dto.ShapeDTO;

public class SquareManager {

	/* 사각형의 둘레를 계산하여 출력 */
	public void calcPerimeter(ShapeDTO shape) {
		
		double height = shape.getHeight();
		double width = shape.getWidth();
		 
		double perimeter = (height + width) * 2;
		 
		System.out.println("사각형의 둘레는 " + perimeter + "입니다.");
	}
	
	/* 사각형의 면적을 계산하여 출력 */
	public void calcArea(ShapeDTO shape) {
		
		double height = shape.getHeight();
		double width = shape.getWidth();
		
		double area = height * width;
		
		System.out.println("사각형의 넓이는 " + area + "입니다.");
	}
	
	/* 사각형의 정보를 양식에 맞게 출력 */
	public void printShape(ShapeDTO shape) {
		
		System.out.println("도형 타입 : 사각형");
		System.out.println("높이 : " + shape.getHeight());
		System.out.println("너비 : " + shape.getWidth());
		System.out.println("색상 : " + shape.getColor());
	}
	
	/* 첫 번째 매개변수로 받은 도형을 두 번째 매개변수로 전달 받은 색상으로 변경 */
	public void paintColor(ShapeDTO shape, String color) {
		
		shape.setColor(color);
		System.out.println("선택하신 도형을 " + color + "(으)로 색칠합니다.");
	}
	
}
