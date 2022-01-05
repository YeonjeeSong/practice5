package com.greedy.level02.normal.student.model.dto;

public class StudentDTO {

	private int grade;
	private int classroom;
	private String name;
	private double height;
	private char gender;
	
	/* 기본 생성자 명시적으로 작성 */
	public StudentDTO() {}
	
	/* 모든 필드를 초기화 하는 생성자 */
	public StudentDTO(int grade, int classroom, String name, double height, char gender) {
		this.grade = grade;
		this.classroom = classroom;
		this.name = name;
		this.height = height;
		this.gender = gender;
	}
	
	/* 설정자(setter) 메소드 */
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public void setClassroom(int classroom) {
		this.classroom = classroom;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	/* 접근자(getter) 메소드 */
	public int getGrade() {
		return grade;
	}
	
	public int classroom() {
		return classroom;
	}
	
	public String name() {
		return name;
	}
	
	public double height() {
		return height;
	}
	
	public char gender() {
		return gender;
	}
	
	public void printInformation() {	// return값이 없기 때문에 여기에 syso 작성
		System.out.println("학년 : " + this.grade);
		System.out.println("반 : " + this.classroom);
		System.out.println("이름 : " + this.name);
		System.out.println("키 : " + this.height);
		System.out.println("성별 : " + this.gender);
	}
	
}
