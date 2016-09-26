package ex;
/*
 * Topic: 假設某個停車場的費率是停車2小時以內，每半小時30元，超過2小時，但未滿4小時的部份，
 * 	每半小時40元，超過4小時以上的部份，每半小時60元，未滿半小時部分不計費。
 * 	如果您從早上10點23分停到下午3點20分，請撰寫程式計算共需繳交的停車費。
 * Date: 2016/09/26   5小時03分鐘
 * Author: 105021008 陳畯程
 */
import java.util.Scanner;
public class ex03_105021008 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn =new Scanner(System.in);
		int a =scn.nextInt();
		int b =scn.nextInt();
		int c =scn.nextInt();
		int d =scn.nextInt();
		int e=((c-a)*60+d-b);
		if (e<=120){
			System.out.println(Math.floor(e/30)*30);
		}else if(e<=240){
			System.out.println(Math.floor((e-120)/30)*40+120);
		}else if(e>240){
				System.out.println(Math.floor((e-240)/30)*60+280);
		}
	}

}
