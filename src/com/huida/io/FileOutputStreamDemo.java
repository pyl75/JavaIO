package com.huida.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileOutputStreamDemo {

	
	public static void main(String[] args) {
		
		try {
			FileOutputStream fos = new FileOutputStream("byte.txt");
			//�ַ�����д�����flush()  �ֽ���ֱ�Ӳ����ļ�
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
