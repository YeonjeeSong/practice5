package com.greedy.level02.normal.student.run;

import java.util.Scanner;

import com.greedy.level02.normal.student.model.dto.StudentDTO;

public class Application {

	public static void main(String[] args) {
		
		/* 스캐너로 학생 정보를 모두 입력 받아 모든 필드를 초기화하는 생성자로 인스턴스 생성 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("학년을 입력하세요 : ");
		int grade = sc.nextInt();
		
		System.out.print("반을 입력하세요 : ");
		int classroom = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		
		System.out.print("키를 입력하세요 : ");
		double height = sc.nextDouble();
		
		System.out.print("성별을 입력하세요 : ");
		char gender = sc.next().charAt(0);
		
		StudentDTO student = new StudentDTO(grade, classroom, name, height, gender);
		
		/* 모든 필드 정보를 출력하는 메소드 호출 */
		student.printInformation();
		
	}

}
