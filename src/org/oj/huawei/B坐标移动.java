package org.oj.huawei;
/**
坐标移动
开发一个坐标计算工具， A表示向左移动，D表示向右移动，W表示向上移动，S表示向下移动。从（0,0）点开始移动，从输入字符串里面读取一些坐标，并将最终输入结果输出到输出文件里面。
 
输入：
 
合法坐标为A(或者D或者W或者S) + 数字（两位以内）
 
坐标之间以;分隔。
 
非法坐标点需要进行丢弃。如AA10;  A1A;  $%$;  YAD; 等。
 
下面是一个简单的例子 如：
 
A10;S20;W10;D30;X;A1A;B10A11;;A10;
 
处理过程：
 
起点（0,0）
 
+   A10   =  （-10,0）
 
+   S20   =  (-10,-20)
 
+   W10  =  (-10,-10)
 
+   D30  =  (20,-10)
 
+   x    =  无效
 
+   A1A   =  无效
 
+   B10A11   =  无效
 
+  一个空 不影响
 
+   A10  =  (10,-10)
 
 
 
结果 （10， -10）


输入描述:

一行字符串


输出描述:

最终坐标，以,分隔

输入例子:

A10;S20;W10;D30;X;A1A;B10A11;;A10;

输出例子:

10,-10
 */
import java.util.Scanner;

public class B坐标移动 {

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
