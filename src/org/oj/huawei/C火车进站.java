package org.oj.huawei;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
�𳵽�վ
����һ��������N�����������0<N<10���������������վ�����У�һ��N���𳵣�ÿ����������1-9��š�Ҫ�����ֵ�����������𳵳�վ�����кš�

��������:

�ж������������ÿһ���һ������һ��������N��0<N<10�����ڶ��а���N������������ΧΪ1��9��


�������:

������ֵ����С��������Ļ𳵳�վ���кţ�ÿ������Կո������ÿ��������л��У������sample��

��������:

3
1 2 3

�������:

1 2 3
1 3 2
2 1 3
2 3 1
3 2 1
 * @author Administrator
 *
 */
public class C�𳵽�վ {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int n = in.nextInt();
			int[] A = new int[n];
			for(int i=0;i<n;i++){
				A[i] = in.nextInt();
			}
			int start = 0;
			ArrayList<int[]> result = new ArrayList<int[]>();
			
			Permutation(A,start,n,result);
			Set<String> sortResult = new TreeSet<String>();
			
			for(int[] out:result){
				if(isLegal(A,out,n)){
					StringBuilder sb = new StringBuilder();
					for(int i=0;i<n-1;i++){
						sb.append(out[i]+" ");
					}
					sb.append(out[n-1]);
					sortResult.add(sb.toString());
//					System.out.println(sb.toString());
				}
			}
			for(String list:sortResult){
				System.out.println(list);
			}
		}
		in.close();

	}
	private static boolean isLegal(int[] in,int[] out,int n){
		LinkedList<Integer> stack = new LinkedList<Integer>();
		int i=0;
		int j=0;
		while(i<n){ // in ����Ԫ�ص�ʱ����Ҫ�ж� 
			if(in[i] == out[j]){ //  ���ʱ��Ͳ�����ջ��ֱ�Ӻ��� 
				i++;
				j++;
			}else{
				if(stack.isEmpty()){ //��stack ��ֻ����ջ��
					stack.push(in[i]);
					i++;
				}else{
					int top = stack.peek(); // ջ��Ԫ����ȣ����г�ջ
					if(top ==out[j]){
						j++;
						stack.pop();
					}else if(i<n){ //  ����ʱ����ջ 
						stack.push(in[i]);
						i++;
					}
				}
			}
		}
		while(!stack.isEmpty() && j<n){ // in �Ľ�����ջ��Ԫ�ؽ��̳�ջ����Ӧ�ú�outʣ���Ԫ�� ��ͬ 
			int top = stack.pop();
			if(top == out[j]){
				j++;
			}else{
				return false;
			}
		}
		return true;
		
	}
	/**
	 * ����������� 
	 * @param A
	 * @param start
	 * @param n
	 * @param result
	 */
	private static void Permutation(int[] A,int start,int n,ArrayList<int[]> result){
		if(start == n){
			return;
		}
		if(start == n-1){
			int[] B = A.clone();
			result.add(B);
			return;
		}
		for(int i=start;i<n;i++){
			swap(A,start,i);
			Permutation(A,start+1,n,result);
			swap(A,start,i);
		}
		
	}
	private static void swap(int[] A,int i,int j){
		int t = A[i];
		A[i] = A[j];
		A[j] = t;
	}

}
