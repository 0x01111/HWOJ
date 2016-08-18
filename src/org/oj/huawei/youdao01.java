package org.oj.huawei;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class youdao01 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
		while(T>0){
			int n = in.nextInt();
			int k = in.nextInt();
			list = new ArrayList<Integer>();
			for(int i=0;i<2*n;i++){
				list.add(in.nextInt());
			}
			list = solve(list,k,n);
			for(int i=0;i<2*n-1;i++){
				System.out.print(list.get(i)+" ");
			}
			System.out.println(list.get(2*n-1));
			T--;
		}
		in.close();
	}
	private static ArrayList<Integer> solve(ArrayList<Integer> list,int k,int n){
		while(k>0){
			list = reverse(list,n);
			k--;
		}
		return list;
	}
	private static ArrayList<Integer> reverse(ArrayList<Integer> list,int n){
		
		ArrayList<Integer> rev = new ArrayList<Integer>();
		int left = n-1;
		int right = 2*n-1;
		while(left>=0){
			rev.add(list.get(right));
			rev.add(list.get(left));
			right--;
			left--;
		}
		Collections.reverse(rev);
		return rev;
	}

}
