package program;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] vect = new int[n];

		for (int i = 0; i < vect.length; i++) {
			vect[i] = sc.nextInt();
		}

		int aux = 0;

		for (int i = 0; i < vect.length; i++) {
			for (int j = 0; j < vect.length; j++) {
				if (vect[i] < vect[j]) {
					aux = vect[i];
					vect[i] = vect[j];
					vect[j] = aux;
				}
			}
		}

		for (int i = 0; i < vect.length; i++) {
			System.out.print(vect[i]+"|");
		}
		sc.close();
	}
}
