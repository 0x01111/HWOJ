package org.oj.huawei;

import java.util.Scanner;
/**
输入一行字符，分别统计出包含英文字母、空格、数字和其它字符的个数
输入一行字符，分别统计出包含英文字母、空格、数字和其它字符的个数。

输入描述:

输入一行字符串，可以有空格


输出描述:

统计其中英文字符，空格字符，数字字符，其他字符的个数

输入例子:

1qazxsw23 edcvfr45tgbn hy67uj m,ki89ol.\\/;p0-=\\][

输出例子:

26
3
10
12

 * @author Administrator
 *
 */
public class A字符个数统计 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			String str = in.nextLine();
			int word = 0;
			int space = 0;
			int digit = 0;
			
			int other = 0;
			for(int i=0;i<str.length();i++){
				char ch = str.charAt(i);
				if(isWord(ch)){
					word++;
				}else if(isDigit(ch)){
					digit++;
				}else if(isSpace(ch)){
					space++;
				}else {
					other++;
				}
			}
			System.out.println(word +"\n"+ space +"\n"+digit +"\n"+ other);
		}
		in.close();
	}
	private static boolean isSpace(char ch){
		if(ch == ' '){
			return true;
		}
		return false;
	}
	private static boolean isWord(char ch){
		if('a'<=ch&& ch<='z' || 'A'<=ch && ch<='Z'){
			return true;
		}
		return false;
	}
	private static boolean isDigit(char ch){
		if('0'<= ch && ch<='9'){
			return true;
		}
		return false;
	}

}
