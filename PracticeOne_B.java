public class PracticeOne_B {

	public static void main(String[] args) {

		String file = "readme.txt";
		String folder = "c:\\user\\";

		StringBuilder sb = new StringBuilder();

		if (folder.endsWith("\\")) {
			sb.append(folder);
			sb.append(file);
		} else {
			sb.append(folder);
			sb.append("\\");
			sb.append(file);
		}
		String s = sb.toString();

		System.out.println(s);

	}

}
