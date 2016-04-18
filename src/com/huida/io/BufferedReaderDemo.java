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
          	创建一个使用默认大小输入缓冲区的缓冲字符输入流。
		 */
		FileReader fr = new FileReader("abc.txt");
		BufferedReader br = new BufferedReader(fr);
		
		//第一种方法 
		
		/*int ch=0;
		while ((ch=br.read())!=-1) {
			System.out.println((char)(ch));
			
		}*/
		
		//第二种方法 
		/*int len;
		char[] buffer = new char[5];
		while((len = br.read(buffer))!=-1){
			
			System.out.println(new String(buffer,0,len));
		}*/
		
		/**
		 * String readLine() 
          	读取一个文本行。 
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
