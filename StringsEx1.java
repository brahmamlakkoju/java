
public class StringsEx1 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("code");
		sb.append(12);
		sb.append(23.78);
		sb.append("gnan");
		System.out.println(sb);
		String s1 = new String("code");
		s1 = s1.concat("123");
		System.out.println(s1);
		String s3 = "code";
		s3 = s3 + 123;
		s3 = s3 + true;
		System.out.println(s3);

	}

}
