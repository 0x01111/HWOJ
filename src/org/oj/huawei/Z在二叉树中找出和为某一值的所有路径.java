package org.oj.huawei;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Z在二叉树中找出和为某一值的所有路径 {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int[] A;
		String[] Astr;
		while(in.hasNext()){
			int sum = in.nextInt();
			in.nextLine();
			Astr = in.nextLine().split(",");
			int n = Astr.length;
			A = new int[n+1];
			for(int i=0;i<n;i++){
				A[i+1] = Integer.valueOf(Astr[i]);
			}
			//dfs(int[] A,int num,int pos ,int N,ArrayList<Integer> v)
			
			dfs(A,n,1,sum, "",0);
//			System.out.println(Arrays.toString(A));
//			ArrayList<String> result = paths(A,sum,n);
//			for(int i=0;i<result.size();i++){
//				System.out.println(result.get(i));
//			}
		}

	}
	private static ArrayList<String> paths(int[] A,int sum,int n){
		int leaf = n>>1;
		int cheng = (int) (Math.log10(n)/Math.log10(2));
		ArrayList<String> result = new ArrayList<String>();
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		while(leaf<n){
			int i= leaf;
			int tmpSum = 0;
			String str = "";
			while(i>=0){
				tmpSum += A[i];
				if(i==leaf){
					str = A[i]+"";
				}else{
					str = A[i] +","+str;
				}
				
				if(i-1<0){
					break;
				}
				i = (i-1)/2;
			}
			if(tmpSum==sum){
				int tcheng = (int) (Math.log10(i+1)/Math.log10(2));
				System.out.println(tcheng+"\t"+cheng);
				if(tcheng<cheng)
					result.add(str);
				else
					result.add(0,str);
			}
			leaf++;
		}
		return result;
	}
	private static void dfs(int[] A,int num,int pos ,int N,String str,int tmpSum ){
		if(pos>num)
			return;
		tmpSum +=A[pos];
		if(str.equals("")){
			str = A[pos]+"";
		}else{
			str = str +","+A[pos];
		}
		
		if(2*pos > num){
			if(tmpSum!=N)
				return;
			System.out.println(str);
		}
		if(2*pos <=num)
			dfs(A,num,2*pos,N,str,tmpSum);
		if((2*pos +1) <= num){
			dfs(A,num,2*pos+1,N,str,tmpSum);
		}
	}

}
