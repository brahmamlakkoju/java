import java.util.Scanner;

public class StringsEx {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("Enter the String");
String str=s.next();
String rev="";
for (int i=str.length()-1;i>=0;i--) {
	rev=rev+str.charAt(i);
}
if (str.equals(rev)) {
	System.out.println("Palindrome");
}else {
	System.out.println("Not palindrome");
}

	}

}
