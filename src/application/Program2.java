package application;

import java.io.File;
import java.io.IOException;

public class Program2 {
	public static void main(String[] args){
		File file = new File("C:\\Users\\kazuo\\Desktop\\SuperMario");
		//S� O C: D� ACESSO AO DIRETORIO DESSE PROJETO
		File file1 = new File("C:\\Users\\Todos os Usu�rios\\Desktop");
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
		File arq = new File(file1,"Mario.txt");
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
		
		//LISTAGEM DE ARQUIVOS
		for(File file3: file1.listFiles()) {
			System.out.println(file3);
		}
		
		//System.out.println(existsDir); -> d� true se existir o diretorio
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
