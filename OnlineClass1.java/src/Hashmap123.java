import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Hashmap123 {
	public static void findpair(int[] a, int count) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < a.length; i++) {
			if (map.containsKey(count - a[i])) {
				System.out.println(map.get(count - a[i]) + " " + i);
			}
			map.put(a[i], i);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		sc.close();
		String[] str = new String[n];
		for (int i = 0; i < n; i++) {
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
			if (a[i] == 0)
				str[i] = "zero";
		}
		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < str[i].length(); j++) {
				if (str[i].charAt(j) == 'a' || str[i].charAt(j) == 'e' || str[i].charAt(j) == 'i'
						|| str[i].charAt(j) == 'o' || str[i].charAt(j) == 'u')
					count++;
			}
		}
		System.out.println("count " + count);
		findpair(a, count);
	}

}
