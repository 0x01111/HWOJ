package org.oj.huawei;

import java.util.Scanner;

/**
��7
���7�й����ֵĸ���������7�ı��������а���7�����֣���17��27��37...70��71��72��73...���ĸ���

��������:

һ��������N��(N������30000)


�������:

������N����7�йص����ָ�������������20����7�йص����ְ���7,14,17.

��������:

20

�������:

3

 * @author Administrator
 *
 */
public class A��7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int n=in.nextInt();
			int count = countSeven(n);
			System.out.println(count);
		}
	}
	private static int countSeven(int n){
		if(n<7)
			return 0;
		int count = 0;
		for(int i=7;i<= n;i++){
			if(i%7==0){
				count++;
			}else if(containsSeven(i)){
				count++;
			}
		}
		return count;
	}
	private static boolean containsSeven(int n){
		while(n>0){
			if(n%10 == 7){
				return true;
			}
			n/=10;
		}
		return false;
	}

}
