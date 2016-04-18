package com.huida.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class PicCopyTest {

	
	public static void main(String[] args) throws Exception {
		
		//建源
		FileInputStream fis = new FileInputStream("d:\\1.jpg");
		BufferedInputStream bis = new BufferedInputStream(fis);
		//目的地
		
		FileOutputStream fos = new FileOutputStream("e:\\meinv.jpg");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		int ch = 0;
		while((ch=bis.read())!=-1){
			bos.write(ch);
			//不管字符流和字节流，最好在写的过程序一定加上flush();以防万一
			bos.flush();
		}
		
		fis.close();
		bis.close();
		fos.close();
		bos.close();
	
		

	}

}
