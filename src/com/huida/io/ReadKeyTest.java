package com.huida.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * 
 * @author Administrator
 * ��ȡ�û�����¼������ݡ�
 * �����û��������ĸ��ɴ�д��ʾ�ڿ���̨�ϡ�
 * ����û��������over����������¼�롣
 * ˼·��
 * 1����Ϊ����¼��ÿ��ֻ�ܶ�ȡһ���ֽڣ�Ҫ�ж��Ƿ���over��
 * ��Ҫ����ȡ�����ֽ�ƴ���ַ�����
 * 2���Ǿ���Ҫ��һ��������StringBuilder.
 * 3,���û��س�֮ǰ��¼������ݱ���ַ����жϼ���
 * 
 *
 */
public class ReadKeyTest {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		//1,����һ������
		StringBuilder sb = new StringBuilder();
		//2,��ȡ���̶�ȡ��
		InputStream is = System.in;
		//3,����һ��������¼��ȡ���ֽڣ���ѭ����ȡkjgkjh\r\n
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
