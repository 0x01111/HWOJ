package org.oj.huawei;
/**
�ҳ��ַ����е�һ��ֻ����һ�ε��ַ�
�ҳ��ַ����е�һ��ֻ����һ�ε��ַ�
��ϸ������
�ӿ�˵��
ԭ�ͣ�
bool FindChar(char* pInputString, char* pChar);
���������
char* pInputString���ַ���
���������ָ��ָ����ڴ�����֤��Ч����
char* pChar����һ��ֻ����һ�ε��ַ�
����޴��ַ� �����'.'
 
 
 

��������:

����һ���ַ�


�������:

���һ���ַ�

��������:

asdfasdfo

�������:

o

 */
import java.util.Scanner;

public class A��һ��ֻ����һ�ε��ַ� {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char[] chars;
		char first;
		while(in.hasNext()){
			chars = in.nextLine().toCharArray();
			first =findChar(chars);
			System.out.println(first);
		}
		in.close();
	}
	private static char findChar(char[] chars){
		int[] A = new int[256];
		// ��¼����
		for(int i=0;i<chars.length;i++){
			char ch = chars[i];
			A[ch]++;
		}
		// �����ַ���˳���ҵ�֮���ֵ�һ�ε��ַ�
		for(int i=0;i<chars.length;i++){
			char ch = chars[i];
			if(A[ch]==1){
				return ch;
			}
		}
		return '.';
	}

}
