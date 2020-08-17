
public class MutableStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello";
		System.out.println(str.concat(" world"));
		System.out.println(str);
		// strings are immutable
		// using stringbuffer and stringbuilders we can modify the strings
		StringBuffer str1 = new StringBuffer("hello");
		str1.append(" world");
		System.out.println(str1);
		// stringBuffer is Thread-safe and Synchronised
		StringBuilder str2 = new StringBuilder("Hello");
		str2.append(" world.");
		System.out.println(str2);
		// but StringBuilder is not Thread-Safe

	}

}
