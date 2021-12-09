package com.javaex.ex04;

public class UserApp {

	public static void main(String[] args) {
		User c1 = new Customer("jws", "j1234", "정우성", 1000);
		User c2 = new Customer("yjs", "y2345", "이효리", 2000);
		User e1 = new Employee("master", "m3344", "운영자", 200000);

		User[] userArr = new User[3];
		
		userArr[0] = c1;
		userArr[1] = c2;
		userArr[2] = e1;
		
		for(int i = 0; i < userArr.length; i++) {
			userArr[i].showInfo();
		}
		
		System.out.println( "운영자의 월급은 "+((Employee)e1).getSalary()+"원 입니다." );
	}

}
