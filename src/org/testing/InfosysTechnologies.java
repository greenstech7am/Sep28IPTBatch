package org.testing;

import java.io.File;
import java.io.IOException;

public class InfosysTechnologies {

	public static void main(String[] args) throws IOException {
		
		// pull the files in string of specific location
		File f = new File("D:\\GreensTech\\Testing\\Java\\Inheritance.txt");
		
		boolean a = f.canWrite();
		
		System.out.println(a);
		
	
	
		
		
	}

}
