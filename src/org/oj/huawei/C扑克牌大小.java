package org.oj.huawei;
/**
�˿��ƴ�С
�˿�����Ϸ���Ӧ�ö��Ƚ���Ϥ�ˣ�һ������54����ɣ���3~A��2��4�ţ�С��1�ţ�����1�š������С�����������ַ����ַ�����ʾ�����У�Сдjoker��ʾС������дJOKER��ʾ������:) 
3 4 5 6 7 8 9 10 J Q K A 2 joker JOKER 
���������ƣ�������֮���á�-�����ӣ�ÿ���Ƶ�ÿ�����Կո�ָ�����-������û�пո��磺4 4 4 4-joker JOKER
��Ƚ������ƴ�С������ϴ���ƣ���������ڱȽϹ�ϵ�����ERROR

��������
��1������ÿ���ƿ����Ǹ��ӣ����ӣ�˳�ӣ�����5�ţ���������ը�����ĸ����Ͷ����е�һ�֣���������������������뱣֤�����ƶ��ǺϷ��ģ�˳���Ѿ���С�������У�
��2������ը���Ͷ������Ժ������ƱȽ�֮�⣬�������͵���ֻ�ܸ���ͬ���͵Ĵ��ڱȽϹ�ϵ���磬���Ӹ����ӱȽϣ������������Ƚϣ��������ǲ���������磺�����Ӳ�ֳɸ��ӣ�
��3����С��������ƽʱ�˽�ĳ���������ͬ�����ӣ����ӣ������Ƚ������С��˳�ӱȽ���С�ƴ�С��ը������ǰ�����е��ƣ�ը��֮��Ƚ������С�������������ƣ�
��4������������Ʋ��������ȵ������

����ʾ��
��1������ը���Ͷ���֮�⣬��������ͬ���ͱȽϡ�
��2�������Ѿ���֤�Ϸ��ԣ����ü�������Ƿ��ǺϷ����ơ�
��3�������˳���Ѿ�������С����������˲�����������.

��������:

���������ƣ�������֮���á�-�����ӣ�ÿ���Ƶ�ÿ�����Կո�ָ�����-������û�пո���4 4 4 4-joker JOKER��


�������:

����������нϴ�����֣��������ӷ����˿���˳�򲻱䣬���Կո��������������ڱȽϹ�ϵ�����ERROR��

��������:

4 4 4 4-joker JOKER

�������:

joker JOKER

 */
import java.util.Scanner;

public class C�˿��ƴ�С {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] line;
		String[] left ;
		String[] right ;
		String out = "ERROR";
//		System.out.println("0".compareTo("10"));
		while(in.hasNext()){
			line = in.nextLine().split("-");
			if(line[0].contains("joker JOKER") ||
				line[1].contains("joker JOKER")){
				out = "joker JOKER";
			}else{
				left = line[0].split(" ");
				right = line[1].split(" ");
				int leftLen = left.length;
				int rightLen = right.length;
				if(leftLen==4 && rightLen!=4){
					out = line[0];
				}else if(leftLen!=4 && rightLen==4){
					out = line[1];
				}else if(leftLen==rightLen){
					if(count(left[0]) > count(right[0])){
						out = line[0];
					}else{
						out = line[1];
					}
				}
			}
			
			System.out.println(out);
		}
		in.close();
	}
	//2-JOKER ����С����2-16 ����û��� 
    private static int count(String str) {
        return "345678910JQKA2jokerJOKER".indexOf(str);
    }

}
