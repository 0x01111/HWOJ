package org.oj.huawei;

import java.util.Scanner;

public class Z最大的正方形 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[][] A;
		int n,m;
		while(in.hasNext()){
			n = in.nextInt();
			m = in.nextInt();
			A = new int[n][m];
			for(int i=0;i<n;i++){
				for(int j=0;j<m;j++){
					A[i][j] = in.nextInt();
				}
			}
			int x = maxSquare(A);
			System.out.println(x);
		}

	}
    public static int maxSquare(int[][] matrix) {
        // write your code here
        if(matrix==null)
            return 0;
        int m = matrix.length;
        if(m ==0 )
            return 0;
        int n = matrix[0].length;
        if( n==0 )
            return 0;
        int res = -1;
        for(int i = 1;i<m;i++){
            for(int j = 1;j<n;j++){
                if(matrix[i][j]!=0 ){
                    matrix[i][j] = min3(matrix[i-1][j-1],matrix[i][j-1],matrix[i-1][j]) + 1;
                }
                res = Math.max(res,matrix[i][j]);
                
            }
        }
        return res;
    }
    public static int min3(int a ,int b,int c){
        a = Math.min(a,b);
        c = Math.min(a,c);
        return c;
    }

}
