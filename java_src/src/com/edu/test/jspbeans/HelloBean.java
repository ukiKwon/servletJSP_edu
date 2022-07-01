package com.edu.test.jspbeans;

/*
 * [20220701] JSP beans 규약에 맞는 자바객체 만들기
 */
public class HelloBean {
	private String name; //1.Private 선언
	private String num;

	public HelloBean() { //2. 기본생성자 선언
		this.name = "no name";
		this.num = "no number";
	}
	//3. public 접근자로 
	//4. getter 생성
	//5. setter 생성
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}
	
}
