package org.oj.huawei;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
/**
Problem Description:
С��ͬѧ��1��n��n�����ְ���һ����˳�������һ������Q�С��������Զ���Qִ�������³���
while(!Q.empty())              //���в��գ�ִ��ѭ��
         {
                   int x=Q.front();            //ȡ����ǰ��ͷ��ֵx
                   Q.pop();                 //������ǰ��ͷ
                   Q.push(x);               //��x�����β
                   x=Q.front();              //ȡ����ʱ���ͷ��ֵ
                   printf("%d\n",x);          //���x
                   Q.pop();                 //������ʱ��Ķ�ͷ
         }
��ȡ����ͷ��ֵ������ʱ�򣬲���������ǰ��ͷ��
С��ͬѧ���֣���γ���ǡ�ð�˳�������1,2,3,...,n������С�������㹹���ԭʼ�Ķ��У�����������
����
��һ��һ������T��T<=100����ʾ����������ÿ����������һ����n��1<=n<=100000�������������n֮�Ͳ�����200000��
���
����ÿ�����ݣ����һ�У���ʾԭʼ�Ķ��С�����֮����һ���ո��������Ҫ����ĩ�������Ŀո�

��������
4
1
2
5
10
�������
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
		
		
		result.add(0,list.get(pos)); // ���϶�ͷ��ֵ
		
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
		
		
		result.add(0,list.get(pos)); // ���϶�ͷ��ֵ
		
		result.add(0,list.get(list.size()-1));
		
		list.remove(list.size()-1);
		
		pos--;
		
		solve2(pos,list,result);
		
		
		
		
	}
	
}
