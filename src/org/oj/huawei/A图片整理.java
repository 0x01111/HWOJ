package org.oj.huawei;

import java.util.Arrays;
import java.util.Scanner;

/**
ͼƬ����
Lily�Ͽ�ʱʹ����ĸ����ͼƬ��С������ѧϰӢ�ﵥ�ʣ�ÿ�ζ���Ҫ����ЩͼƬ���մ�С��ASCII��ֵ��С���������պá����Ҹ�Lily��æ��ͨ��C���Խ����
 


��������:

Lilyʹ�õ�ͼƬ����"A"��"Z"��"a"��"z"��"0"��"9"��������ĸ�����ָ���������1024��


�������:

Lily������ͼƬ���մ�С�����˳�����

��������:

Ihave1nose2hands10fingers

�������:

0112Iaadeeefghhinnnorsssv

 * @author Administrator
 *
 */
public class AͼƬ���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String str = sc.nextLine();
            char[] cs = str.toCharArray();
            Arrays.sort(cs);
            System.out.println(cs);
        }
        sc.close();
	}

}
