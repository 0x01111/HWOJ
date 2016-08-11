package org.oj.huawei;

import java.util.Scanner;

/**
挑7
输出7有关数字的个数，包括7的倍数，还有包含7的数字（如17，27，37...70，71，72，73...）的个数

输入描述:

一个正整数N。(N不大于30000)


输出描述:

不大于N的与7有关的数字个数，例如输入20，与7有关的数字包括7,14,17.

输入例子:

20

输出例子:

3

 * @author Administrator
 *
 */
public class A桃7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int n=in.nextInt();
			int count = countSeven(n);
			System.out.println(count);
		}
	}
	private static int countSeven(int n){
		if(n<7)
			return 0;
		int count = 0;
		for(int i=7;i<= n;i++){
			if(i%7==0){
				count++;
			}else if(containsSeven(i)){
				count++;
			}
		}
		return count;
	}
	private static boolean containsSeven(int n){
		while(n>0){
			if(n%10 == 7){
				return true;
			}
			n/=10;
		}
		return false;
	}

}
