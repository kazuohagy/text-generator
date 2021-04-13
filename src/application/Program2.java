package application;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Program2 {
	public static void main(String[] args){
		File file = new File("C:\\Users\\kazuo\\Desktop\\SuperMario");
		//S� O C: D� ACESSO AO DIRETORIO DESSE PROJETO
		//File file1 = new File("C:\\Users");
		try {
		//VER SE DIRETORIO EXISTE 
		boolean existsDir = file.exists();
		//SE N�O EXISTIR CRIAR DIRETORIO
		if(existsDir==false) {
			file.mkdir();
			System.out.println("Diretorio criado");
		}
		else {
			System.out.println("Diretorio j� existe");
		}
		
		//VER SE ARQUIVO EXISTE
		File arq = new File(file,"Mario.txt");
		boolean existsArq = arq.exists();
		//SE N�O EXISTIR CRIAR ARQUIVO
		if(existsArq == false) {
			arq.createNewFile();	
			System.out.println("Arquivo criado");
		}
		else {
			//APAGAR O ARQUIVO E O METODO ABAIXO
			//arq.delete();
			System.out.println("Arquivo j� existe");
		}
		System.out.println();
		System.out.println("pastas do diretorio Super Mario");

		//TROCANDO NOME DO DIRETORIO
		File arq2 =  new File(file,"Bowser.txt");
		boolean status = arq.renameTo(arq2);
		System.out.println("Status: " + status +" New name :" + arq);
		//LISTAGEM DE ARQUIVOS
		for(File file3: file.listFiles()) {
			System.out.println(file3 );
		}
		//System.out.println(existsDir); -> d� true se existir o diretorio
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		for(File f : file.listFiles()) {
			if(file.isDirectory()) {
				System.out.println(f + " � um diretorio");
				if(file.isFile()) {
					System.out.println(f.getName()+ " � um arquivo");
				} 
			}
			
				 
		}
		System.out.println("Acabou!!!");
	}
}
