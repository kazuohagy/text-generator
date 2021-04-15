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
		while (!test.getSair()) {
			System.out.println("Quantos usuarios irá inserir");
			int rep = sc.nextInt();
			System.out.println(test.getSair());
			try {
				for (int a = 0; a < rep; a++) {
					System.out.println("Digite o id: ");
					int id = sc.nextInt();
					System.out.println("Digite o nome:");
					String name = sc.next();
					System.out.println("Digite uma observação:");
					String obs= sc.next();
					lista.add(new UsersTest(id,name,obs));
				}
			} catch (InputMismatchException e) {
				System.out.println(e.getMessage());
			}
			
			System.out.println(lista.get(0));
			System.out.println("Deseja sair do programa? Digite sair ou qualquer letra para continuar");
			test.sair(sc.next().toLowerCase());
		}
	}

}
