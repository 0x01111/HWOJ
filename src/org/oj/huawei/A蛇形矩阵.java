package org.oj.huawei;

import java.util.Arrays;
import java.util.Scanner;

/**
蛇形矩阵
题目说明
蛇形矩阵是由1开始的自然数依次排列成的一个矩阵上三角形。
 
 
 
样例输入
5
样例输出
1 3 6 10 15
2 5 9 14
4 8 13
7 12
11
接口说明
原型
void GetResult(int Num, char * pResult);
输入参数：
        int Num：输入的正整数N
输出参数：
        int * pResult：指向存放蛇形矩阵的字符串指针
        指针指向的内存区域保证有效
返回值：
        void
 
 

输入描述:

输入正整数N（N不大于100）


输出描述:

输出一个N行的蛇形矩阵。

输入例子:

4

输出例子:

1 3 6 10
2 5 9
4 8
7

 * @author Administrator
 *
 */
public class A蛇形矩阵 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int n = in.nextInt();
			int[][] A = new int[n][n];
			solve2(A,n);
			StringBuffer sb = new StringBuffer();
			for(int i=0;i<n;i++){
//				System.out.println("aa"+ Arrays.toString(A[i]));
				for(int j=0;j<n-i-1;j++){
					sb.append(A[i][j]+" ");
				}
				sb.append(A[i][n-i-1]+"\n");
			}
			System.out.println(sb.toString());
		}

	}
	/**
	 * 找出每行数列的通项
	 * @param A
	 * @param n
	 */
	private static void solve2(int[][] A,int n){
		A[0][0] = 1;
		for(int i=1;i<n;i++){
			A[0][i] = A[0][i-1] + (i+1); 
		}
		for(int i=1;i<n;i++){
			for(int j=0;j<n-i;j++){
				A[i][j] = A[i-1][j] + j+i; 
			}
		}
	}
	/**
	 * 找规律
	 * @param A
	 * @param n
	 */
	private static void solve(int[][] A,int n){
		A[0][0] = 1;
		int k=2;
		for(int s=1;s<n;s++){
			int row = s;
			int col = 0;
			while(row>=0 && col<=s-row){
				A[row][col] = k;
				row--;
				col++;
				k++;
			}
		}
	}

}
