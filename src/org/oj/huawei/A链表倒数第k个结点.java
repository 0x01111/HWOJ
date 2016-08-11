package org.oj.huawei;

/**
������������е�����k�����
����һ��������������������е�����k����㣬����ĵ�����0�����Ϊ�����βָ�롣
�����㶨�����£�
struct ListNode
{
      int       m_nKey;
      ListNode* m_pNext;
};
��ϸ������
�ӿ�˵��
ԭ�ͣ�
ListNode* FindKthToTail(ListNode* pListHead, unsignedint k);
���������
        ListNode* pListHead  ��������
     unsigned int k  ������k�����
���������ָ��ָ����ڴ�����֤��Ч����
    ��
����ֵ��
        �������ص�����k�����ָ�룬�쳣���ؿ�ָ��
 
 

��������:

����˵��
1 �������������
2 ���������ֵ
3 ����k��ֵ


�������:

���һ������

��������:

8
1 2 3 4 5 6 7 8
4

�������:

4

 */
import java.util.Scanner;

class ListNode{
	int val;
	ListNode next;
	ListNode(){
		
	}
	ListNode(int val){
		this.val = val;
	}
}
public class A��������k����� {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			ListNode head = new ListNode(-1);
			int n = in.nextInt();
			ListNode cur = head;
//			cur = cur.next;
			for(int i=0;i<n;i++){
				int val = in.nextInt();
				ListNode p = new ListNode(val);
				cur.next = p;
				cur = cur.next;
			}
			int k = in.nextInt();
			int kVal = getLastK(head,k);
			System.out.println(kVal);
		}
	}
	/**
	 * ��ͷ��� �ҵ�������k�����
	 * @param head
	 * @param k
	 * @return
	 */
	private static int getLastK(ListNode head,int k){
		ListNode p1 = head;
		ListNode p2 = head;
		while(k>=0){
			p1 = p1.next;
			if(p1 == null){
				return -1;
			}
			k--;
		}
		while(p1!=null){
			p1 = p1.next;
			p2 = p2.next;
		}
		return p2.val;
	}

}
