package example;

import java.util.Scanner;

//Ű����� ������ �Է¹޾� 1~9 ������ ������ ���� ����� ����ϴ� ���α׷��� �ۼ��ϼ���.
//��, �Էµ� ������ 2~9 ������ ������ ����ϸ� ���� ���� ������ �Է��� ��� ���Է�
//ex) ��(����) �Է�[2~9] >> 7
//    7 * 1 = 7
//    7 * 2 = 14
//    ...
//    7 * 9 = 63
public class GugudanExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int dan;
		while(true) {
			System.out.print("��(����) �Է�[2~9] >>");
			dan=scanner.nextInt();
			if(dan>=2 && dan<=9) break;
			System.out.println("[����]�Է°��� 2~9 ������ ���ڸ� �Է°���");
		}
		
		for(int i=1; i<=9 ; i++) {
			System.out.println(dan+" * "+i+" = "+(dan * i));
		}
		
		/*
		int input;
		while (true) { // ���� ����
			System.out.print("�Է�[2~9] >> ");
			input = scanner.nextInt();
			// �������� �������� �Էµ� ��� �ݺ��� ����
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
