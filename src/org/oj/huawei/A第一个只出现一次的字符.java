package org.oj.huawei;
/**
找出字符串中第一个只出现一次的字符
找出字符串中第一个只出现一次的字符
详细描述：
接口说明
原型：
bool FindChar(char* pInputString, char* pChar);
输入参数：
char* pInputString：字符串
输出参数（指针指向的内存区域保证有效）：
char* pChar：第一个只出现一次的字符
如果无此字符 请输出'.'
 
 
 

输入描述:

输入一串字符


输出描述:

输出一个字符

输入例子:

asdfasdfo

输出例子:

o

 */
import java.util.Scanner;

public class A第一个只出现一次的字符 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char[] chars;
		char first;
		while(in.hasNext()){
			chars = in.nextLine().toCharArray();
			first =findChar(chars);
			System.out.println(first);
		}
		in.close();
	}
	private static char findChar(char[] chars){
		int[] A = new int[256];
		// 记录个数
		for(int i=0;i<chars.length;i++){
			char ch = chars[i];
			A[ch]++;
		}
		// 根据字符串顺序，找到之出现第一次的字符
		for(int i=0;i<chars.length;i++){
			char ch = chars[i];
			if(A[ch]==1){
				return ch;
			}
		}
		return '.';
	}

}
