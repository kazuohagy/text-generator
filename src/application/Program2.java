package application;

import java.io.File;
import java.io.IOException;

public class Program2 {
	public static void main(String[] args){
		File file = new File("C:\\Users\\kazuo\\Desktop\\SuperMario.txt");
		try {
		boolean existsDir = file.exists();
		if(existsDir==false) {
			file.mkdir();
		}
		File arq = new File(file,"Mario.txt");
		boolean existsArq = arq.exists();
		if(existsArq == false) {
			arq.createNewFile();			
		}
		if(existsDir) {
			System.out.println("Diretorio já existe");
			if(existsArq) {
				System.out.println("Arquivo já existe");
			}
		}
		//System.out.println(existsDir); -> dá true se existir o diretorio
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
