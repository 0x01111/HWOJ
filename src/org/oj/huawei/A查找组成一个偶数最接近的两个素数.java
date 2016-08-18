package org.oj.huawei;
/**
查找组成一个偶数最接近的两个素数
任意一个偶数（大于2）都可以由2个素数组成，组成偶数的2个素数有很多种情况，本题目要求输出组成指定偶数的两个素数差值最小的素数对 
输入描述:

输入一个偶数


输出描述:

输出两个素数

输入例子:

20

输出例子:

7
13

 */
import java.util.Scanner;

public class A查找组成一个偶数最接近的两个素数 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int num = in.nextInt();
			int[] p = solve(num);
			System.out.println(p[0]+"\n"+p[1]);
		}
		in.close();

	}
	private static int[] solve(int num){
		int next = num/2;
		int prev = num - next;
		while(true){
			next = nextPrime(next);
			prev = num - next;
			if(isPrime(prev)){
				return new int[]{prev,next};
			}else{
				next++;
			}
		}
		
	}
	private static int nextPrime(int num){
		int nextPrime;
		while(true){
			if(isPrime(num)){
				nextPrime = num;
				break;
			}else{
				num++;
			}
		}
		return nextPrime;
	}
	private static boolean isPrime(int num){
		if(num<=1)
			return false;
		if(num==2 || num==3)
			return true;
		for(int i=2;i< Math.sqrt(num) + 1;i++){
			if(num%i==0)
				return false;
		}
		return true;
	}

}
