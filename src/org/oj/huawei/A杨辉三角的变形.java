package org.oj.huawei;
/**
������ǵı���
            1
         1  1  1
      1  2  3  2  1
   1  3  6  7  6  3  1
1  4  10 16 19  16 10  4  1
���������ε����󣬵�һ��ֻ��һ����1������ÿ�е�ÿ��������ǡ������������������Ͻ��������Ͻǵ�����3����֮�ͣ����������ĳ��������Ϊ��������0����
���n�е�һ��ż�����ֵ�λ�á����û��ż���������-1����������3,�����2������4�����3��
 
����n(n <= 1000000000) 
��������:

����һ��int����


�������:

������ص�intֵ

��������:

4

�������:

3

 */
import java.util.Scanner;

public class A������ǵı��� {

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
