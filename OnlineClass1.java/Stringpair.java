
import java.util.Scanner;

class Stringpair {
	public static void pair(int[] a, int count) {
		int sum = 0;
		String s = new String();
		for (int i = 0; i < a.length - 1; i++) {
			// start from i'th element till last element
			for (int j = i + 1; j < a.length; j++) {
				// if desired sum is found, print it and return
				if (a[i] + a[j] == count) {
					sum++;
				}
			}
		}
		if (sum == 0)
			s = "zero";
		if (sum == 1)
			s = "one";
		if (sum == 2)
			s = "two";
		if (sum == 3)
			s = "three";
		if (sum == 4)
			s = "four";
		if (sum == 5)
			s = "five";
		if (sum == 6)
			s = "six";
		if (sum == 7)
			s = "seven";
		if (sum == 8)
			s = "eight";
		if (sum == 9)
			s = "nine";
		System.out.println(s);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		int[] a = new int[n];
		String[] str = new String[n];
		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		sc.close();
		for (int i = 0; i < n; i++) {
			if (a[i] == 0)
				str[i] = "zero";
			if (a[i] == 1)
				str[i] = "one";
			if (a[i] == 2)
				str[i] = "two";
			if (a[i] == 3)
				str[i] = "three";
			if (a[i] == 4)
				str[i] = "four";
			if (a[i] == 5)
				str[i] = "five";
			if (a[i] == 6)
				str[i] = "six";
			if (a[i] == 7)
				str[i] = "seven";
			if (a[i] == 8)
				str[i] = "eight";
			if (a[i] == 9)
				str[i] = "nine";
		}
		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < str[i].length(); j++) {
				if (str[i].charAt(j) == 'a' || str[i].charAt(j) == 'e' || str[i].charAt(j) == 'i'
						|| str[i].charAt(j) == 'o' || str[i].charAt(j) == 'u')
					count++;
			}
		}
		pair(a, count);
	}
}