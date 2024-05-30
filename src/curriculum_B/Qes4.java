package curriculum_B;

public class Qes4 {

	/*-------------------------------------------------------------------------							
	[概要] 問題4の解答							
	-------------------------------------------------------------------------*/
	public static void main(String[] args) {
		// for文を使用した九九表の出力
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				// 掛け算の結果を表示
				int ans = i * j;
				System.out.print(" " + String.format("%02d", i) + " * " + String.format("%02d", j) + " = " + String.format("%02d", ans) + " ||");
			}
			// 改行
			System.out.println();
		}
	}

}