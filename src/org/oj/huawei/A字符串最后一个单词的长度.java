package org.oj.huawei;
/**
����	

�����ַ������һ�����ʵĳ��ȣ������Կո������
֪ʶ��	�ַ���,ѭ��
����ʱ������	0M
�ڴ�����	0

����	
һ���ַ���������С��128��

���	
����N�����һ�����ʵĳ��ȡ�
��������	hello world
�������	5

ֱ����� 
 */
import java.util.Scanner;

public class A�ַ������һ�����ʵĳ��� {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			String str = in.nextLine();
			int len = 0;
			int i=str.length()-1;
			while(i>=0 && str.charAt(i)==' '){
				i--;
			}
			while(i>=0 && str.charAt(i)!=' '){
				i--;
				len++;
			}
			System.out.println(len);
		}
		in.close();

	}

}
