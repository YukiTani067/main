package introduction;

public class Person {
	
	// クラスフィールドを定義
	public static int count = 0;
	
	// インスタンスフィールド定義
	public String name;
	public int age;
	public double height;
	public double weight;

	Person(String name, int age, double height, double weight) {
		// クラスフィールドcountに1をプラス
		Person.count++;
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	public double bmi() {
		return this.weight / this.height / this.height;
	}

	public void print() {
		System.out.println("名前は" + this.name + "です");
		System.out.println("年は" + this.age + "です");
	}
	public static void printCount() {
		System.out.println("合計" + Person.count + "人です");
		}
}
