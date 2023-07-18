package edu.kh.control.practice;

import java.util.Scanner;

public class ConditionPractice {

	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		
		System.out.print("숫자를 한 개 입력하세요 : ");
		int num = sc.nextInt();
		
		if (num > 0 && num % 2 == 0) {
			System.out.print("짝수입니다.");
		} else if (num > 0 && num % 2 != 0) {
			System.out.print("홀수입니다.");
		} else {
			System.out.print("양수만 입력해주세요.");
		}
		
	}
	
	public void practice2() {
		
		System.out.print("국어점수 : ");
		int kor = sc.nextInt();
		System.out.print("수학점수 : ");
		int math = sc.nextInt();
		System.out.print("영어점수 : ");
		int eng = sc.nextInt();
		
		int sum = (kor + math + eng);
		
		if (kor > 40 && math > 40 && eng > 40 && sum / 3 > 60) {
			System.out.print("국어 : " + kor +
					"\n수학 : " + math +
					"\n영어 : " + eng +
					"\n합계 : " + sum + 
					"\n평균 : " + sum / 3 +
					"\n축하합니다, 합격입니다!");
		} else { 
			System.out.print("불합격입니다.");
		}
		
	}
	
	public void practice3() {
		
		System.out.print("1~12 사이의 정수 입력 : ");
		int month = sc.nextInt();
		
		String result;
		
		switch(month) {
		case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12 : result = "월은 31일까지 있습니다."; break;
		case 2 : result = "월은 28일까지 있습니다."; break;
		case 4 : case 6 : case 9 : case 11 : result = "월은 30일까지 있습니다."; break;
		default : result = "월은 잘못 입력된 달입니다.";
		}
		
		System.out.print(month + result);
	}
	
	public void practice4() {
		
		System.out.print("키(m)를 입력해 주세요. : ");
		double h = sc.nextDouble();
		
		System.out.print("몸무게(kg)를 입력해 주세요. : ");
		double kg = sc.nextDouble();
		
		double BMI = kg / (h * h);
		
		System.out.println("BMI 지수 : " + BMI);
		
		if (BMI < 18.5) {
			System.out.print("저체중");
		} else if (BMI >= 18.5 && BMI < 23) {
			System.out.print("정상체중");
		} else if (BMI >= 23 && BMI < 25) {
			System.out.print("과체중");
		} else if (BMI >= 25 && BMI <30) {
			System.out.print("비만");
		} else {
			System.out.print("고도 비만");
		}
		
	}
	
	public void practice5() {
		
		System.out.print("중간 고사 점수 : ");
		double mid = sc.nextDouble();
		
		System.out.print("기말 고사 점수 : ");
		double fin = sc.nextDouble();
		
		System.out.print("과제 점수 : ");
		double assign = sc.nextDouble();
		
		System.out.print("출석 횟수 : ");
		int atten = sc.nextInt();
		
		System.out.println("================= 결과 =================");
		
		double midp = mid * 0.2;
		double finp = fin * 0.3;
		double assignp = assign * 0.3;
		double attendp = atten;
		double sum = midp + finp + assignp + attendp;
		
		if (atten > 20) {
			System.out.print("출석 횟수는 20회를 초과할 수 없습니다.");
		} else if (atten < 15) {
			System.out.print("Fail [출석 횟수 부족 " + "(" + atten + "/20)]");
		} else if (sum < 70 && atten >= 15 && atten <= 20) {
			System.out.println("중간 고사 점수(20): " + midp +
					"\n기말 고사 점수(30): " + finp +
					"\n과제 점수       (30): " + assignp +
					"\n출석 점수       (20): " + attendp +
					"\n총점: " + sum +
					"\nFail [점수 미달]");
		} else if (sum >= 70 && atten >= 15 && atten <= 20) {
			System.out.println("중간 고사 점수(20): " + midp +
					"\n기말 고사 점수(30): " + finp +
					"\n과제 점수       (30): " + assignp +
					"\n출석 점수       (20): " + attendp +
					"\n총점: " + sum +
					"\nPASS");
		}
	}
	
}
