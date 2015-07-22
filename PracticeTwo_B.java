import java.util.HashMap;
import java.util.Map;

public class PracticeTwo_B {

	public static void main(String[] args) {

		PratciceTwoHero h1 = new PratciceTwoHero("斉藤");
		PratciceTwoHero h2 = new PratciceTwoHero("鈴木");

		Map<PratciceTwoHero, Integer> heroes = new HashMap<PratciceTwoHero, Integer>();

		heroes.put(h1, 3);
		heroes.put(h2, 7);

		for (PratciceTwoHero key : heroes.keySet()) {
			int value = heroes.get(key);
			System.out.println(key.getName() + "が倒した敵は" + value);

		}

	}

}
