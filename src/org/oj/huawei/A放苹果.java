package org.oj.huawei;

import java.util.Scanner;

public class A放苹果 {

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
放苹果分为两种情况，一种是有盘子为空，一种是每个盘子上都有苹果。
令(m,n)表示将m个苹果放入n个盘子中的摆放方法总数。
1.假设有一个盘子为空，则(m,n)问题转化为将m个苹果放在n-1个盘子上，即求得(m,n-1)即可
2.假设所有盘子都装有苹果，则每个盘子上至少有一个苹果，即最多剩下m-n个苹果，问题转化为将m-n个苹果放到n个盘子上
即求(m-n，n)

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
	 * dp[i][j] 表示i个苹果放在j个盘子的方法
	 * dp[i-1][j] 表示i-1个苹果放在j个盘子的方法
	 * dp[i][j-1] 表示i个苹果放在j-1个盘子的方法
	 * 
	 * 所有可以固定一个苹果，或者国定盘子进行放
	 * 
	 * dp[i][j] = dp[i-1][j] + dp[i][j-1]
	 * 
	 * 5，1，1和1，5，1 是  不同一种方法
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
