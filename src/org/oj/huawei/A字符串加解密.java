package org.oj.huawei;

import java.util.Scanner;
/**
�ַ����ӽ���
1����������ַ������мӽ��ܣ��������
2���ܷ���Ϊ��
��������Ӣ����ĸʱ���ø�Ӣ����ĸ�ĺ�һ����ĸ�滻��ͬʱ��ĸ�任��Сд,����ĸaʱ���滻ΪB����ĸZʱ���滻Ϊa��
������������ʱ��Ѹ����ּ�1����0�滻1��1�滻2��9�滻0��
�����ַ������仯��
3�����ܷ���Ϊ���ܵ�����̡�
 
�ӿ�������
    ʵ�ֽӿڣ�ÿ���ӿ�ʵ��1������������
void Encrypt (char aucPassword[], char aucResult[])���ڸú�����ʵ���ַ������ܲ����
˵����
1���ַ�����\0��β��
2���ַ����100���ַ���
 
int unEncrypt (char result[], char password[])���ڸú�����ʵ���ַ������ܲ����
˵����
1���ַ�����\0��β��
    2���ַ����100���ַ���
 
 
 

��������:

����˵��
����һ��Ҫ���ܵ�����
����һ���ӹ��ܵ�����


�������:

���˵��
������ܺ���ַ�
������ܺ���ַ�

��������:

abcdefg
BCDEFGH

�������:

BCDEFGH
abcdefg

 * @author Administrator
 *
 */
public class A�ַ����ӽ��� {

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
	 * ����
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
	 * ����
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
