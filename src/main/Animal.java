package main;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Animal {

	public static void main(String[] args) {

		// キーに値をセッティング
		Map<String, String> animal = new HashMap<String, String>() {
			{
				put("ライオン", "パンテラ レオ");
				put("ゾウ", "ロキソドンタ・サイクロティス");
				put("パンダ", "アイルロポダ・メラノレウカ");
				put("チンパンジー", "パン・トゥログロディテス");
				put("シマウマ", "チャップマンシマウマ");
				put("インコ", "不明");
			}
		};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("コンソールに文字を入力してください");
		String s = sc.nextLine();
		sc.close();
		System.out.printf("コンソール出力結果\n\n");
		String[] a = s.split(",");
		for (String p : a) {
			// 入力された値を:で区切って配列へ
			String[] b = p.split(":");
			System.out.printf("動物名:%s\n", b[0]);
			System.out.printf("体長:%sm\n", b[1]);
			System.out.printf("速度:%skm/h\n", b[2]);
			System.out.printf("学名:%s\n\n", animal.get(b[0]));
		}
	}

}