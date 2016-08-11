package org.oj.huawei;

import java.util.Arrays;
import java.util.Scanner;

/**
名字的漂亮度
给出一个名字，该名字有26个字符串组成，定义这个字符串的“漂亮度”是其所有字母“漂亮度”的总和。
每个字母都有一个“漂亮度”，范围在1到26之间。没有任何两个字母拥有相同的“漂亮度”。字母忽略大小写。
给出多个名字，计算每个名字最大可能的“漂亮度”。

输入描述:

整数N，后续N个名字


输出描述:

每个名称可能的最大漂亮程度

输入例子:

2
zhangsan
lisi

输出例子:

192
101

 * @author Administrator
 *
 */
public class A名字的漂亮度 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int n = in.nextInt();
			String[] A = new String[n];
			StringBuffer sb = new StringBuffer();
			for(int i=0;i<n;i++){
				A[i] = in.next().toLowerCase();
			}
			int count = solve(A[0]);
			sb.append(count);
			for(int i=1;i<n;i++){
				count = solve(A[i]);
				sb.append("\n" + count);
			}
			System.out.println(sb.toString());
		}

	}
	public static int solve(String str){
		int[] arr = new int[26];
		for(int i=0;i<str.length();i++){
			char ch = str.charAt(i);
			arr[ch - 'a']++;
		}
		Arrays.sort(arr);
		int count = 0;
		for(int i=25;i>=0;i--){
			if(arr[i]==0)
				break;
			count += (i+1) * arr[i];
			
		}
		return count;
	}

}
