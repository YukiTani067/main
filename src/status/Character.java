package status;

import java.util.Random;

// スーパークラス
public class Character {
	// 変数を定義
	private String name;
	private int HP;
	private int MP;
	private int Atk;
	private int Spd;
	private int Def;

	// 数値をランダムに取得
	public Character() {
		Random rand = new Random();
		HP = rand.nextInt(999);
		MP = rand.nextInt(999);
		Atk = rand.nextInt(999);
		Spd = rand.nextInt(999);
		Def = rand.nextInt(999);
	}

	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		// 文字列を結合
		sb.append("こんにちは 「");
		sb.append(getname());
		sb.append(" 」 さん");
		sb.append(System.lineSeparator());
		sb.append("ステータス");
		sb.append(System.lineSeparator());
		sb.append("HP：");
		sb.append(HP);
		sb.append(System.lineSeparator());
		sb.append("MP：");
		sb.append(MP);
		sb.append(System.lineSeparator());
		sb.append("攻撃力：");
		sb.append(Atk);
		sb.append(System.lineSeparator());
		sb.append("素早さ：");
		sb.append(Spd);
		sb.append(System.lineSeparator());
		sb.append("防御力：");
		sb.append(Def);
		sb.append(System.lineSeparator());
		sb.append(System.lineSeparator());
		sb.append("さあ冒険に出かけよう！");
		return sb.toString();
	}
}
