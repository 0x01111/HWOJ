package org.oj.huawei;

import java.util.Arrays;
import java.util.Scanner;

/**
���ֵ�Ư����
����һ�����֣���������26���ַ�����ɣ���������ַ����ġ�Ư���ȡ�����������ĸ��Ư���ȡ����ܺ͡�
ÿ����ĸ����һ����Ư���ȡ�����Χ��1��26֮�䡣û���κ�������ĸӵ����ͬ�ġ�Ư���ȡ�����ĸ���Դ�Сд��
����������֣�����ÿ�����������ܵġ�Ư���ȡ���

��������:

����N������N������


�������:

ÿ�����ƿ��ܵ����Ư���̶�

��������:

2
zhangsan
lisi

�������:

192
101

 * @author Administrator
 *
 */
public class A���ֵ�Ư���� {

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
