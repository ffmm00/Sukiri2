import java.util.ArrayList;
import java.util.List;

public class PracticeTwo_A {

	public static void main(String[] args) {
		PratciceTwoHero h1 = new PratciceTwoHero("斉藤");
		PratciceTwoHero h2 = new PratciceTwoHero("鈴木");

		List<PratciceTwoHero> heroes = new ArrayList<PratciceTwoHero>();

		heroes.add(h1);
		heroes.add(h2);

		for (PratciceTwoHero h : heroes) {
			System.out.println(h.getName());
		}

	}

}
