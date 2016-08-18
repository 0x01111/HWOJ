package org.oj.huawei;

import java.util.Scanner;

public class Z数组右上三角置0 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[][] A;
		StringBuilder sb = new StringBuilder();
		while(in.hasNext()){
			A = new int[3][3];
			for(int i=0;i<3;i++){
				for(int j=0;j<3;j++){
					A[i][j] = in.nextInt();
				}
			}
			for(int i=0;i<3;i++){
				for(int j=i;j<3;j++){
					A[i][j] = 0;
				}
			}
			for(int i=0;i<3;i++){
				for(int j=0;j<3;j++){
					sb.append(A[i][j]);
				}
			}
			System.out.println(sb.toString());
		}

	}

}
