package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes1_3 {

	public static void main(String[] args) {
	    /*-------------------------------------------------------------------------							
		[概要] 問題3の解答							
		-------------------------------------------------------------------------*/
		String name = getName();
        Scanner scan = new Scanner(System.in);
        // じゃんけんを行った回数をカウント
        int count = 0;
        
        while(true) {
        // 標準入力受付
        String input = scan.nextLine();
        // ユーザーの手を判定する
        String jankenTe = jankenHantei(input);

        String cpuTe = null;
        String jankenCpu = null;
        
        // CPUの手を判定する
        cpuTe = String.valueOf(new Random().nextInt(3));
        jankenCpu = jankenHantei(cpuTe);

        System.out.println(name + "の手は" + jankenTe);
        System.out.println("相手の手は" + jankenCpu +"\n");
        
        // 勝敗判定を行いコメントを表示
        String hantei = input + cpuTe;
        if (hantei.equals("01")) {
        	System.out.println("やるやん。\n次は俺にリベンジさせて\n");
        	count++;
        	System.out.println("勝つまでにかかった合計回数は"+count+"回です");
        	break;
        } else if (hantei.equals("12")) {
        	System.out.println("やるやん。\n次は俺にリベンジさせて\n");
        	count++;
        	System.out.println("勝つまでにかかった合計回数は"+count+"回です");
        	break;
        } else if (hantei.equals("20")) {
        	System.out.println("やるやん。\n次は俺にリベンジさせて");
        	count++;
        	System.out.println("勝つまでにかかった合計回数は"+count+"回です\n");
        	break;
        } else if (hantei.equals("00")) {
        	System.out.println("DRAW あいこ もう一回しましょう！");
        	count++;
        } else if (hantei.equals("11")) {
        	System.out.println("DRAW あいこ もう一回しましょう！");
        	count++;
        } else if (hantei.equals("22")) {
        	System.out.println("DRAW あいこ もう一回しましょう！");
        	count++;
        } else if (hantei.equals("02")) {
        	System.out.println("俺の勝ち！\nなんで負けたか、明日まで考えといてください。\nそしたら何かが見えてくるはずです\n");
        	count++;
        } else if (hantei.equals("10")) {
        	System.out.println("俺の勝ち！\n負けは次につながるチャンスです！\nネバーギブアップ！\n");
        	count++;
        } else if (hantei.equals("21")) {
        	System.out.println("俺の勝ち！\nたかがじゃんけん、そう思ってないですか？\nそれやったら次も、俺が勝ちますよ\n");
        	count++;
        } else {
            System.out.println("想定外の値です。");
        }
    }
        }
	
    public static String jankenHantei(String input) {
        String jankenTe = null;
        if (input.equals("0")) {
            jankenTe = "「グー」";
        } else if (input.equals("1")) {
            jankenTe = "「チョキ」";
        } else if (input.equals("2")) {
            jankenTe = "「パー」";
        } else {
            System.out.println("想定外の値です。");
        }
        return jankenTe;
    }

    /*-------------------------------------------------------------------------							
	[概要] 問題1,2の解答							
	-------------------------------------------------------------------------*/
	private static String getName() {
		Scanner scanner = new Scanner(System.in);
		// 文字列の入力の受け取り
		String name = scanner.nextLine();

		if (name.length() > 10) {
			// ユーザー名の文字数が10文字より大きい場合「名前を10文字以内にしてください」と出力
			System.out.println("「名前を10文字以内にしてください」\n");
			return getName();
		}

		else if (name == null || name.length() == 0) {
			// ユーザー名の文字数が0文字以下もしくはnullの場合「名前を入力してください」と出力
			System.out.println("「名前を入力してください」\n");
			return getName();
		} else if (!name.matches("[0-9a-zA-Z]*")) {
			// ユーザー名が半角英数字以外の場合「半角英数字のみで名前を入力してください」と出力
			System.out.println("「半角英数字のみで名前を入力してください」\n");
			return getName();
		} else {
			// ユーザー名が正常な値だった場合「ユーザー名「 入力したユーザー名 」を登録しました」と出力
			System.out.printf("ユーザー名「%s」を登録しました%n", name);
		}
		return name;
	}
}
