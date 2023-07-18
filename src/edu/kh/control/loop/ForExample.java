package edu.kh.control.loop;

import java.util.Scanner;

public class ForExample {
	Scanner sc = new Scanner(System.in);
	/* for문
	 * - 끝이 정해져 있는(횟수가 지정되어 있는) 반복문
	 * 
	 * [작성법]
	 * 
	 * for(초기식; 조건식; 증감식) {
	 * 		반복 수행할 코드
	 * }
	 * 
	 * - 초기식 : for문을 제어하는 용도의 변수 선언
	 * 
	 * - 조건식 : for문의 반복 여부를 지정하는 식
	 * 			  보통 초기식에 사용된 변수를 이용하여 조건식을 작성함
	 * 
	 * - 증감식 : 초기식에 사용된 변수를
	 * 			  for문이 끝날 때 마다 증가 또는 감소시켜 
	 * 			  조건식의 결과를 변하게 하는 식
	 */
	
	public void ex1() {
		// for 문 기초 사용법 1
		// 1~10 출력하기
		// 1부터 10까지 1씩 증가하며 출력
		
		for (int i = 1; i <= 10; i++ ) {
			 //초기식  //조건식 //증감식
			
			 // 반복 수행할 코드
			System.out.println(i);
		}
		
	}
	
	
	public void ex2() {
		// 3에서 7까지 1씩 증가하며 출력
		// 3 4 5 6 7
		
		for (int i = 3; i <= 7 ; i++) {
			System.out.println(i);
		}
		
	}
	
	
	public void ex3() {
		// 2부터 15까지 1씩 증가하며 출력
		
		for (int i = 2; i <= 15; i++) {
			System.out.println(i);
		}
		
	}
	
	
	public void ex4() {
		// 1부터 입력받은 수까지 1씩 증가하며 출력
		
		System.out.print("입력 번호 : ");
		int x = sc.nextInt();
		
		for (int i = 1; i <= x; i++) {
			System.out.println(i);
		}
		
	}
	
	
	public void ex5() {
		// 1부터 입력받은 수까지 2씩 증가하며 출력
		System.out.print("입력 번호 : ");
		int x = sc.nextInt();
		
		for (int i = 1; i <= x; i += 2 ) {
			System.out.println(i);
		}
	}
	
	
	public void ex6() {
		// 1.0 부터 입력받은 실수까지 0.5씩 증가하며 출력
		
		System.out.print("입력 번호 : ");
		double x = sc.nextDouble();
		
		for (double i = 1.0; i <= x; i += 0.5) {
			System.out.println(i);
		}
		
	}
	
	
	public void ex7() {
		// 영어 알파벳 A 부터 Z 까지 한줄로 출력
		// ABC...Z
		
		// * char 자료형은 문자형이지만 실제로 정수(문자표 번호)를 저장한다.
		
		for(int i = 'A'; i <= 'Z'; i++) {
			System.out.print((char)i); // 강제형변환
		}
		System.out.println("\n----------------------------");
		
		for(char i = 'A'; i <= 'Z'; i++) {
			System.out.print(i);
		}
		
	}
	
	
	public void ex8() {
		for(int i = 10; i >= 1; i--) {
			System.out.println(i);
		}
		
		
	}
	
	
	public void ex9() {
		
		// for문 응용 1 : 반복문을 이용한 값의 누적
		
		// 1부터 10까지 모든 정수의 합 구하기
		
		int sum = 0; // 반복되어 증가되는 i값의 합계를 저장할 변수
					 // 0으로 시작하는 이유 : 아무것도 더하지 않음으로
					 // 정확히 결과를 도출할 수 있기 때문
		
		for(int i = 1; i <= 10; i++) {
			
			//sum = sum+i;
			sum += i;
		}
		System.out.println(sum);
	}
	
	
	public void ex10() {
		// for문 응용 2 : 정수 5개를 입력 받아서 합계 구하기
		
		// ex)
		// 입력 1 : 10
		// 입력 2 : 20
		// 입력 3 : 30
		// 입력 4 : 40
		// 입력 5 : 50
		// 합계 : 150
		
		int sum = 0;
		
		for (int i = 1; i <= 5; i++) {
			System.out.printf("입력 " + i + " : ");
			int input = sc.nextInt();
			sum += input; // sum에 입력받은 input값 누적
		}
		
		System.out.print("합계 : " + sum);
		
	}
	
	
	public void ex11() {
		// 정수를 몇 번 입력 받을지 먼저 입력 받고
		// 입력된 정수의 합계를 출력
		
		// ex)
		// 입력 받을 정수의 개수 : 3
		// 입력 1 : 10
		// 입력 2 : 20
		// 입력 3 : 30
		// 합계 : 60
		
		// ex)
		// 입력 받을 정수의 개수 : 2
		// 입력 1 : 10
		// 입력 2 : 20
		// 합계 : 30
		
		System.out.print("입력 받을 정수의 개수 : ");
		int num = sc.nextInt();
		
		int sum = 0;
		
		for (int i = 1; i <= num; i++) {
			System.out.print("입력 " + i + " : ");
			int input = sc.nextInt();
			
			sum += input;
		}
		
		System.out.print("합계 : " + sum);

	}
	
	
	public void ex12() {
		// 1부터 20까지 1씩 증가하면서 출력
		// 단, 5의 배수 () 를 붙여서 출력
		// ex) 1 2 3 4 (5) 6 7 8 9 (10) ... (20)
		
		for(int i = 1; i <= 20; i++) {
			if (i % 5 == 0) {	
			   	System.out.print("(" + i + ") ");
			} 	else {
				System.out.print(i + " ");
			}
		}
	}
	
	
	public void ex13() {
		// 1부터 20까지 1씩 증가하면서 출력
		// 단, 입력 받은 수의 배수는 () 표시
		
		// ex)
		// 괄호를 표시할 배수 : 3
		// 1 3 (3) 4 5 (6)..
		System.out.print("괄호를 표시할 배수 : ");
		int num = sc.nextInt();
		
		for (int i = 1; i <= 20; i++) {
			if (i % num ==0) {
				System.out.print("(" + i + ") ");
			}	else {
				System.out.print(i + " ");
			}
		}
		
	}
	
	
	public void ex14() {
		
		// [구구단 출력]
		// 2 ~ 9 사이 수를 하나 입력받아
		// 해당 단을 출력
		// 단, 입력받은 수가 2 ~ 9 사이 숫자가 아니면 "잘못 입력 하셨습니다" 출력
		
		System.out.print("단 입력 : ");
		int dan = sc.nextInt();
		
		if (dan >= 2 && dan <= 9) { // dan이 2~9 사이
			
			for (int i = 1; i <= 9; i++) {
				System.out.printf("%d X %d = %d\n", dan, i, dan * i);
			}
		} else {
			System.out.println("잘못 입력 하셨습니다");
		}
		
	}
	
	
	public void ex15() {
		// [19단 출력기]
		// 2 ~ 19단 사이 단을 입력 받아서 x 1 ~ x 19까지 출력
		// 단, 2 ~ 19 사이 단이 입력되지 않으면 "잘못 입력 하셨습니다" 출력 
		
		System.out.print("단 입력 : ");
		int dan = sc.nextInt();
		
		if (dan >=2 && dan <= 19) {
		for (int i = 1; i <= 19; i++) {
			System.out.printf("%d X %d = %d\n", dan, i, dan * i);
			} 
		} else {
			System.out.print("잘못 입력 하셨습니다");
		}
	}
	
}