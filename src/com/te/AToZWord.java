package com.te;

import java.util.Scanner;

public class AToZWord {
	public static void main(String[] args) {
		System.out.println("Enter Your Name...");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		name = name.toUpperCase();
		for (int i = 1; i <= 5; i++) {
			for (int j = 0; j < name.length();  j++) {
				int index = name.charAt(j) - 64;
				if (index == 1)
					wordA(i);
				else if (index == 2)
					wordB(i);
				else if (index == 3)
					wordC(i);
				else if (index == 4)
					wordD(i);
				else if (index == 5)
					wordE(i);
				else if (index == 6)
					wordF(i);
				else if (index == 7)
					wordG(i);
				else if (index == 8)
					wordH(i);
				else if (index == 9)
					wordI(i);
				else if (index == 10)
					wordJ(i);
				else if (index == 11)
					wordK(i);
				else if (index == 12)
					wordL(i);
				else if (index == 13)
					wordM(i);
				else if (index == 14)
					wordN(i);
				else if (index == 15)
					wordO(i);
				else if (index == 16)
					wordP(i);
				else if (index == 17)
					wordQ(i);
				else if (index == 18)
					wordR(i);
				else if (index == 19)
					wordS(i);
				else if (index == 20)
					wordT(i);
				else if (index == 21)
					wordU(i);
				else if (index == 22)
					wordV(i);
				else if (index == 23)
					wordW(i);
				else if (index == 24)
					wordX(i);
				else if (index == 25)
					wordY(i);
				else if (index == 26)
					wordZ(i);
				else if (index == -32)
					wordSpace();
				oneSpace();
			}
			System.out.println();
		}
		scanner.close();
	}

	private static void oneSpace() {
		for (int i = 1; i <= 1; i++) {
			System.out.print(" ");
		}
	}

	private static void wordSpace() {
		for (int i = 1; i <= 3; i++) {
			System.out.print("  ");
		}
	}

	private static void wordA(int i) {
		for (int j = 1; j <= 5; j++) {
			if ((j == 1 || j == 5) && i>2 || i==3 || i+j==5-1||(i==2 && j==4))
				System.out.print(" *");
			else
				System.out.print("  ");
		}
	}

	private static void wordB(int i) {
		for (int j = 1; j <= 5; j++) {
			if (j == 1 || (i == 1 && j < 5) || (i == 5 && j < 5) || (i == (5 + 1) / 2 && j < 5)
					|| (j == 5 && i % 2 == 0))
				System.out.print(" *");
			else
				System.out.print("  ");
		}
	}

	private static void wordC(int i) {
		for (int j = 1; j <= 5; j++) {
			if ((j == 1 && i != 1 && i != 5) || (i == 1 && j != 1 && j < 5) || (i == 5 && j != 1 && j < 5))
				System.out.print(" *");
			else
				System.out.print("  ");
		}
	}

	private static void wordD(int i) {
		for (int j = 1; j <= 5; j++) {
			if (j == 1 || (i == 1 && j < 5) || (i == 5 && j < 5) || (j == 5 && i != 1 && i != 5))
				System.out.print(" *");
			else
				System.out.print("  ");
		}
	}

	private static void wordE(int i) {
		for (int j = 1; j <= 5; j++) {
			if (j == 1 || i == 1 || i == 5 || (i == 3 && j < 5))
				System.out.print(" *");
			else
				System.out.print("  ");
		}
	}

	private static void wordF(int i) {
		for (int j = 1; j <= 5; j++) {
			if (j == 1 || i == 1 || (i == 3 && j < 5))
				System.out.print(" *");
			else
				System.out.print("  ");
		}
	}

	private static void wordG(int i) {
		for (int j = 1; j <= 5; j++) {
			if ((j == 1 && i != 1 && i != 5) || (i == 1 && j != 1 && j < 5) || (i == 5 && j != 1 && j < 5)
					|| (j == 5 && i != 5 / 2) || (i == 1 + 5 / 2 && j > 2))
				System.out.print(" *");
			else
				System.out.print("  ");
		}
	}

	private static void wordH(int i) {
		for (int j = 1; j <= 5; j++) {
			if (j == 1 || j == 5 || i == 1 + 5 / 2)
				System.out.print(" *");
			else
				System.out.print("  ");
		}
	}

	private static void wordI(int i) {
		for (int j = 1; j <= 5; j++) {
			if (i == 1 || i == 5 || j == 1 + 5 / 2)
				System.out.print(" *");
			else
				System.out.print("  ");
		}
	}

