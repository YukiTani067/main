package introduction;

public class Main {

	public static void main(String[] args) {
		// 問題⑤引数にweightの60を入れる
		Person person1 = new Person("鈴木太郎", 20, 1.7, 60);

		System.out.println(person1.name);
		System.out.println(person1.age);
		System.out.println(person1.height + "\n");

		// 問題⑨printメソッドの中でthisを用いて「名前は〇〇です」,「年は〇〇です」「BMIは○○です」と出力
		person1.print();
		
		// 問題⑩人数の合計を「合計○人です」と出力
		System.out.println("合計"+person1.count+"人です");
	}

}
