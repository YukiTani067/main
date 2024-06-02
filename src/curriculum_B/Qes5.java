package curriculum_B;

public class Qes5 {
		/*-------------------------------------------------------------------------							
		[概要] 問題5の解答							
		-------------------------------------------------------------------------*/
		public static void main(String[] args) {
			// for文を使用した九九表の出力
			for (int i = 1; i <= 9; i++) {
				for (int j = 1; j <= 9; j++) {
					// 掛け算の結果を表示
					int ans = i * j;
					System.out.print(" " + String.format("%03d", j) + " * " + String.format("%03d", i) + " = " + String.format("%03d", ans) + " ||");
				}
				// 改行
				System.out.println();
			}

	}

}
