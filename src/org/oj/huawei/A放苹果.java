package org.oj.huawei;

import java.util.Scanner;

public class A��ƻ�� {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int m,n,result;
		while(in.hasNext()){
			m = in.nextInt();
			n = in.nextInt();
			result = count(m,n);
			System.out.println(result);
		}

	}
	
	private static int count(int m,int n){
		int[][] dp = new int[m+1][n+1];
		for(int i=0;i<=m;i++)
			dp[i][0]=1;
		for(int j=0;j<=n;j++)
			dp[0][j]=1;
		
		for(int i=2;i<=m;i++){
			for(int j=2;j<=n;j++){
				if(i>=j){
					dp[i][j] = dp[i][j-1] + dp[i-j][j];
				}else{
					dp[i][j] = dp[i][j-1];
				}
			}
		}
		return dp[m][n];
	}
	/**
��ƻ����Ϊ���������һ����������Ϊ�գ�һ����ÿ�������϶���ƻ����
��(m,n)��ʾ��m��ƻ������n�������еİڷŷ���������
1.������һ������Ϊ�գ���(m,n)����ת��Ϊ��m��ƻ������n-1�������ϣ������(m,n-1)����
2.�����������Ӷ�װ��ƻ������ÿ��������������һ��ƻ���������ʣ��m-n��ƻ��������ת��Ϊ��m-n��ƻ���ŵ�n��������
����(m-n��n)

	 * @param m
	 * @param n
	 * @return
	 */
	private static int putapples(int m,int n){
		if(m<0)
			return 0;
		if(m==1 || n==1)
			return 1;
		return putapples(m,n-1) + putapples(m-n,n);
	}
	/**
	 * dp[i][j] ��ʾi��ƻ������j�����ӵķ���
	 * dp[i-1][j] ��ʾi-1��ƻ������j�����ӵķ���
	 * dp[i][j-1] ��ʾi��ƻ������j-1�����ӵķ���
	 * 
	 * ���п��Թ̶�һ��ƻ�������߹������ӽ��з�
	 * 
	 * dp[i][j] = dp[i-1][j] + dp[i][j-1]
	 * 
	 * 5��1��1��1��5��1 ��  ��ͬһ�ַ���
	 * @param m
	 * @param n
	 * @return
	 */
	private static int countError(int m,int n){
		int result = 0;
		int[][] dp = new int[m+1][n+1];
		for(int i=1;i<=n;i++){
			dp[1][i] = i;
		}
		for(int j=1;j<=m;j++){
			dp[j][1] = 1;
		}
		for(int i=2;i<=m;i++){
			for(int j=2;j<=n;j++){
				dp[i][j] = dp[i][j-1] + dp[i-1][j];
//				System.out.print(dp[i][j] +" ");
			}
			System.out.println();
		}
		return dp[m][n];
	}

}
