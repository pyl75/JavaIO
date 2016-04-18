package com.huida.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileOutputStreamDemo {

	
	public static void main(String[] args) {
		
		try {
			FileOutputStream fos = new FileOutputStream("byte.txt");
			//字符流先写在流里，flush()  字节流直接操作文件
			fos.write("hsdfsdfsdf".getBytes());
			//fos.write(12);
			
			fos.flush();
			fos.close();
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
