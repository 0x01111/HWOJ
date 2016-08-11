package org.oj.huawei;

import java.util.Arrays;
import java.util.Scanner;
/**
����	
�������ٳ��ж���λͬѧ��ʹ��ʣ�µ�ͬѧ�ųɺϳ�����
˵����
Nλͬѧվ��һ�ţ�������ʦҪ�����е�(N-K)λͬѧ���У�ʹ��ʣ�µ�Kλͬѧ�ųɺϳ����Ρ� 
�ϳ�������ָ������һ�ֶ��Σ���Kλͬѧ���������α��Ϊ1��2����K�����ǵ���߷ֱ�ΪT1��T2������TK��   �����ǵ�����������i��1<=i<=K��ʹ��Ti<T2<......<Ti-1<Ti>Ti+1>......>TK�� 
     ��������ǣ���֪����Nλͬѧ����ߣ�����������Ҫ��λͬѧ���У�����ʹ��ʣ�µ�ͬѧ�ųɺϳ����Ρ� 
 

֪ʶ��	ѭ��
����ʱ������	0M
�ڴ�����	0
����	
����N
һ���������ո������Nλͬѧ���

���	
������Ҫ��λͬѧ����
��������	8 186 186 150 200 160 130 197 200
�������	4

 * @author Administrator
 *
 */
public class A�ϳ��� {

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
	 * ����� i �������������������г���
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
