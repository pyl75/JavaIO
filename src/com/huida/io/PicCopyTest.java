package com.huida.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class PicCopyTest {

	
	public static void main(String[] args) throws Exception {
		
		//��Դ
		FileInputStream fis = new FileInputStream("d:\\1.jpg");
		BufferedInputStream bis = new BufferedInputStream(fis);
		//Ŀ�ĵ�
		
		FileOutputStream fos = new FileOutputStream("e:\\meinv.jpg");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		int ch = 0;
		while((ch=bis.read())!=-1){
			bos.write(ch);
			//�����ַ������ֽ����������д�Ĺ�����һ������flush();�Է���һ
			bos.flush();
		}
		
		fis.close();
		bis.close();
		fos.close();
		bos.close();
	
		

	}

}
