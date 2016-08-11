package org.oj.huawei;
/**
��ȫ������
��ȫ����Perfect number�����ֳ����������걸������һЩ�������Ȼ����
�����е������ӣ����������������Լ�����ĺͣ������Ӻ�������ǡ�õ���������
���磺28������Լ��1��2��4��7��14��28����ȥ������28�⣬����5������ӣ�1+2+4+7+14=28��
��������count(int n),���ڼ���n����(��n)��ȫ���ĸ��������㷶Χ, 0 < n <= 500000
����n������ȫ���ĸ������쳣�������-1
 
/**
 * 
 * ��ȫ����Perfect number�����ֳ����������걸������һЩ�������Ȼ����
 * �����е������ӣ����������������Լ�����ĺͣ������Ӻ�������ǡ�õ���������
 * ���磺28������Լ��1��2��4��7��14��28����ȥ������28�⣬����5������ӣ�1+2+4+7+14=28��
 * 
 * ��������count(int n),���ڼ���n����(��n)��ȫ���ĸ���
 * @param n ���㷶Χ, 0 < n <= 500000
 * @return n������ȫ���ĸ���, �쳣�������-1
 * 
 */    
/*
��������:

����һ������


�������:

�����ȫ���ĸ���

��������:

1000

�������:

3
 */
import java.util.Scanner;

public class A��ȫ������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int n = in.nextInt();
			int c = countPerfect(n);
			
			System.out.println(c);
		}
		in.close();
	}
	
	private static int countPerfect(int num){
		if(num<=0 || num>500000){
			return -1;
		}
		int count = 0;
		for(int i=2;i<=num;i++){
			if(isPerfect(i)){
				count+=1;
//				System.out.println(i);
			}
		}
		return count;
	}
	private static boolean isPerfect(int num){
		int c = 1;
		for(int i=2;i<= num/2;i++){
			if(num%i==0){
				c+=i;
//				System.out.println(i+" ");
			}
		}
		return c==num;
	}

}
