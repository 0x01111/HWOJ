package org.oj.huawei;
/**
完全数计算
完全数（Perfect number），又称完美数或完备数，是一些特殊的自然数。
它所有的真因子（即除了自身以外的约数）的和（即因子函数），恰好等于它本身。
例如：28，它有约数1、2、4、7、14、28，除去它本身28外，其余5个数相加，1+2+4+7+14=28。
给定函数count(int n),用于计算n以内(含n)完全数的个数。计算范围, 0 < n <= 500000
返回n以内完全数的个数。异常情况返回-1
 
/**
 * 
 * 完全数（Perfect number），又称完美数或完备数，是一些特殊的自然数。
 * 它所有的真因子（即除了自身以外的约数）的和（即因子函数），恰好等于它本身。
 * 例如：28，它有约数1、2、4、7、14、28，除去它本身28外，其余5个数相加，1+2+4+7+14=28。
 * 
 * 给定函数count(int n),用于计算n以内(含n)完全数的个数
 * @param n 计算范围, 0 < n <= 500000
 * @return n以内完全数的个数, 异常情况返回-1
 * 
 */    
/*
输入描述:

输入一个数字


输出描述:

输出完全数的个数

输入例子:

1000

输出例子:

3
 */
import java.util.Scanner;

public class A完全数计算 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int n = in.nextInt();
			int c = countPerfect(n);
			
			System.out.println(c);
		}
		in.close();
	}
	
	private static int countPerfect(int num){
		if(num<=0 || num>500000){
			return -1;
		}
		int count = 0;
		for(int i=2;i<=num;i++){
			if(isPerfect(i)){
				count+=1;
//				System.out.println(i);
			}
		}
		return count;
	}
	private static boolean isPerfect(int num){
		int c = 1;
		for(int i=2;i<= num/2;i++){
			if(num%i==0){
				c+=i;
//				System.out.println(i+" ");
			}
		}
		return c==num;
	}

}
