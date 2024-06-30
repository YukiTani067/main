package execution;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import process.Index;

public class Play {
	
	public static void main(String[] args) {
	// Indexクラスを呼び出して変数に代入コンソールに出力
	Index index = new Index();
	System.out.println(index.Word1);
	System.out.println(index.Word2);
	System.out.println(index.Word3);
	
	// 現在時刻を取得
	LocalDateTime localDateTime = LocalDateTime.now();
	
	// 表示形式の調整
	DateTimeFormatter now =
			DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
	String formatNowDate = now.format(localDateTime);
	
	System.out.println("今の現在時刻は"+formatNowDate+"です");
}
}
