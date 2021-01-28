package com;

public class LongestPalinSubstring {

	public static int longestPalinSubstr(String str) {
		if (str == null)
			throw new IllegalStateException("Input string is null or empty");
		if(str.isEmpty())
			return 0;
		int maxLength = 1;
		if (!str.isEmpty()) {
			int start = 0;
			int len = str.length();
			int low, high;
			for (int i = 1; i < len; ++i) {
				low = i - 1;
				high = i;
				while (low >= 0 && high < len && (str.charAt(low) == str.toLowerCase().charAt(high))) {
					if (high - low + 1 > maxLength) {
						start = low;
						maxLength = high - low + 1;
					}
					--low;
					++high;
				}

				low = i - 1;
				high = i + 1;
				while (low >= 0 && high < len && str.charAt(low) == str.charAt(high)) {
					if (high - low + 1 > maxLength) {
						start = low;
						maxLength = high - low + 1;
					}
					--low;
					++high;
				}
			}
			System.out.println(str.substring(start, start + maxLength));
		}
		return maxLength;
	}

	public static void main(String[] args) {
		String str = "HelloWelcomeemoclewHelloolle";
		longestPalinSubstr(str);
	}
}