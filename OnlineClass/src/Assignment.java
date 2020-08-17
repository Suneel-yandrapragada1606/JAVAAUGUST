
public class Assignment {

	public static void main(String[] args) {
		System.out.println("Solution of Assignment1");
		System.out.println("Using Hashcodes printing my name in Regional Language");
		// My name is "SUNEEL" and my Regional Language is "TELUGU" from
		// AndhraPradesh
		char ch = '\u0C38';
		char ch1 = '\u0C41';
		System.out.print(ch);
		System.out.print(ch1);
		char ch2 = '\u0C28';
		char ch3 = '\u0C40';
		System.out.print(ch2 + "" + ch3);
		char ch4 = '\u0C32';
		char ch5 = '\u0C4D';
		System.out.print(ch4 + "" + ch5);
		System.out.println();
		System.out.println();
		System.out.println("Practicing with Bitwise Operators");
		int x = 4, y = 8;
		// now comes to bitwise operators
		// 4--0100 and 8--1000
		// for this and(&) operation is 0000
		// for this or(|) operation is 1100
		// for this xor(^) operation is 1100 ....xor(0^0=0,1^1=0,0^1=1,1^0=1)
		System.out.println("Bitwise Operators for numbers " + x + " and " + y);
		System.out.print("solution for & operator :");
		System.out.println(x & y);
		System.out.print("Solution for | operator :");
		System.out.println(x | y);
		System.out.print("Solution for ^ operator :");
		System.out.println(x ^ y);
		System.out.println();
		System.out.println();

		int x1 = -4, x2 = -8;
		System.out.println(" Shift Opearators " + x1 + " and " + x2);
		System.out.print("Applying Left Shift for Negetive Numbers : ");
		System.out.println(x1 << x2);
		System.out.print("Applying Right Shift for Negative Numbers : ");
		System.out.println(x1 >> x2);
		System.out.println();
		System.out.println();
	}

}
