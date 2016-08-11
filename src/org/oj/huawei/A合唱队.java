package org.oj.huawei;

import java.util.Arrays;
import java.util.Scanner;
/**
描述	
计算最少出列多少位同学，使得剩下的同学排成合唱队形
说明：
N位同学站成一排，音乐老师要请其中的(N-K)位同学出列，使得剩下的K位同学排成合唱队形。 
合唱队形是指这样的一种队形：设K位同学从左到右依次编号为1，2…，K，他们的身高分别为T1，T2，…，TK，   则他们的身高满足存在i（1<=i<=K）使得Ti<T2<......<Ti-1<Ti>Ti+1>......>TK。 
     你的任务是，已知所有N位同学的身高，计算最少需要几位同学出列，可以使得剩下的同学排成合唱队形。 
 

知识点	循环
运行时间限制	0M
内存限制	0
输入	
整数N
一行整数，空格隔开，N位同学身高

输出	
最少需要几位同学出列
样例输入	8 186 186 150 200 160 130 197 200
样例输出	4

 * @author Administrator
 *
 */
public class A合唱队 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int n = in.nextInt();
			int[] A = new int[n];
			for(int i=0;i<n;i++){
				A[i] = in.nextInt();
			}
			int[] leftSmall = leftSmall(A);
			int[] rightBig = rightBig(A);
//			System.out.println(Arrays.toString(leftSmall));
//			System.out.println(Arrays.toString(rightBig));
			int small = Integer.MAX_VALUE;
			for(int i=0;i<n;i++){
				int s = leftSmall[i] + rightBig[i] -1;
				small = Math.min(small, n-s);
			}
			System.out.println(small);
		}
	}
	/**
	 * 求出以 i 结束的连续递增子序列长度
	 * @param A
	 * @return
	 */
	public static int[] leftSmall(int[] A){
		int n = A.length;
		int[] dp = new int[n];
		dp[0] = 1;
		for(int i=1;i<n;i++){
			int subLongest = 0;
			for(int j=0;j<i;j++){
				if(A[i]>A[j]){
					subLongest = Math.max(subLongest,dp[j]);
							
				}
			}
			dp[i] = subLongest + 1;
		}
		return dp;
	}
	public static int[] rightBig(int[] A){
		int n= A.length;
		int[] dp = new int[n];
		dp[n-1] = 1;
		for(int i=n-2;i>=0;i--){
			int subLongest = 0;
			for(int j=n-1;j>i;j--){
				if(A[i]>A[j]){
					subLongest = Math.max(subLongest, dp[j]);
				}
			}
			dp[i] = subLongest + 1;
		}
		return dp;
	}

}
