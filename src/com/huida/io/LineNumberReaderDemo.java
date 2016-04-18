package com.huida.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.LineNumberReader;

public class LineNumberReaderDemo {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("note.txt");
		
		LineNumberReader lnr = new LineNumberReader(fr);
		/*
		 *  int getLineNumber() 
          	获得当前行号。 
		 */
		String str;
		while((str=lnr.readLine())!=null){
			System.out.println(lnr.getLineNumber()+":"+str);
		}
		lnr.close();
		fr.close();

	}

}
