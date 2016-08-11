package org.oj.huawei;

import java.util.Scanner;
/**
字符串加解密
1、对输入的字符串进行加解密，并输出。
2加密方法为：
当内容是英文字母时则用该英文字母的后一个字母替换，同时字母变换大小写,如字母a时则替换为B；字母Z时则替换为a；
当内容是数字时则把该数字加1，如0替换1，1替换2，9替换0；
其他字符不做变化。
3、解密方法为加密的逆过程。
 
接口描述：
    实现接口，每个接口实现1个基本操作：
void Encrypt (char aucPassword[], char aucResult[])：在该函数中实现字符串加密并输出
说明：
1、字符串以\0结尾。
2、字符串最长100个字符。
 
int unEncrypt (char result[], char password[])：在该函数中实现字符串解密并输出
说明：
1、字符串以\0结尾。
    2、字符串最长100个字符。
 
 
 

输入描述:

输入说明
输入一串要加密的密码
输入一串加过密的密码


输出描述:

输出说明
输出加密后的字符
输出解密后的字符

输入例子:

abcdefg
BCDEFGH

输出例子:

BCDEFGH
abcdefg

 * @author Administrator
 *
 */
public class A字符串加解密 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			String Encrypt = in.next();
			String unEncrypt = in.next();
			String myEncrypt = MyEncrypt(Encrypt);
			String myUnEncrypt = MyUnEncrypt(unEncrypt);
			System.out.println(myEncrypt);
			System.out.println(myUnEncrypt);
		}

	}
	/**
	 * 加密
	 * @param str
	 * @return
	 */
	private static String MyEncrypt(String str){
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<str.length();i++){
			char ch =str.charAt(i);
			if(isLowCase(ch)){
				if(ch=='z'){
					sb.append("A");
				}else{
					sb.append((char)(ch-'a'+'A' + 1));
				}
			}else if(isUpperCase(ch)){
				if(ch=='Z'){
					sb.append("a");
				}else{
					sb.append((char)(ch-'A'+'a' + 1));
				}
			}else if(isDigits(ch)){
				if(ch=='9'){
					sb.append('0');
				}else{
					sb.append((char)(ch+1));
				}
			}else{
				sb.append(ch);
			}
		}
		return sb.toString();
	}
	/**
	 * 解密
	 * @param str
	 * @return
	 */
	private static String MyUnEncrypt(String str){
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<str.length();i++){
			char ch =str.charAt(i);
			if(isLowCase(ch)){
				if(ch=='a'){
					sb.append("Z");
				}else{
					sb.append((char)(ch-'a'+'A' - 1));
				}
			}else if(isUpperCase(ch)){
				if(ch=='A'){
					sb.append("z");
				}else{
					sb.append((char)(ch-'A'+'a' - 1));
				}
			}else if(isDigits(ch)){
				if(ch=='0'){
					sb.append('9');
				}else{
					sb.append((char)(ch-1));
				}
			}else{
				sb.append(ch);
			}
		}
		return sb.toString();
	}
	
	private static boolean isDigits(char ch){
		return '0'<= ch && ch<='9';
	}
	private static boolean isLowCase(char ch){
		return 'a'<= ch && ch<='z';
	}
	private static boolean isUpperCase(char ch){
		return 'A'<= ch && ch<= 'Z';
	}
}
