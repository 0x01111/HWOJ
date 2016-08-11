package org.oj.huawei;
/**
杨辉三角的变形
            1
         1  1  1
      1  2  3  2  1
   1  3  6  7  6  3  1
1  4  10 16 19  16 10  4  1
以上三角形的数阵，第一行只有一个数1，以下每行的每个数，是恰好是它上面的数，左上角数到右上角的数，3个数之和（如果不存在某个数，认为该数就是0）。
求第n行第一个偶数出现的位置。如果没有偶数，则输出-1。例如输入3,则输出2，输入4则输出3。
 
输入n(n <= 1000000000) 
输入描述:

输入一个int整数


输出描述:

输出返回的int值

输入例子:

4

输出例子:

3

 */
import java.util.Scanner;

public class A杨辉三角的变形 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int n = in.nextInt();
			int oddIndex = getOddIndex(n);
			System.out.println(oddIndex);
		}

	}
	private static int getOddIndex(int n){
		if(n<=2){
			return -1;
		}
		int[][] A = new int[n+1][n+2];
		A[0][2] = 1;
		for(int i=1;i<n+1 ;i++){
			for(int j=2;j<n+2 ;j++){
				int s = A[i-1][j] + A[i-1][j-1] + A[i-1][j-2];
				if(s==0){
					break;
				}
				A[i][j] = s;
//				System.out.print(s+" ");
				if(i==n-1){
					if((s&0x01)==0){
						return j - 1;
					}
				}
			}
//			System.out.println();
			
		}
		return -1;
	}

}
