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
	            	return;
	            }
	        }
	    } else {
	        System.out.print("1 이상의 숫자를 입력해주세요.");
	    }
	}
	
	
	public void practice3() {
		System.out.print("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();
		int sum = 0;
		String equation = "";
		
			for (int i = 1; i <= num; i++) {
				sum += i;
				if (i < num) {
		            equation += i + " + ";
		        } else {
		            equation += i;
		        }
		    }
		    
		    System.out.println(equation + " = " + sum);
	}
	
	
	public void practice4() {
	    System.out.print("첫 번째 숫자: ");
	    int num1 = sc.nextInt();
	    
	    System.out.print("두 번째 숫자: ");
	    int num2 = sc.nextInt();
	    
	    if (num1 < 1 || num2 < 1) {
	        System.out.print("1 이상의 숫자를 입력해주세요.");
	    return;
	    }
	    if (num1 >= num2) {
	    	for (int i = num2; i <= num1; i++) {
	        System.out.print(i + " ");
	    	}
	    }
	    if (num1 < num2) {
	    	for (int i = num1; i <= num2; i++) {
	    	System.out.print(i + " ");
	    	}
	    }
	}
	
	
	public void practice5() {
		
		System.out.print("숫자 : ");
		int dan = sc.nextInt();
		System.out.printf("=====%d단=====\n",dan);
		
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d\n", dan, i, dan * i);
		}
		
	}

}