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
	
	
	public void practice6() {
		
		System.out.print("숫자 : ");
		int dan = sc.nextInt();
		
		if (dan < 2 || dan >9) {
			System.out.print("2~9 사이 숫자만 입력해주세요.");
			return;
		}
			
		System.out.printf("===== %d단 =====\n", dan);
		
		for(int i = 1; i <= 9; i++) {
				System.out.printf("%d X %d = %d\n", dan, i, dan * i);
		}
		
	}
	
	
	public void practice7() {
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	
	public void practice8() {
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for (int i = num; i >= 1; i--) {
			for (int j = i; j >= 1; j--) {
				System.out.print("*");	
			}
			System.out.println();
		}
		
	}
	
	
	public void practice9() {
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for (int i = 1; i <= num; i++) {
			for (int j = num; j >= 1; j--) {
				if (i >= j) {
					System.out.print("*");
				} else {
				System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}
	
	
	public void practice10() {
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        for (int i = num - 1; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
		
	}

	
	public void practice11() {
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for (int i = 0; i < num; i++) {
			for (int j = 1; j < num - i; j++) {
					System.out.print(" ");
			}
			for (int k = 0; k < 2 * i + 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	public void practice12() {
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for (int i = 1; i <= num; i++) {
            System.out.print("*");
        }
        System.out.println();

        for (int i = 1; i <= num - 2; i++) {
            System.out.print("*");
            for (int j = 1; j <= num - 2; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }

        for (int i = 1; i <= num; i++) {
            System.out.print("*");
        }
		
	}
	
	public void practice13() {
		
		System.out.print("자연수 하나를 입력하세요 : ");
		int num = sc.nextInt();
		int count = 0;
		
		for (int i = 1; i <= num; i++) {
			if (i % 2 == 0 || i % 3 == 0) {
			System.out.print( i + " " );
			} 
			if (i % 2 == 0 && i % 3 == 0) {
				count++;
			}
			
		}
		System.out.printf("\n" + "count : %d",count);
	}
	
}