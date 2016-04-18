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
		 * ���ı�д���ַ����������������ַ����Ӷ��ṩ�����ַ���������ַ����ĸ�Чд�롣 

			����ָ���������Ĵ�С�����߽���Ĭ�ϵĴ�С���ڴ��������£�Ĭ��ֵ���㹻���ˡ�
			
			BufferedWriter(Writer out) 
          	����һ��ʹ��Ĭ�ϴ�С����������Ļ����ַ��������

		 */
		//1����������ļ�����
		FileWriter fw = new FileWriter("abc.txt");
		//2���������������������
		BufferedWriter bw = new BufferedWriter(fw);
		
		//3,д�ַ�
		//CTRL+1�ṩ��������Ŀ�ݼ�
		// line.separator=
		bw.write("hahhahahah");
		//�����ֻ��еķ��� 
		bw.write(LINE_SEPARATOR+"hehehheh");
		//�����ֻ��з��� 
		/* void newLine() 
         д��һ���зָ����� */
		bw.newLine();
		bw.write("heiheiehiehieih");
		
		//4ˢ��
		
		bw.flush();
		
		bw.close();//���������رպ󣬹�������Ҳ���ر��ˡ�
		
		fw.close();
	}

}
