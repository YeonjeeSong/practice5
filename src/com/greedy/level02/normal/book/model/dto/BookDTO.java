package com.greedy.level02.normal.book.model.dto;

public class BookDTO {

	private String title;
	private String publisher;
	private String author;
	private int price;
	private double discount;
	
	/* 기본 생성자 명시적으로 작성 */
	public BookDTO() {}
	
	/* 3가지를 초기화 하는 생성자 */
	public BookDTO(String title, String publisher, String author) {
		this.title = title;
		this.publisher = publisher;
		this.author = author;
	}
	
	/* 모든 필드를 초기화 하는 생성자 */
	public BookDTO(String title, String publisher, String author, int price, double discount) {
		this(title, publisher, author);
		this.price = price;
		this.discount = discount;
	}
	
	/* 설정자(setter) 메소드 */
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	
	/* 접근자(getter) 메소드 */
	public String getTitle() {
		return title;
	}
	
	public String getPublisher() {
		return publisher;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public int getPrice() {
		return price;
	}
	
	public double gerDiscount() {
		return discount;
	}
	
	public void printInformation() {	// return값이 없기 때문에 여기에 syso 작성
		System.out.println(this.title +", " + this.publisher + ", " + this.author + ", " + this.price + ", " + this.discount);
	}
	
}
