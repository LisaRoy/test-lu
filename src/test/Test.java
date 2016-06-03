package test;

import java.text.DecimalFormat;
import java.util.List;

public class Test {

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String... args) throws Exception {
		Double a = 789.9234d;
		Double q = 789.92340d;
		DecimalFormat df = new DecimalFormat("##########0.00");
		String b = a + "";

		Double ll = Math.floor(a);

		/*
		 * String c = b.substring(0, b.lastIndexOf(".") + 3); String d =
		 * b.substring(b.lastIndexOf(".") + 3);
		 */
		System.out.println((a - q) == 0);
		System.out.println(ll);
		System.out.println(b.lastIndexOf("."));
		// Long nu = Long.parseLong(d);
		// Double do1 = Double.parseDouble(c);
		// if (nu > 0) {
		// do1 += 0.01;
		// }
		// System.out.println(do1);
		// System.out.println(d);

	}

	// private static void test() {
	// int i = 1;
	// for (;;) {
	// final String finalString = "阻塞";
	// i++;
	// if ( i>10 ) {
	// break;
	// }
	// System.out.println(i + finalString);
	// }
	// }

	public void iterableToList() {
	}

	public List<String> getList() {
		return (List<String>) this.getIterable();
	}

	public Iterable<String> getIterable() {

		return null;

	}

}
