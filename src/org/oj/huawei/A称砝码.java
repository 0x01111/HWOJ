package org.oj.huawei;
/**
������
����һ�����룬����������ȣ��ֱ�Ϊm1,m2,m3��mn��
ÿ�������Ӧ������Ϊx1,x2,x3...xn������Ҫ����Щ����ȥ����������������ܳƳ������в�ͬ��������
 
ע��

������������0

��������:

�����������������ݡ�

����ÿ��������ݣ�

��һ�У�n --- ������(��Χ[1,10])

�ڶ��У�m1 m2 m3 ... mn --- ÿ�����������(��Χ[1,2000])

�����У�x1 x2 x3 .... xn --- ÿ�����������(��Χ[1,6])


�������:

���ø�����������ԳƳ��Ĳ�ͬ��������

��������:

2
1 2
2 1

�������:

5

 */
import java.util.Scanner;

public class A������ {

	public static void main(String[] args){
			Scanner in = new Scanner(System.in);
			while(in.hasNext()){
				int n = in.nextInt();
				int[] w = new int[n];
				int[] x = new int [n];
				for(int i=0;i<n;i++){
					w[i] = in.nextInt();
				}
				for(int i=0;i<n;i++){
					x[i] = in.nextInt();
				}
				fama(w,x,n);
			}
			in.close();
	}
	private static void fama(int[] w,int [] x,int n){
		int total = 0;
		for(int i=0;i<n;i++){
			total +=w[i]*x[i];
		}
		boolean [] dp = new boolean[total+1];
		dp[0] = true;
		int count = 0;
		for(int i=0;i<n;i++){ // ��������
			for(int j=0;j<x[i];j++){ // ��������i������
				for(int t = total;t>=w[i];t--){ // ��ʷ���ܳ���
					if(dp[t - w[i]]){ // t - w[i] ���������ԳƳ�����������һ�� ����Ϊw[i] �����룬�Ƴ�  t ������ 
						dp[t] = true;
					}
				}
			}
		}
		// ͳ��true�ĸ��� 
		for(int i=0;i<=total;i++){
			if(dp[i]){
				count++;
			}
		}
		System.out.println(count);
	}

}
