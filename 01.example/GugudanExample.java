package example;

import java.util.Scanner;

//키보드로 정수를 입력받아 1~9 범위의 정수를 곱한 결과를 출력하는 프로그램을 작성하세요.
//단, 입력된 정수는 2~9 범위의 정수만 허용하며 범위 밖의 정수를 입력한 경우 재입력
//ex) 단(정수) 입력[2~9] >> 7
//    7 * 1 = 7
//    7 * 2 = 14
//    ...
//    7 * 9 = 63
public class GugudanExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int dan;
		while(true) {
			System.out.print("단(정수) 입력[2~9] >>");
			dan=scanner.nextInt();
			if(dan>=2 && dan<=9) break;
			System.out.println("[에러]입력값은 2~9 범위만 숫자만 입력가능");
		}
		
		for(int i=1; i<=9 ; i++) {
			System.out.println(dan+" * "+i+" = "+(dan * i));
		}
		
		/*
		int input;
		while (true) { // 무한 루프
			System.out.print("입력[2~9] >> ");
			input = scanner.nextInt();
			// 정상적인 정수값이 입력된 경우 반복문 종료
			if (input >= 2 && input <= 9)
				break;
		}

		int dan = input;
		switch (input) {
		case 2:
			for (int i = 1; i <= 9; i++) {
				System.out.println(dan + " * " + i + " = " + (i * dan) + "\t");
			}
			break;
		case 3:
			for (int i = 1; i <= 9; i++) {
				System.out.println(dan + " * " + i + " = " + (i * dan) + "\t");
			}
			break;
		case 4:
			for (int i = 1; i <= 9; i++) {
				System.out.println(dan + " * " + i + " = " + (i * dan) + "\t");
			}
			break;
		case 5:
			for (int i = 1; i <= 9; i++) {
				System.out.println(dan + " * " + i + " = " + (i * dan) + "\t");
			}
			break;
		case 6:
			for (int i = 1; i <= 9; i++) {
				System.out.println(dan + " * " + i + " = " + (i * dan) + "\t");
			}
			break;
		case 7:
			for (int i = 1; i <= 9; i++) {
				System.out.println(dan + " * " + i + " = " + (i * dan) + "\t");
			}
			break;
		case 8:
			for (int i = 1; i <= 9; i++) {
				System.out.println(dan + " * " + i + " = " + (i * dan) + "\t");
			}
			break;
		case 9:
			for (int i = 1; i <= 9; i++) {
				System.out.println(dan + " * " + i + " = " + (i * dan) + "\t");
			}
			break;
		}
		*/

		scanner.close();
	}

}
