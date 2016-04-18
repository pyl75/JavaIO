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
//ctrl+shift+f�Դ�����и�ʽ��
	private static void method_2() throws Exception {
		// Դ
		FileReader fr = new FileReader("abc.txt");
		BufferedReader br = new BufferedReader(fr);
		// Ŀ�ĵ�
		FileWriter fw = new FileWriter("nx.txt");
		BufferedWriter bmw = new BufferedWriter(fw);
		
		String str;
		//readLine();���û�ж�ȡ���з�����ȡ��һ�е�����
		while((str=br.readLine())!=null){
			bmw.write(str);
			bmw.newLine();
		}
		br.close();
		bmw.close();

	}

	private static void method_1() throws Exception {
		//Դ
		FileReader fr = new FileReader("abc.txt");
		BufferedReader br = new BufferedReader(fr);
		//Ŀ�ĵ�
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
