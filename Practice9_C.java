import java.util.ArrayList;

public class Practice9_C {

	public static void main(String[] args) {

		System.out.println("1円以上のアイテム一覧表を表示します");
		ArrayList<Practice9_A> items = Practice9_B.findByMinimumPrice(1);

		for (Practice9_A item : items) {
			System.out.printf("%10s%4d%4d", item.getName(), item.getPrice(),
					item.getWeight());
		}

	}

}
