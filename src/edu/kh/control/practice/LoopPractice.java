package edu.kh.control.practice;

import java.util.Scanner;

public class LoopPractice {

	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
	    System.out.print("1 이상의 숫자를 입력하세요: ");
	    int num = sc.nextInt();
	    
	    if (num >= 1) {
	        for (int i = 1; i <= num; i++) {
	            System.out.print(i + " ");
	        }
	    } else {
	        System.out.print("1 이상의 숫자를 입력해주세요.");
	    }
	}
	
	
	public void practice2() {
	    System.out.print("1 이상의 숫자를 입력하세요: ");
	    int num = sc.nextInt();
	    
	    if (num >= 1) {
	        for (int i = num; i <= num; i--) {
	            System.out.print(i + " ");
	            if (i == 1) {
	            	break;
	            }
	        }
	    } else {
	        System.out.print("1 이상의 숫자를 입력해주세요.");
	    }
	}
	
	
	public void practice3() {
		System.out.print("정수를 하나 입력하세요 : ");
		int input = sc.nextInt();
		
		if (input >=1) {
			System.out.print();
		}
		
	}
	
	
	
	
}