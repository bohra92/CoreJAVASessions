package logicalSession;

import java.util.Iterator;

class Solution {

	public static void main(String[] args) {

		Solution sol = new Solution();
		System.out.println(sol.subString("s", "sad"));
	}

	public int subString(String haystack, String needle) {
		int occuranceIndex = -1;

		for (int i = 0; i < haystack.length(); i++) {
			if (haystack.charAt(i) == needle.charAt(0)) {
				if (needle.length() <= (haystack.length() - i)) {
					if (haystack.substring(i, i + needle.length()).equals(needle)) {
						occuranceIndex = i;
						break;
					}

				} else {
					break;
				}

			}
		}

		return occuranceIndex;

	}
}
