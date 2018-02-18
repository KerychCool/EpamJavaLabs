public class lab2_6 {
	public static void main(String[]args) {
		String s = "Hello ";
		Storage(s);
		String s2 = "world";
		Storage2(s2);
		System.out.println(Storage(s) + Storage2(s2));
	}
	public static String Storage (String s) {
		return s;
	}
	public static String Storage2 (String s2) {
		return s2;
	}
}
