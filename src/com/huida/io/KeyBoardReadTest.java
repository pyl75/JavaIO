package com.huida.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * 从键盘敲一个字符，然后打印在控制台上。
 * 键盘本身就是一个标准的输入设备
 * 在java里，对于这种输入设备都有它相对应的对象。
 * @author Administrator
 *
 */
public class KeyBoardReadTest {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		
		//method_1();
		//method_2();
		method_3();
		

	}

	private static void method_3() throws Exception {
		InputStream is = System.in;
		int ch=0;
		while((ch=is.read())!=-1){
			System.out.println(ch);
		}
		
	}

	private static void method_2() throws Exception {
		InputStream is = System.in;
		int ch = is.read();
		int ch1 = is.read();
		int ch2 = is.read();
		System.out.println(ch);
		System.out.println(ch1);
		System.out.println(ch2);
		//回车键   '\r\n'
		
	}

	private static void method_1() throws IOException {
		InputStream is = System.in;
		int ch = is.read();//阻塞式方法 如果没有内容，停 这不动  等待录入
		System.out.println(ch);
		int ch1 = is.read();
		int ch2 = is.read();
		int ch3 = is.read();
		int ch4 = is.read();
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(ch3);
		System.out.println(ch4);
	}

}
