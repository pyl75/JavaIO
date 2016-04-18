package com.huida.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		//method_1();
		method_2();
		

	}

	private static void method_2() throws Exception {
		FileInputStream fis = new FileInputStream("nb.txt");
		/**
		 *  int available() 
          	������һ�ζԴ����������õķ������Բ��������شӴ���������ȡ
          	�����������Ĺ���ʣ���ֽ����� 
		 */
		int value = fis.available();
		System.out.println("value="+value);
		byte[] b = new byte[5];
		int len;
		while((len=fis.read(b))!=-1){
			System.out.println(new String(b,0,len));
		}
		
	}

	private static void method_1() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("nb.txt");
		int ch;
		while((ch=fis.read())!=-1){
			char c = (char)ch;
			System.out.println(c);
		}
	}

}
