package org.oj.huawei;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
查找矩形
Time Limit: 2000/1000 MS (Java/Others) Memory Limit: 65536/65536 K (Java/Others)
Problem Description:
对于一组水平线段及垂直线段，共有n条，已知其中必定存在一个若干条线段组成的矩形，输出这个矩形的左下角和右上角点，定义左下角点有最小的x值和y值，右上角点有最大的x值和y值。
线段可以重合，线段必须恰好能组成矩形，即线段不能头或尾部超出矩阵边界，如下图：

输入
第一行为线段数 n (4 <= n <= 25)
接下来有n行，每行为一条线段的首尾点坐标： xi yi xj yj
坐标值范围 -1e9 <= x, y <= 1e9
输出
在一行输出矩形的左下角点和右上角点坐标：
xi yi xj yj 
根据定义有 xi < xj && yi < yj

样例输入
4
0 0 0 1
0 0 1 0
0 1 1 1
1 0 1 1 
样例输出
​0 0 1 1

 * @author Administrator
 *
 */
public class youdao03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int n = in.nextInt();
			int[][] A = new int[n][4];
			for(int i=0;i<n;i++){
				for(int j=0;j<4;j++){
					A[i][j] = in.nextInt();
				}
			}
			for(int i=0;i<n;i++){
				ArrayList<Integer> pos = new ArrayList<Integer>();
				ArrayList<int[]> list = new ArrayList<int[]>();
				find(A,pos,list);
				if(list.size()==4){
					for(int k=0;k<4;k++){
						System.out.println(Arrays.toString(list.get(i)));
					}
					break;
				}
			}
		}

	}
	public static void find(int[][] A,ArrayList<Integer> pos,ArrayList<int[]> list){
		if(list.size()==4){
			return;
		}
		if(list.size()<3){
			for(int i=0;i<A.length;i++){
				int[] line = A[i];
				if(pos.contains(i)){
					continue;
				}else{
					if(list.size()==0){
						list.add(line);
						continue;
					}
					int[] last = list.get(list.size()-1);
					if(last[2]==line[0] && last[3] == line[1]){
						list.add(line);
						pos.add(i);
						find(A,pos,list);
						list.remove(pos.size()-1);
						pos.remove(pos.size()-1);
					}
				}
			}
		}else{
			for(int i=0;i<A.length;i++){
				int[] line = A[i];
				if(pos.contains(i)){
					continue;
				}else{
					int[] last = list.get(list.size()-1);
					int[] first = list.get(0);
					if(last[2]==line[0] && last[3] == line[1]
							&& first[0] == line[2] && first[1] ==line[3]){
						list.add(line);
						pos.add(i);
						find(A,pos,list);
						list.remove(pos.size()-1);
						pos.remove(pos.size()-1);
					}
				}
			}
			
		}
	}

}
