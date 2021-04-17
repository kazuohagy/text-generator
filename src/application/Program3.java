package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
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
					// sc.nextLine(); é necessário para limpar o Buffer, e permitir inserir os
					// demais dados
					sc.nextLine();
					System.out.println("Digite o nome:");
					String name = sc.nextLine();
					System.out.println("Digite uma observação:");
					String obs = sc.nextLine();
					lista.add(new UsersTest(id, name, obs));
				}
			} catch (InputMismatchException e) {
				System.out.println(e.getMessage());
			}
			System.out.println(lista);
			// System.out.println(lista.get(0).getId());
			escrever(lista);
			System.out.println("Deseja sair do programa? Digite sair ou qualquer letra para continuar");
			test.sair(sc.next().toLowerCase());
		}
	}

	public static void escrever(List<UsersTest> lista) {
		File dir = new File("C:\\Users\\kazuo\\Desktop\\SuperMario");
		File arq = new File(dir, "Mario.txt");
		try {

			FileWriter fileWriter = new FileWriter(arq, true);
			// BufferedWriter bw = new BufferedWriter(fileWriter);
			PrintWriter printWriter = new PrintWriter(fileWriter);
			for (int i = 0; i < lista.size(); i++) {
				printWriter.print(lista.get(i).getId() + ";");
				printWriter.print(lista.get(i).getName() + ";");
				printWriter.println(lista.get(i).getObservacao());
			}
			printWriter.flush();
			printWriter.close();
			/*
			 * bw.write(lista.toString()); bw.newLine(); bw.close();
			 */

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void backup() {

	}

	public static List<UsersTest> ler() {
		File dir = new File("C:\\Users\\kazuo\\Desktop\\SuperMario");
		File arq = new File(dir, "Mario.txt");
		List<UsersTest> lista1 = new ArrayList<>();
		try (BufferedReader br = new BufferedReader(new FileReader(arq))) {
			String lines = br.readLine();
			while (lines != null) {
				String[] vect = lines.split(";");
				Integer id = Integer.parseInt(vect[0]);
				lista1.add(new UsersTest(id,vect[1],vect[2]));
				System.out.println(lines);
				lines = br.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return lista1;
	}
}
