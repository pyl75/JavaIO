package com.huida.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {

	private static final String LINE_SEPARATOR = System.getProperty("line.separator");

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		/**
		 * 将文本写入字符输出流，缓冲各个字符，从而提供单个字符、数组和字符串的高效写入。 

			可以指定缓冲区的大小，或者接受默认的大小。在大多数情况下，默认值就足够大了。
			
			BufferedWriter(Writer out) 
          	创建一个使用默认大小输出缓冲区的缓冲字符输出流。

		 */
		//1，输出流和文件关联
		FileWriter fw = new FileWriter("abc.txt");
		//2，缓冲区流和输出流关联
		BufferedWriter bw = new BufferedWriter(fw);
		
		//3,写字符
		//CTRL+1提供解决方案的快捷键
		// line.separator=
		bw.write("hahhahahah");
		//第两种换行的方法 
		bw.write(LINE_SEPARATOR+"hehehheh");
		//第三种换行方法 
		/* void newLine() 
         写入一个行分隔符。 */
		bw.newLine();
		bw.write("heiheiehiehieih");
		
		//4刷新
		
		bw.flush();
		
		bw.close();//当缓冲流关闭后，关联的流也被关闭了。
		
		fw.close();
	}

}
