package edu.kh.control.condition;

import java.util.Scanner;


public class Homework {

	Scanner sc = new Scanner(System.in);
	
	
	public void ex5() {
		
		System.out.print("나이: ");
		int age = sc.nextInt();
		
		if (age <= 13) {
			System.out.print("어린이 입니다.");
		} else if (age > 13 && age <= 19) {
			System.out.print("청소년 입니다.");
		} else {
			System.out.print("성인 입니다.");
		}
		
	}
	
	
	public void ex6() {
		
		System.out.print("점수 : ");
		int score = sc.nextInt();
		
		if (score >= 90 && score <=100) {
			System.out.print("A");
		} else if (score >= 80 && score < 90) {
			System.out.print("B");
		} else if (score >= 70 && score < 80) {
			System.out.print("C");
		} else if (score >= 60 && score < 70) {
			System.out.print("D");
		} else if (score < 60 ) {
			System.out.print("F");
		}	else {
			System.out.print("잘못 입력하셨습니다");
		}
		
	}
	
	
	public void ex7() {
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		System.out.print("키 : ");
		double height = sc.nextDouble();
		
		if (age < 0 || age > 100) {
			System.out.print("잘못 입력 하셨습니다.");
		} else if (age >= 12 && height >= 140.0) {
			System.out.print("탑승 가능");
		} else if (age >= 0 && age < 12) {
			System.out.print("적정 연령이 아닙니다.");
		} else if (height < 140.0) {
			System.out.print("적정 키가 아닙니다.");
		}
		
	}
	
	
	public void ex8() {

		boolean unsuitable = false;
		
		System.out.print("나이: ");
		int age = sc.nextInt();

		if (age < 0 || age > 100) {
			System.out.println("나이를 잘못 입력하셨습니다.");
			unsuitable = true;
		}
		
		if (unsuitable) {
			System.exit(0);
		}
		System.out.print("키: ");
		double height = sc.nextDouble();
		
		if (height < 0 || height > 250.0) {
			System.out.println("키를 잘못 입력하셨습니다.");
			unsuitable = true;
		}
		
		if (unsuitable) {
			System.exit(0);
		}

		if (age >= 12 && height >= 140) {
			System.out.println("탑승 가능");
		} else if (age >= 12 && height < 140) {
			System.out.println("나이는 적절하나, 키가 적절치 않음");
		} else if (age < 12 && height >= 140) {
			System.out.println("키는 적절하나, 나이가 적절치 않음");
		} else {
			System.out.println("나이와 키 모두 적절치 않음");
		}
	}
}