package com.huida.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class BufferedTest {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		
		//method_1();
		method_2();

	}
//ctrl+shift+f对代码进行格式化
	private static void method_2() throws Exception {
		// 源
		FileReader fr = new FileReader("abc.txt");
		BufferedReader br = new BufferedReader(fr);
		// 目的地
		FileWriter fw = new FileWriter("nx.txt");
		BufferedWriter bmw = new BufferedWriter(fw);
		
		String str;
		//readLine();最后没有读取换行符，读取这一行的内容
		while((str=br.readLine())!=null){
			bmw.write(str);
			bmw.newLine();
		}
		br.close();
		bmw.close();

	}

	private static void method_1() throws Exception {
		//源
		FileReader fr = new FileReader("abc.txt");
		BufferedReader br = new BufferedReader(fr);
		//目的地
		FileWriter fw = new FileWriter("nb.txt");
		BufferedWriter bmw = new BufferedWriter(fw);
		
		int ch;
		while((ch=br.read())!=-1){
			bmw.write(ch);
			bmw.flush();
			
		}
		
		br.close();
		bmw.close();
		
		
		
		
		
		
		
		
	}

}