	private static void wordJ(int i) {
		for (int j = 1; j <= 5; j++) {
			if (i == 1 || (j == 1 && i != 5 && i != 2) || (i == 5 && j == 2) || (j == 1 + 5 / 2 && i < 5))
				System.out.print(" *");
			else
				System.out.print("  ");
		}
	}

	private static void wordK(int i) {
		for (int j = 1; j <= 5; j++) {
			if (j == 1 || (i >= 3 && i == j) || i + j == 6)
				System.out.print(" *");
			else
				System.out.print("  ");
		}
	}

	private static void wordL(int i) {
		for (int j = 1; j <= 5; j++) {
			if (j == 1 || i == 5)
				System.out.print(" *");
			else
				System.out.print("  ");
		}
	}

	private static void wordM(int i) {
		for (int j = 1; j <= 5; j++) {
			if (j == 1 || (i == j && i <= 3) || j == 5 || (j + i == 5 + 1 && j >= 3))
				System.out.print(" *");
			else
				System.out.print("  ");
		}
	}

	private static void wordN(int i) {
		for (int j = 1; j <= 5; j++) {
			if (j == 1 || i == j || j == 5)
				System.out.print(" *");
			else
				System.out.print("  ");
		}
	}

	private static void wordO(int i) {
		for (int j = 1; j <= 5; j++) {
			if ((j == 1 && i != 1 && i != 5) || (i == 1 && j != 1 && j < 5) || (i == 5 && j != 1 && j < 5)
					|| (j == 5 && (i % 2 == 0 || i == 1 + 5 / 2)))
				System.out.print(" *");
			else
				System.out.print("  ");
		}
	}

	private static void wordP(int i) {
		for (int j = 1; j <= 5; j++) {
			if (j == 1 || (i == 1 && j < 5) || (i == 3 && j < 5) || (j == 5 && i % 2 == 0 && i < 3))
				System.out.print(" *");
			else
				System.out.print("  ");
		}
	}

	private static void wordQ(int i) {
		for (int j = 1; j <= 5; j++) {
			if ((j == 1 && i != 1 && i != 5) || (i == 1 && j != 1 && j < 5) || (i == 5 && j != 1 && j < 5)
					|| (j == 5 && (i % 2 == 0 || i == 1 + 5 / 2)) || (i == j && i >= 3))
				System.out.print(" *");
			else
				System.out.print("  ");
		}
	}

	private static void wordR(int i) {
		for (int j = 1; j <= 5; j++) {
			if (j == 1 || (i == 1 && j < 5) || (i == 3 && j < 5) || (j == 5 && i % 2 == 0 && i < 3)
					|| (i == j && i >= 3))
				System.out.print(" *");
			else
				System.out.print("  ");
		}
	}

	private static void wordS(int i) {
		for (int j = 1; j <= 5; j++) {
			if (i == 1 || i == 5 || i == 1 + 5 / 2 || (j == 1 && i <= 3) || (j == 5 && i >= 3))
				System.out.print(" *");
			else
				System.out.print("  ");
		}
	}

	private static void wordT(int i) {
		for (int j = 1; j <= 5; j++) {
			if (i == 1 || j == 1 + 5 / 2)
				System.out.print(" *");
			else
				System.out.print("  ");
		}
	}

	private static void wordU(int i) {
		for (int j = 1; j <= 5; j++) {
			if ((j == 1 && i != 5) || (j == 5 && i != 5) || (i == 5 && j < 5 && j > 1))
				System.out.print(" *");
			else
				System.out.print("  ");
		}
	}

	private static void wordV(int i) {
		for (int j = 1; j <= 5; j++) {
			if ((j == 1  || j == 5) && i<5-1 || i+j==5+3||(i==4 && j==2))
				System.out.print(" *");
			else
				System.out.print("  ");
		}
	}

	private static void wordW(int i) {
		for (int j = 1; j <= 5; j++) {
			if (j == 1 || (i == j && i >= 3) || j == 5 || (j + i == 5 + 1 && j <= 3))
				System.out.print(" *");
			else
				System.out.print("  ");
		}
	}

	private static void wordX(int i) {
		for (int j = 1; j <= 5; j++) {
			if (j == i || i + j == 5 + 1)
				System.out.print(" *");
			else
				System.out.print("  ");
		}
	}

	private static void wordY(int i) {
		for (int j = 1; j <= 5; j++) {
			if ((i == j || i + j == 5 + 1) && i <= 3 || (j == 3 && i >= 3))
				System.out.print(" *");
			else
				System.out.print("  ");
		}
	}

	private static void wordZ(int i) {
		for (int j = 1; j <= 5; j++) {
			if (i == 1 || i == 5 || i + j == 5 + 1)
				System.out.print(" *");
			else
				System.out.print("  ");
		}
	}
}
