package org.oj.huawei;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
/**
Problem Description:
小明同学把1到n这n个数字按照一定的顺序放入了一个队列Q中。现在他对队列Q执行了如下程序：
while(!Q.empty())              //队列不空，执行循环
         {
                   int x=Q.front();            //取出当前队头的值x
                   Q.pop();                 //弹出当前队头
                   Q.push(x);               //把x放入队尾
                   x=Q.front();              //取出这时候队头的值
                   printf("%d\n",x);          //输出x
                   Q.pop();                 //弹出这时候的队头
         }
做取出队头的值操作的时候，并不弹出当前队头。
小明同学发现，这段程序恰好按顺序输出了1,2,3,...,n。现在小明想让你构造出原始的队列，你能做到吗？
输入
第一行一个整数T（T<=100）表示数据组数，每组数据输入一个数n（1<=n<=100000），输入的所有n之和不超过200000。
输出
对于每组数据，输出一行，表示原始的队列。数字之间用一个空格隔开，不要在行末输出多余的空格。

样例输入
4
1
2
5
10
样例输出
1
2 1
2 1 3
8 1 6 2 10 3 7 4 9 5

 */
import java.util.Scanner;
import java.util.Vector;

public class youdao02 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		test(10);
		int T = in.nextInt();
		
		ArrayList<Integer> list;
		while(T>0){
			int n = in.nextInt();
			list = new ArrayList<Integer>(n);
			for(int i=0;i<n;i++){
				list.add(i+1);
			}
			caculate(n);
////			solve(n-1,list,result);
//			List<Integer> result = test(n);
//			for(int i=0;i<n-1;i++){
//				System.out.print(result.get(i)+" ");
//			}
//			System.out.println(result.get(n-1));
			T--;
		}

	}
	private static void solve(int pos,ArrayList<Integer> list,ArrayList<Integer> result){
		if(pos>=list.size())
			return;
		
		
		result.add(0,list.get(pos)); // 加上队头的值
		
		result.add(0,list.get(list.size()-1));
		
		list.remove(list.size()-1);
		
		pos++;
		
		solve(pos,list,result);
		
		
		
		
	}
	public static List<Integer> test(int n ) {
    	List<Integer> list = new LinkedList<Integer>();
   
    	for (int i = n; i > 0; i--) {
    		list.add(0, i);
    		if (list.size() > 1) {
    			list.add(0, list.get(list.size() - 1));
    			list.remove(list.size() - 1);
    		} 
//    		System.out.println(list);
    	}
//    	System.out.println(list);
    	return list;
    }
	
	private static void caculate(int n ) {

		Vector<Integer> queue = new Vector<Integer>();
		int num = n;
		while(queue.size() < n){
			
			queue.add(num--);
			int a = queue.remove(0);
			queue.add(a);
		}
		
		
		System.out.print(queue.get(queue.size()-1));
		for(int i = queue.size()-2;i >= 0 ;i--)
		{
			System.out.print(" "+queue.get(i));
		}
		System.out.println();
	}
	
	private static void solve2(int pos,ArrayList<Integer> list,ArrayList<Integer> result){
		
		
		
		if(pos<0)
			return;
		
		
		result.add(0,list.get(pos)); // 加上队头的值
		
		result.add(0,list.get(list.size()-1));
		
		list.remove(list.size()-1);
		
		pos--;
		
		solve2(pos,list,result);
		
		
		
		
	}
	
}
