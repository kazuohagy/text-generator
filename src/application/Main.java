package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import entities.Product;

public class Main {

	public static void main(String[] args) throws IOException {
		File dir = new File("C:\\teste");
		File arq = new File(dir, "source.txt");
		List<Product> prod = new ArrayList<>();
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
		//System.out.println(lerPrimeiro(arq));
		if (!lerPrimeiro(arq)) {
			first(arq);
		}
		// sc = new Scanner(arq);
		// System.out.println(sc.nextLine()); é a mesma coisa do readline == sc.nextLine
		// os dois imprimem a String
		// System.out.println(sc.hasNextLine());
		
		// -----------COMEÇANDO A FAZER A PARTE DO EXERCICIO----------------
		try(BufferedReader br = new BufferedReader(new FileReader(arq))){
			String linha = br.readLine();
			while(linha != null) {
				String[] vetor = linha.split(",");
				prod.add(new Product(vetor[0],Double.parseDouble(vetor[1]),Integer.parseInt(vetor[2])));
				linha = br.readLine();
			}
		}
		
		File subpasta = new File(dir,"out");
		File backup = new File(subpasta,"summary.txt");
		if(!subpasta.exists()) {
			subpasta.mkdir();
		}
		if(!backup.exists()) {
			backup.createNewFile();
		}
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(backup))){
			for(Product lista : prod) {
				bw.write(lista.getName()+",");
				bw.write(""+ lista.getPrice() * lista.getQuantity());
				bw.newLine();
				
			}
		}
		//System.out.println(prod.get(0).getName()); <- pega o nome de um produto		
		System.out.println("-----------LISTA DOS PRODUTOS------------");
		System.out.println(prod);
		//System.out.println(prod.get(0));<-pega os dados do primeiro produto
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
			bw.write("TV LED,1290.99,1\r\n" + "Video Game Chair,350.50,3\r\n" + "Iphone X,900.00,2\r\n"
					+ "Samsung Galaxy 9,850.00,2\r\n");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
