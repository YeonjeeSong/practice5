package com.greedy.level02.normal.book.run;

import com.greedy.level02.normal.book.model.dto.BookDTO;

public class Application {

	public static void main(String[] args) {
		
		/* 기본 생성자로 인스턴스 생성 */
		BookDTO book1 = new BookDTO();
		book1.printInformation();
		
		/* 필드 3가지를 초기화하는 생성자 이용해 인스턴스 생성 */
		BookDTO book2 = new BookDTO("자바의 정석", "도우 출판", "남궁성");
		book2.printInformation();
		
//		book2.setTitle("자바의 정석");
//		book2.setPublisher("도우출판");
//		book2.setAuthor("남궁성");
//		book2.setPrice(0);
//		book2.setDiscount(0.0);
//		
//		book2.printInformation();
		
		/* 모든 필드를 초기화 하는 생성자 이용해 인스턴스 생성 */
		BookDTO book3 = new BookDTO("홍길동전", "활빈당", "허균", 5000000, 0.5);
		book3.printInformation();
		
//		book3.setTitle("홍길동전");
//		book3.setPublisher("활빈당");
//		book3.setAuthor("허균");
//		book3.setPrice(5000000);
//		book3.setDiscount(0.5);
//		
//		book3.printInformation();
		
	}

}
