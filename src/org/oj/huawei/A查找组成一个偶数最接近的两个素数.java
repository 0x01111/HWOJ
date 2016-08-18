package org.oj.huawei;
/**
�������һ��ż����ӽ�����������
����һ��ż��������2����������2��������ɣ����ż����2�������кܶ������������ĿҪ��������ָ��ż��������������ֵ��С�������� 
��������:

����һ��ż��


�������:

�����������

��������:

20

�������:

7
13

 */
import java.util.Scanner;

public class A�������һ��ż����ӽ����������� {

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
