package org.oj.huawei;
/**
称砝码
现有一组砝码，重量互不相等，分别为m1,m2,m3…mn；
每种砝码对应的数量为x1,x2,x3...xn。现在要用这些砝码去称物体的重量，问能称出多少中不同的重量。
 
注：

称重重量包括0

输入描述:

输入包含多组测试数据。

对于每组测试数据：

第一行：n --- 砝码数(范围[1,10])

第二行：m1 m2 m3 ... mn --- 每个砝码的重量(范围[1,2000])

第三行：x1 x2 x3 .... xn --- 每个砝码的数量(范围[1,6])


输出描述:

利用给定的砝码可以称出的不同的重量数

输入例子:

2
1 2
2 1

输出例子:

5

 */
import java.util.Scanner;

public class A称砝码 {

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
		for(int i=0;i<n;i++){ // 遍历砝码
			for(int j=0;j<x[i];j++){ // 遍历砝码i的数量
				for(int t = total;t>=w[i];t--){ // 历史可能称重
					if(dp[t - w[i]]){ // t - w[i] 的重量可以称出，可以增加一个 重量为w[i] 的砝码，称出  t 的重物 
						dp[t] = true;
					}
				}
			}
		}
		// 统计true的个数 
		for(int i=0;i<=total;i++){
			if(dp[i]){
				count++;
			}
		}
		System.out.println(count);
	}

}
