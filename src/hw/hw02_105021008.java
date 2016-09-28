package hw;
/*
 * 已知男生標準體重＝(身高－80 )0.7；女生標準體重＝(身高－70)0.6；
 * 試寫一個程式可以計算男生女生的標準體重。(輸入兩個數值，依序代表
 * 為身高及性別（1代表男性；2代表女性）)
 */
import java.util.Scanner;
public class hw02_105021008 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		float h = scn.nextFloat();
		float s = scn.nextFloat();
		if(s==1){
			System.out.println((h-80)*7/10+"公斤");
			System.out.println("男");
		}else if(s==2){
			System.out.println((h-70)*6/10+"公斤");
			System.out.println("女");
		}
	}

}
