package org.oj.huawei;
/**
描述	

计算字符串最后一个单词的长度，单词以空格隔开。
知识点	字符串,循环
运行时间限制	0M
内存限制	0

输入	
一行字符串，长度小于128。

输出	
整数N，最后一个单词的长度。
样例输入	hello world
样例输出	5

直接求解 
 */
import java.util.Scanner;

public class A字符串最后一个单词的长度 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			String str = in.nextLine();
			int len = 0;
			int i=str.length()-1;
			while(i>=0 && str.charAt(i)==' '){
				i--;
			}
			while(i>=0 && str.charAt(i)!=' '){
				i--;
				len++;
			}
			System.out.println(len);
		}
		in.close();

	}

}
