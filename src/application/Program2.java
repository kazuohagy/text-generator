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
		else {
			System.out.println("Diretorio j� existe");
		}
		File arq = new File(file,"Mario.txt");
		boolean existsArq = arq.exists();
		if(existsArq == false) {
			arq.createNewFile();			
		}
		else {
			System.out.println("Arquivo j� existe");
		}
		
		//System.out.println(existsDir); -> d� true se existir o diretorio
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
