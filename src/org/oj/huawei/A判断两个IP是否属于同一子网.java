package org.oj.huawei;

import java.util.Scanner;
/**
�ж�����IP�Ƿ�����ͬһ����
���������������ж�������̨�������IP��ַ�Ƿ�����ͬһ������ĸ��ݡ�
����������IP��ַ�ṹ��ͬ����32λ������������������Ų���ȫΪ��1���������Ų���ȫΪ��0��������������������ж���̨�����Ƿ���ͬһ�����С�����̨������IP��ַ�ֱ������ǵ����������ࡰ�롱��Ľ����ͬ����˵������̨������ͬһ�����С�
ʾ����
I P ��ַ�� 192.168.0.1
�������롡 255.255.255.0
ת��Ϊ�����ƽ������㣺
I P ��ַ��11010000.10101000.00000000.00000001
�������롡11111111.11111111.11111111.00000000
AND����
 ��������11000000.10101000.00000000.00000000
ת��Ϊʮ���ƺ�Ϊ��
 ��������192.168.0.0
 
I P ��ַ�� 192.168.0.254
�������롡 255.255.255.0

ת��Ϊ�����ƽ������㣺
I P ��ַ��11010000.10101000.00000000.11111110
�������롡11111111.11111111.11111111.00000000
AND����
����������11000000.10101000.00000000.00000000
ת��Ϊʮ���ƺ�Ϊ��
����������192.168.0.0
ͨ�����϶���̨�����IP��ַ�����������AND��������ǿ��Կ�������������һ���ġ���Ϊ192.168.0.0���������̨���������Ϊ��ͬһ�����硣
/* 
* ����: �ж���̨�����IP��ַ��ͬһ�����硣 
* ���������    String Mask: �������룬��ʽ����255.255.255.0���� 
*               String ip1: �����1��IP��ַ����ʽ����192.168.0.254����
*               String ip2: �����2��IP��ַ����ʽ����192.168.0.1����
*               
* ����ֵ��      0��IP1��IP2����ͬһ�����磻     1��IP��ַ�����������ʽ�Ƿ���    2��IP1��IP2������ͬһ������
*/ 
/**
public int checkNetSegment(String mask, String ip1, String ip2) 
{     
    /*������ʵ�ֹ���*/
/**   return 0;
}


��������:

�����������롢����ip��ַ


�������:

�õ�������

��������:

255.255.255.0
192.168.224.256
192.168.10.4

�������:

1

 * @author Administrator
 *
 */
public class A�ж�����IP�Ƿ�����ͬһ���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			String[] mask = in.next().split("\\.");
			String[] ip1 = in.next().split("\\.");
			String[] ip2 = in.next().split("\\.");
			if(!isLegal(ip1) || !isLegal(ip2) || !isLeagalMask(mask)){
				System.out.println(1);
				continue;
			}
			if(isSubNet(mask,ip1,ip2)){
				System.out.println(0);
			}else{
				System.out.println(2);
			}
		}
	}
	/**
	 * �ж��Ƿ�������
	 * @param mask
	 * @param ip1
	 * @param ip2
	 * @return
	 */
	private static boolean isSubNet(String[] mask,String[] ip1,String[] ip2){
		int m = 0;
		for(int i=0;i<=3;i++){
			int a = Integer.valueOf(ip1[i]);
			int b = Integer.valueOf(ip2[i]);
			int and = a&b;
			int c =0;
			if(m<mask.length){
				c = Integer.valueOf(mask[i]);
				m++;
			}else{
				break;
			}
			
			if(and!=c){
				return false;
			}
		}
		return true;
	}
	/**
	 * �Ϸ���������
	 * @param mask
	 * @return
	 */
	private static boolean isLeagalMask(String[] mask){
		for(int i=0;i<mask.length;i++){
			int ipp = Integer.valueOf(mask[i]);
			if(ipp<0 || ipp>255){
				return false;
			}
		}
		return true;
	}
	/**
	 * �Ϸ�IP
	 * @param ip
	 * @return
	 */
	private static boolean isLegal(String[] ip){
		if(ip.length!=4)
			return false;
		for(int i=0;i<4;i++){
			int ipp = Integer.valueOf(ip[i]);
			if(ipp<0 || ipp>255){
				return false;
			}
		}
		return true;
	}

}
