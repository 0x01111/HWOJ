package org.oj.huawei;

import java.util.Arrays;
import java.util.Scanner;

/**
���ξ���
��Ŀ˵��
���ξ�������1��ʼ����Ȼ���������гɵ�һ�������������Ρ�
 
 
 
��������
5
�������
1 3 6 10 15
2 5 9 14
4 8 13
7 12
11
�ӿ�˵��
ԭ��
void GetResult(int Num, char * pResult);
���������
        int Num�������������N
���������
        int * pResult��ָ�������ξ�����ַ���ָ��
        ָ��ָ����ڴ�����֤��Ч
����ֵ��
        void
 
 

��������:

����������N��N������100��


�������:

���һ��N�е����ξ���

��������:

4

�������:

1 3 6 10
2 5 9
4 8
7

 * @author Administrator
 *
 */
public class A���ξ��� {

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
	 * �ҳ�ÿ�����е�ͨ��
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
	 * �ҹ���
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
