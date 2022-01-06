package com.greedy.level03.hard.emp.run;

import java.util.Scanner;

import com.greedy.level03.hard.emp.model.dto.EmployeeDTO;

public class Application {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/* 스캐너를 이용해 모든 직원 정보 입력 받기 */
		System.out.print("사번을 입력하세요 : ");
		int number = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		
		System.out.print("부서를 입력하세요 : ");
		String dept = sc.nextLine();
		
		System.out.print("직급을 입력하세요 : ");
		String job = sc.nextLine();
		
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		
		System.out.print("성별을 입력하세요 : ");
		char gender = sc.next().charAt(0);
		
		System.out.print("급여를 입력하세요 : ");
		int salary = sc.nextInt();
		
		System.out.print("보너스포인트를 입력하세요 : ");
		double bonusPoint = sc.nextDouble();
		
		sc.nextLine();
		
		System.out.print("휴대폰 번호를 입력하세요 : ");
		String phone = sc.nextLine();
		
		System.out.print("주소를 입력하세요 : ");
		String address = sc.nextLine();
		
		/* 기본 생성자로 인스턴스 생성 */
		EmployeeDTO emp = new EmployeeDTO();
		
		/* setter를 이용해 필드값 변경 */
		emp.setNumber(number);
		emp.setName(name);
		emp.setDept(dept);
		emp.setJob(job);
		emp.setAge(age);
		emp.setGender(gender);
		emp.setSalary(salary);
		emp.setBonusPoint(bonusPoint);
		emp.setPhone(phone);
		emp.setAddress(address);
		
		/* getter를 이용헤 모든 필드값 출력 */
		System.out.println(emp.getNumber());
		System.out.println(emp.getName());
		System.out.println(emp.getDept());
		System.out.println(emp.getJob());
		System.out.println(emp.getAge());
		System.out.println(emp.getGender());
		System.out.println(emp.getSalary());
		System.out.println(emp.getBonusPoint());
		System.out.println(emp.getPhone());
		System.out.println(emp.getAddress());

	}

}
