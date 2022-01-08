package com.greedy.level04.advanced.shape.views;

import java.util.Scanner;

import com.greedy.level04.advanced.shape.manager.SquareManager;
import com.greedy.level04.advanced.shape.manager.TriangleManager;
import com.greedy.level04.advanced.shape.model.dto.ShapeDTO;

public class ShapeMenu {

	private Scanner sc = new Scanner(System.in);
	
	/* 메인 메뉴 출력 후 도형의 높이와 너비를 입력 받고, 선택한 메뉴에 따라 각 도형별 서브메뉴 호출 */
	public void mainMenu() {
		
		while(true) {
			
			System.out.println("========== 도형 계산기 ==========");
			System.out.println("3. 삼각형");
			System.out.println("4. 사각형");
			System.out.println("9. 프로그램 종료");
			System.out.print("계산하려는 도형을 선택하세요 : ");
			int num = sc.nextInt();
			
			if(num != 3 && num != 4 && num != 9) {
				System.out.println("계산할 수 없는 도형입니다. 다시 입력하세요.");
			} else if(num == 9) {
				System.out.println("프로그램을 종료합니다.");
				return;	// mainMenu() 종료
			}
			
			System.out.print("도형의 높이를 입력하세요 : ");
			double height = sc.nextDouble();
			System.out.print("도형의 너비를 입력하세요 : ");
			double width = sc.nextDouble();
			
			ShapeDTO shape = new ShapeDTO(num, height, width);
			
			switch(shape.getType()) {
			case 3 : triangleMenu(shape); break;
			case 4 : squareMenu(shape); break;
			}
			
		}
		
	}
	
	/* 삼각형 계산기 서브 메뉴 출력 후 선택한 번호에 따른 각기 다른 메소드 호출 */
	private void triangleMenu(ShapeDTO shape) {
		
		TriangleManager tm = new TriangleManager();
		
		while(true) {
			
			System.out.println("========== 삼각형 계산기 ==========");
			System.out.println("1. 삼각형의 둘레 구하기");
			System.out.println("2. 삼각형의 면적 구하기");
			System.out.println("3. 선택한 도형 정보 출력하기");
			System.out.println("4. 도형의 색상 칠하기");
			System.out.println("9. 메인으로 돌아가기");
			System.out.print("메뉴를 선택하세요 : ");
			int num = sc.nextInt();
			
			switch(num) {
			case 1 : tm.calcPerimeter(shape); break;
			case 2 : tm.calcArea(shape); break;
			case 3 : tm.printShape(shape); break;
			case 4 : tm.paintColor(shape, inputColor()); break;
			case 9 : System.out.println("메인으로 돌아갑니다"); return;	// triangleMenu(ShapeDTO shape) 종료
			default : System.out.println("잘못 선택하셨습니다. 메뉴를 다시 선택하세요"); break;
			}
			
		}
		
	}
	
	/* 사각형 계산기 서브 메뉴 출력 후 선택한 번호에 따른 각기 다른 메소드 호출 */
	private void squareMenu(ShapeDTO shape) {
	
		SquareManager sm = new SquareManager();
		
		while(true) {
			
			System.out.println("========== 사각형 계산기 ==========");
			System.out.println("1. 삼각형의 둘레 구하기");
			System.out.println("2. 삼각형의 면적 구하기");
			System.out.println("3. 선택한 도형 정보 출력하기");
			System.out.println("4. 도형의 색상 칠하기");
			System.out.println("9. 메인으로 돌아가기");
			System.out.print("메뉴를 선택하세요 : ");
			int num = sc.nextInt();
			
			switch(num) {
			case 1 : sm.calcPerimeter(shape); break;
			case 2 : sm.calcArea(shape); break;
			case 3 : sm.printShape(shape); break;
			case 4 : sm.paintColor(shape, inputColor()); break;
			case 9 : System.out.println("메인으로 돌아갑니다"); return;	// squareMenu(ShapeDTO shape) 종료
			default : System.out.println("잘못 선택하셨습니다. 메뉴를 다시 선택하세요"); break;
			}
			
		}
	}
	
	/* 변경하려는 색상을 입력 받아 문자열로 반환 */
	private String inputColor() {
		
		System.out.println("어떤 색으로 도형을 칠할까요? : ");
		String color = sc.nextLine();
		
		return color;
	}
	
}
