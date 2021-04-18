package application;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Program {
//TERMINAR ESSE CODIGO HOJE !!!!!
	public static void main(String[] args) {
		File file = new File("C:\\teste\\in.txt");
		Scanner sc = null;
		List<String> texto = new ArrayList<>();
		String textoVetor[];
		textoVetor =new String[5];
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				texto.add(sc.nextLine());
			}
			textoVetor = new String[texto.size()];
			//Daqui pra baixo ficou foda
			for(int i = 0;i<textoVetor.length;i++) {
				textoVetor[i] = texto.get(i);
			}
			System.out.println("ARRAY LIST");
			
			JOptionPane.showMessageDialog(null, texto);

			System.out.println("VETORES");
			
			JOptionPane.showMessageDialog(null, textoVetor);

		} catch (IOException e) {
			System.out.println("ERROR");
		}

	}
}
