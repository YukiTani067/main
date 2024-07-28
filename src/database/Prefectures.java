package database;

import java.util.List;

import main.Play.Record;

public class Prefectures {
	// 配列を作成するメソッド
	public static Record[] createRecords() {
		int num = 0;
		List<Record> records = List.of(new Record(num++, "北海道", "札幌市", 83424), new Record(num++, "青森県", "青森市", 9646),
				new Record(num++, "岩手県", "盛岡市", 15275), new Record(num++, "宮城県", "仙台市", 7282),
				new Record(num++, "秋田県", "秋田市", 11638),
				new Record(num++, "山形県", "山形市", 9323), new Record(num++, "福島県", "福島市", 13784),
				new Record(num++, "茨城県", "水戸市", 6097),
				new Record(num++, "栃木県", "宇都宮市", 6408), new Record(num++, "群馬県", "前橋市", 6362),
				new Record(num++, "埼玉県", "さいたま市", 3798));
		return records.toArray(Record[]::new);
	}
	}

