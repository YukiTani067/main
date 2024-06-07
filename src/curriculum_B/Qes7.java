package curriculum_B;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Qes7 {
	/*-------------------------------------------------------------------------							
	[概要] 問題7の解答							
	-------------------------------------------------------------------------*/
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("生徒の人数を入力してください(2以上)：");
		int n = scanner.nextInt();
		scanner.nextLine();

		//生徒のリストを作成
		List<Student> list = new ArrayList<>();
		//入力された人数分の処理を実施
		for (int i = 0; i < n; i++) {
			System.out.print((i + 1) + "人目の英語の点数を入力してください：");
			int eng = scanner.nextInt();
			scanner.nextLine();

			System.out.print((i + 1) + "人目の数学の点数を入力してください：");
			int sug = scanner.nextInt();
			scanner.nextLine();

			System.out.print((i + 1) + "人目の理科の点数を入力してください：");
			int rik = scanner.nextInt();
			scanner.nextLine();

			System.out.print((i + 1) + "人目の社会の点数を入力してください：");
			int syk = scanner.nextInt();
			scanner.nextLine();

			//リストにデータを追加
			list.add(new Student(i + 1, eng, sug, rik, syk));
			System.out.println();
		}
		//平均点出力のメソッド参照
		list.forEach(Student::avg2);
		System.out.println();
		//各教科の平均点を出力
		System.out.printf("英語の平均点は%.2f点です。%n", list.stream().mapToInt(Student::eng).average().getAsDouble());
		System.out.printf("数学の平均点は%.2f点です。%n", list.stream().mapToInt(Student::sug).average().getAsDouble());
		System.out.printf("理科の平均点は%.2f点です。%n", list.stream().mapToInt(Student::rik).average().getAsDouble());
		System.out.printf("社会の平均点は%.2f点です。%n", list.stream().mapToInt(Student::syk).average().getAsDouble());
		System.out.printf("全体の平均点は%.2f点です。%n", list.stream().mapToDouble(Student::avg).average().getAsDouble());
		scanner.close();
	}

	//クラス宣言
	public record Student(int cnt, int eng, int sug, int rik, int syk) {
		public int sum() {
			return eng + sug + rik + syk;
		}

		//平均点の計算
		public double avg() {
			return sum() / 4.0;
		}

		//平均点の出力
		public void avg2() {
			System.out.printf("%d人目の平均点は%.2f点です。%n", cnt, avg());
		}
	}

}