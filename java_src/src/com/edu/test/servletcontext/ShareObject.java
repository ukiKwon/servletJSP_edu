package com.edu.test.servletcontext;

//POJO : 평범한 자바 객체를 의미함
//아무도 상속받지 않는 클래스
public class ShareObject {
	private int count = 0;
	private String str = "";

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}
}
