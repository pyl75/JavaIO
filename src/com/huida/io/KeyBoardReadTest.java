package com.huida.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * �Ӽ�����һ���ַ���Ȼ���ӡ�ڿ���̨�ϡ�
 * ���̱������һ����׼�������豸
 * ��java��������������豸���������Ӧ�Ķ���
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
		//�س���   '\r\n'
		
	}

	private static void method_1() throws IOException {
		InputStream is = System.in;
		int ch = is.read();//����ʽ���� ���û�����ݣ�ͣ �ⲻ��  �ȴ�¼��
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
