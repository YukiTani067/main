package introduction;

public class Person {
	// 問題①インスタンスフィールドを定義
	public String name;
	public int age;
	public double height;
	public double weight;
	int count = 0;
	
	// 問題②、③、④コンストラクタを定義しインスタンスフィールドに値をセット
	Person(String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	// 問題⑥、⑦インスタンスメソッドbmiを定義
	public double bmi() {
		double bmi = this.weight / (this.height * this.height);
		return bmi;
		}

	// 問題⑧インスタンスメソッドprintを定義
	public void print() {
		System.out.println("名前" + this.name + "です");
		System.out.println("年は" + this.age + "です");
		System.out.println("BMIは" + String.format("%.1f", bmi()) + "です");
		count++;
	}

}
