package application;

import java.io.File;
import java.io.IOException;

public class Program2 {
	public static void main(String[] args){
		File file = new File("C:\\Users\\kazuo\\Desktop\\SuperMario");
		try {
		//VER SE DIRETORIO EXISTE 
		boolean existsDir = file.exists();
		//SE NÃO EXISTIR CRIAR DIRETORIO
		if(existsDir==false) {
			file.mkdir();
			System.out.println("Diretorio criado");
		}
		else {
			System.out.println("Diretorio já existe");
		}
		File arq = new File(file,"Mario.txt");
		//VER SE ARQUIVO EXISTE
		boolean existsArq = arq.exists();
		//SE NÃO EXISTIR CRIAR ARQUIVO
		if(existsArq == false) {
			arq.createNewFile();	
			System.out.println("Arquivo criado");
		}
		else {
			System.out.println("Arquivo já existe");
		}
		
		//System.out.println(existsDir); -> dá true se existir o diretorio
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
