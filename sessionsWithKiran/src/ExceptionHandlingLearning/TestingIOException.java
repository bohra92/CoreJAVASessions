package ExceptionHandlingLearning;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestingIOException {

	public static void main(String[] args) {
		File file = new File("c:\\files\file.txt");
		FileReader fr;
		try {
			fr = new FileReader(file);
			System.out.println(fr.read());
		} catch (IOException e) {
			
			System.out.println(e.getMessage());
		}
		
	}

}
