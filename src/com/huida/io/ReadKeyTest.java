package com.huida.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * 
 * @author Administrator
 * 获取用户键盘录入的数据。
 * 并将用户输入的字母变成大写显示在控制台上。
 * 如果用户输入的是over，结束键盘录入。
 * 思路：
 * 1，因为键盘录入每次只能读取一个字节，要判断是否是over，
 * 需要将读取到的字节拼成字符串。
 * 2，那就需要用一个容器。StringBuilder.
 * 3,在用户回车之前将录入的数据变成字符串判断即可
 * 
 *
 */
public class ReadKeyTest {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		//1,创建一个容器
		StringBuilder sb = new StringBuilder();
		//2,获取键盘读取流
		InputStream is = System.in;
		//3,定义一个变量记录读取的字节，并循环获取kjgkjh\r\n
		int ch=0;//
		while((ch=is.read())!=-1){
			char c = (char)ch;
			if(c=='\r'){
				continue;
			}
			if(c=='\n'){
				String temp = sb.toString();
				if("over".equals(temp)){
					break;
				}
				System.out.println(temp.toUpperCase());
				sb.delete(0, sb.length());
			}else{
				sb.append(c);
			}
			
		}
		

	}

}
