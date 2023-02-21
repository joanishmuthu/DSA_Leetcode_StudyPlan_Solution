package com.leetcode75;

public class Anagram {
	public static boolean isAnagram(String s, String t) {
		String[] s1 = s.split("");
		String[] t1 = t.split("");
		Boolean res = true;
		if (s1.length < t1.length) {
			res = isAnagram(t, s);
			return res;
		} else {
			for (int i = 0; i < s1.length; i++) {
				int acount = 1;
				int bcount = 0;
				for (int j = 0; j < s1.length; j++) {
					if (i != j) {
						if (s1[i].equals(s1[j])) {
							acount++;
						}
					}
				}
				for (int k = 0; k < t1.length; k++) {
					if (t1[k].equals(s1[i])) {
						bcount++;
					}
				}
				if (acount != bcount) {
					res = false;
				}
			}
			return res;
		}
	}

	public static void main(String[] args) {
		System.out.println(isAnagram("a", "ab"));
	}
}
