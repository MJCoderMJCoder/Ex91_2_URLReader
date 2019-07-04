package com.urlreader;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class Ex91_2_URLReader {
	public static void main(String[] args) throws Exception { //����main�����׳���������
		URL urlSina = new URL("http://www.sina.com.cn/"); //����һ��url����
		
		//ʹ��openStream�õ�һ���������ɴ˹���һ��BufferedReader����
		BufferedReader in = new BufferedReader(new InputStreamReader(urlSina.openStream()));
		String inputLine;
		while ((inputLine = in.readLine()) != null) //�����������ϵĶ����ݣ�ֱ������Ϊֹ
			System.out.println(inputLine); //�Ѷ�������ݴ�ӡ����Ļ��
		in.close(); //�ر�������
	}
}
