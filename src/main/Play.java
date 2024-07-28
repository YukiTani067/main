
package main;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import database.Prefectures;

public class Play {
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("表示したい件数を0～10で,区切りで入力してください");
		Record[] records = Prefectures.createRecords();
		
		List<Integer> numList = Arrays.stream(scanner.nextLine().split(",")).mapToInt(Integer::parseInt).boxed()
				.toList();
		System.out.println("昇順か降順どちらかを入力してください");
		Comparator<Record> comparator = getComparator(scanner.nextLine());
		if (comparator != null) {
			Arrays.stream(records).filter(r -> numList.contains(r.num())).sorted(comparator)
					.forEach(System.out::println);
		}

	}
	
	// 	昇順、降順に調整するメソッド
	public static Comparator<Record> getComparator(String ascOrDesc) {
		return "昇順".equals(ascOrDesc) ? (r1, r2) -> r1.num() - r2.num()
				: "降順".equals(ascOrDesc) ? (r1, r2) -> r2.num() - r1.num() : null;

	}

	// 表示形式の調整
	public record Record(int num, String pre, String city, int area) {
		@Override
		public String toString() {
			return String.format("都道府県名:%s%n県庁所在地:%s%n面積:%d.0km2%n", pre, city, area);
		}
	}
}