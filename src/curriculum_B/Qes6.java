package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes6 {
	/*-------------------------------------------------------------------------							
	[概要] 問題6の解答							
	-------------------------------------------------------------------------*/
	public static void main(String[] args) {
		int Max = 11;
		Scanner scanner = new Scanner(System.in);
		Random ran = new Random();
		
		// 「、」区切りで入力
		String[] strs = scanner.nextLine().split("、");
		
		
		for (String str : strs) {
			int n = ran.nextInt(Max);
			//　残り台数を出力
			String end = str + "の残り台数は" + n + "台です\n";
			
			// 入力された商品によって処理を分岐
			switch (str) {
			case "パソコン":
			case "冷蔵庫":
			case "扇風機":
			case "洗濯機":
			case "加湿器":
				break;
			case "テレビ":
			case "ディスプレイ":
				// ディスプレイの場合は11からランダムで引いて出力
				end = "ディスプレイ".equals(str) ? str + "の残り台数は" + (Max - n) + "台です\n" : end;
				break;
			default:
				// 当てはまる商品がない場合に出力
				end = "『　" + str + "　』は指定の商品ではありません\n";
			}
			// 結果をコンソールに出力
			System.out.println(end);
		}scanner.close();
	}

}
