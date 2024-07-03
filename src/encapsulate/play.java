package encapsulate;

public class play {
	private String caption = null;
	
	public static void main(String[] args) {
		play word = new play();
		word.setCaption("""
				動物名:ライオン
				体長:2.1m
				速度:80km/h
				""");
		System.out.println(word);
	}
	
	// 変数から値を取得するメソッド
	public String getCaption() {
		return caption;
	}

	// 変数を変更するメソッド
	public void setCaption(String caption) {
		this.caption = caption;
	}
	
	// 文字列に変換するメソッド
	@Override
	public String toString() {
		return getCaption();	}
}
