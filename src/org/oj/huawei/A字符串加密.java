package org.oj.huawei;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
�ַ�������
��һ�ּ��ɿ��Զ����ݽ��м��ܣ���ʹ��һ��������Ϊ�����ܳס����������Ĺ���ԭ�����ȣ�ѡ��һ��������Ϊ�ܳף���TRAILBLAZERS����������а������ظ�����ĸ��ֻ������1�������༸�����������ڣ��޸Ĺ����Ǹ�����������ĸ������棬������ʾ��
A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
T R A I L B Z E S C D F G H J K M N O P Q U V W X Y
������������ĸ����ʣ�����ĸ����������ڶ���Ϣ���м���ʱ����Ϣ�е�ÿ����ĸ���̶��ڶ������У������������еĶ�Ӧ��ĸһһȡ��ԭ�ĵ���ĸ(��ĸ�ַ��Ĵ�Сд״̬Ӧ�ñ���)����ˣ�ʹ������ܳף�Attack AT DAWN(����ʱ����)�ͻᱻ����ΪTpptad TP ITVH��
��ʵ�������ӿڣ�ͨ��ָ�����ܳ׺����ĵõ����ġ�
��ϸ������
�ӿ�˵��
ԭ�ͣ�
voidencrypt(char * key,char * data,char * encrypt);
���������
    char * key���ܳ�
    char * data������
���������
    char * encrypt������
����ֵ��
        void
 
 

��������:

������key��Ҫ���ܵ��ַ���


�������:

���ؼ��ܺ���ַ���

��������:

nihao
ni

�������:

le

 * @author Administrator
 *
 */
public class A�ַ������� {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()){
            String key = cin.nextLine();
            String string = cin.nextLine();
            Set<Character> set = new LinkedHashSet<>();
            char[] chars = key.toCharArray();
 
            for (int i = 0; i < chars.length; i++) {
                set.add(Character.toLowerCase(chars[i]));
            }
 
            set.add('a');
            set.add('b');
            set.add('c');
            set.add('d');
            set.add('e');
            set.add('f');
            set.add('g');
            set.add('h');
            set.add('i');
            set.add('j');
            set.add('k');
            set.add('l');
            set.add('m');
            set.add('n');
            set.add('o');
            set.add('p');
            set.add('q');
            set.add('r');
            set.add('s');
            set.add('t');
            set.add('u');
            set.add('v');
            set.add('w');
            set.add('x');
            set.add('y');
            set.add('z');
 
 
            Map<Character, Character> map = new LinkedHashMap<>();
            char a = 'a';
            for (Character e: set){
                map.put(a,e);
                a++;
            }
 
            char[] data = string.toCharArray();
            char[] encrypt = new char[data.length];
 
            for (int i = 0; i < data.length; i++) {
                if (map.containsKey(data[i]))
                    encrypt[i] = map.get(data[i]);
                else
                    encrypt[i] = Character.toUpperCase(map.get(Character.toLowerCase(data[i])));
            }
 
            string = "";
 
            for (int i = 0; i < encrypt.length; i++) {
                string += encrypt[i];
            }
             
            System.out.println(string);
 
        }
    }
}
