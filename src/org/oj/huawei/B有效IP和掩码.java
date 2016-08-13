package org.oj.huawei;

import java.util.Scanner;

public class B有效IP和掩码 {
	private static int a = 0;
	private static int b = 0;
	private static int c = 0;
	private static int d = 0;
	private static int e = 0;
	private static int error = 0;
	private static int p = 0;
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			String[] input = in.next().split("~");
			if(input.length!=2){
				error++;
			}
			String[] ip = input[0].split("\\.");
			String[] mask = input[1].split("\\.");
			
			if(!isMask(mask) || !isIP(ip)){
				error++;
			}else{
				countIP(ip);
			}
		}
		System.out.println(a+" "+ b+" "+c +" "+ d+" "+ e+" "+error+" "+p);
	}
	private static void countIP(String[] ip){
		
			int i1 = Integer.valueOf(ip[0]);
			int i2 = Integer.valueOf(ip[1]);
			if(i1>=1 && i1<=126){
				a++;
				if(i1 ==10 ){
					p++;
				}
			}else if(i1>=128 && i1<=191){
				b++;
				if(i1 == 172&& i2>=16 &&i2<=31 ){
					p++;
				}
			}else if(i1>=192 && i1<=223){
				c++;
				if(i1==192 && i2==168){
					p++;
				}
			}else if(i1>=224 && i1<=239){
				d++;
			}else if(i1>=240 && i1<=255){
				e++;
			} 
		
	}
	private static boolean isMask(String[] mask){
		if(mask.length!=4){
			return false;
		}
		int c1 = 0;
		int c2 = 0;
		// 先后统计 255 0 出现的次数
		for(int i=0;i<4;i++){
			// 非法mask 
			if(mask[i]==null || mask[i].length()==0 || mask[i].equals(" ")){
				return false;
			}
			int m = Integer.valueOf(mask[i]);
			
			if(m==255 && c2==0){
				c1++;
			}else if(m==0){
				c2++;
			}else{
				return false;
			}
		}
		// 0.0.0.0 255.255.255.255 是非法的
		if(c1==4 || c2==4){
			return false;
		}
		return c1+c2 == 4;
		
	}
	private static boolean isIP(String[] ip){
		if(ip.length!=4){
			return false;
		}else{
			for(int i=0;i<4;i++){
				// 非法
				if(ip[i]==null || ip[i].length()==0 || ip[i].equals(" ")){
					return false;
				}
				int ipp = Integer.valueOf(ip[i]);

				if(ipp >255){
					return false;
				}
			}
		}
		return true;
	}

}
