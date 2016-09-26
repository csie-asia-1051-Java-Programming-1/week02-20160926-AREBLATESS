package ex;
/*
 * Topic: 電話公司的計費方式是 600分鐘以下每分鐘0.5元；
 * 	600~1200分鐘電話費以9折計算；1200分鐘以上電話費以79折計算，
 *  讓使用者輸入單月使用分時間(分鐘)，算出電話費(元)
 * Date: 2016/09/26
 * Author: 1050210XX 周永振老師
 */

import java.util.Scanner;
public class ex01_105021008 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		float p=0.5f;
		double d = 0d;
		if(n<600){
			d=n*p;
			System.out.print(d);
		}else{
			if(n<1200){
				d=n*p*0.9;
				System.out.print(d);
		}else{d=n*p*0.79;
		System.out.print(d);
			}
		}

	}

}
