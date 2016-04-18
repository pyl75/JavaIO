package com.huida.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class BufferedReaderDemo {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		/**
		 * BufferedReader(Reader in) 
          	����һ��ʹ��Ĭ�ϴ�С���뻺�����Ļ����ַ���������
		 */
		FileReader fr = new FileReader("abc.txt");
		BufferedReader br = new BufferedReader(fr);
		
		//��һ�ַ��� 
		
		/*int ch=0;
		while ((ch=br.read())!=-1) {
			System.out.println((char)(ch));
			
		}*/
		
		//�ڶ��ַ��� 
		/*int len;
		char[] buffer = new char[5];
		while((len = br.read(buffer))!=-1){
			
			System.out.println(new String(buffer,0,len));
		}*/
		
		/**
		 * String readLine() 
          	��ȡһ���ı��С� 
		 */
		//System.out.println(br.readLine());
		//System.out.println(br.readLine());
		//System.out.println(br.readLine());
		//System.out.println(br.readLine());
		
		
		String str;
		while((str = br.readLine())!=null){
			
			System.out.println(str);
		}
	}

}
