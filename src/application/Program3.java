package application;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import entities.UsersTest;

public class Program3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<UsersTest> lista = new ArrayList<>();
		UsersTest test = new UsersTest();

		System.out.println("Quantos usuarios irá inserir");
		int rep = sc.nextInt();
		test.sair("sair");
		System.out.println(test.getSair());
		try {
			for (int a = 0; a < rep; a++) {

			}
		} catch (InputMismatchException e) {
			System.out.println(e.getMessage());
		}
	}
}
