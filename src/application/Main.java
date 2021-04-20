package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		File dir = new File("C:\\teste");
		File arq = new File(dir, "source.txt");
		// Scanner sc ;
		try {
			if (!dir.exists()) {
				System.out.println("Diretorio" + dir);
				dir.mkdir();
			}
			if (!arq.exists()) {
				System.out.println("Arquivo criado: " + arq);
				arq.createNewFile();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(lerPrimeiro(arq));
		if (!lerPrimeiro(arq)) {
			first(arq);
		}

		// sc = new Scanner(arq);
		// System.out.println(sc.nextLine()); é a mesma coisa do readline == sc.nextLine
		// os dois imprimem a String
		// System.out.println(sc.hasNextLine());
	}

	public static boolean lerPrimeiro(File arq) {
		boolean b = false;
		try {
			FileReader fr = new FileReader(arq);
			BufferedReader br = new BufferedReader(fr);
			b = br.ready();
			// System.out.println(br.readLine()); <- imprime primeiro texto e assim por
			// diante
		} catch (IOException e) {
			e.printStackTrace();
		}
		return b;
	}

	public static void first(File arq) {
		// File fw = new File("C:\\teste\\source.txt");
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(arq))) {
			bw.write("TV LED,1290.99,1\n" + "Video Game Chair,350.50,3\n" + "Iphone X,900.00,2\n"
					+ "Samsung Galaxy 9,850.00,2\n");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
