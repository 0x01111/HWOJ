package org.oj.huawei;



import java.util.Scanner;
/**
����n�����������������С��k��
����n�����������������С��k��
 
 
��������:
����˵�� 
1 ������������ 
2 ����һ����������
�������:
���һ����������,�������ǰk������k��1��ʼ
��������:
5 2
1 3 5 7 2
�������:
1 2
*/

import java.util.*;
public class A��С��k��{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int n = in.nextInt();
            int k = in.nextInt();
            int[] A = new int[n];
            for(int i=0;i<n;i++){
                A[i] = in.nextInt();
            }
            solve(A,n,k);
            sort(A,0,k-1);
            StringBuilder sb = new StringBuilder();
            for(int i=0;i<k-1;i++){
            	sb.append(A[i]+" ");
            }
            sb.append(A[k-1]);
            System.out.println(sb.toString());
        }
    }
    public static void sort(int[] A,int l,int r){
        if(l>=r)
            return;
        int mid = partition(A,l,r);
        sort(A,l,mid-1);
        sort(A,mid,r);
    }
    public static void solve(int[] A,int n,int k){
        int mid = partition(A,0,n-1);
        while(mid!=k-1){
            if(mid < k){
                mid = partition(A,mid+1,n-1);
            }else{
                mid = partition(A,0,mid-1);
            }
        }
    }
    public static int  partition(int[] A,int l,int r){
        if(l>=r)
            return l;
        int x = A[r];
        int slow = l-1;
        for(int fast = l;fast<=r-1;fast++){
            if(A[fast] <= x){
                slow++;
                swap(A,slow,fast);
            }
        }
        slow++;
        swap(A,slow,r);
        return slow;
        
    }
    public static void swap(int[] A,int i,int j){
        int t = A[i];
        A[i] = A[j];
        A[j] = t;
    }
}