package application;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
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
			try {
			int rep = sc.nextInt();
			System.out.println(test.getSair());
				for (int a = 0; a < rep; a++) {
					System.out.println("Digite o id: ");
					int id = sc.nextInt();
					System.out.println("Digite o nome:");
					String name = sc.next();
					System.out.println("Digite uma observação:");
					String obs = sc.next();
					lista.add(new UsersTest(id, name, obs));
				}
			} catch (InputMismatchException e) {
				System.out.println(e.getMessage());
			}
			System.out.println(lista);
			//System.out.println(lista.get(0).getId());
			escrever(lista);
			System.out.println("Deseja sair do programa? Digite sair ou qualquer letra para continuar");
			test.sair(sc.next().toLowerCase());
		}
	}

	public static void escrever(List<UsersTest> lista) {
		File dir = new File("C:\\Users\\kazuo\\Desktop\\SuperMario");
		File arq = new File(dir, "Mario.txt");
		try {
		
		FileWriter fileWriter = new FileWriter(arq,true);
		PrintWriter printWriter = new PrintWriter(fileWriter);
		for(int i = 0; i<lista.size() ; i++) {
			printWriter.println(lista.get(i).getId());
			printWriter.println(lista.get(i).getName());
			printWriter.println(lista.get(i).getObservacao());
			printWriter.flush();
			printWriter.close();
		}
		
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
}
