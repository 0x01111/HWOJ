package org.oj.huawei;
/**
�����ƶ�
����һ��������㹤�ߣ� A��ʾ�����ƶ���D��ʾ�����ƶ���W��ʾ�����ƶ���S��ʾ�����ƶ����ӣ�0,0���㿪ʼ�ƶ����������ַ��������ȡһЩ���꣬�����������������������ļ����档
 
���룺
 
�Ϸ�����ΪA(����D����W����S) + ���֣���λ���ڣ�
 
����֮����;�ָ���
 
�Ƿ��������Ҫ���ж�������AA10;  A1A;  $%$;  YAD; �ȡ�
 
������һ���򵥵����� �磺
 
A10;S20;W10;D30;X;A1A;B10A11;;A10;
 
������̣�
 
��㣨0,0��
 
+   A10   =  ��-10,0��
 
+   S20   =  (-10,-20)
 
+   W10  =  (-10,-10)
 
+   D30  =  (20,-10)
 
+   x    =  ��Ч
 
+   A1A   =  ��Ч
 
+   B10A11   =  ��Ч
 
+  һ���� ��Ӱ��
 
+   A10  =  (10,-10)
 
 
 
��� ��10�� -10��


��������:

һ���ַ���


�������:

�������꣬��,�ָ�

��������:

A10;S20;W10;D30;X;A1A;B10A11;;A10;

�������:

10,-10
 */
import java.util.Scanner;

public class B�����ƶ� {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] A;
		int x = 0;
		int y = 0;
		while(in.hasNext()){
			x = 0;
			y = 0;
			A = in.nextLine().split(";");
			for(int i=0;i<A.length;i++){
				if(isLegal(A[i])){
					char id = A[i].charAt(0);
					int value = Integer.valueOf(A[i].substring(1));
					if(id == 'A'){
						x = x - value;
					}else if(id == 'D'){
						x = x + value;
					}else if(id == 'W'){
						y = y + value;
					}else if(id == 'S'){
						y = y - value;
					}
				}
			}
			System.out.println(x+","+y);
		}

	}
	private static boolean isLegal(String str){
		if(str == null || str.length()>=4 || str.length()<=1 ){
			return false;
		}
		char ch = str.charAt(0);
		if(ch=='A' || ch=='D' || ch=='S' || ch=='W'){
			ch = str.charAt(1);
			if('0'<=ch && ch<='9'){
				if(str.length()==2){
					return true;
				}else{
					ch = str.charAt(2);

					if('0'<=ch && ch<='9'){
						return true;
					}
				}
			}
		}
		return false;
	}

}
