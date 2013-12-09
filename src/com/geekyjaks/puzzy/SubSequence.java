package com.geekyjaks.puzzy;

public class SubSequence {

	public String get(String data) {
		if (data == null || data.isEmpty() || data.length() == 1)
			return null;

		int seqStart = 0, length = 0;

		int start = -1, last = -1, pos = 0;
		char first = data.charAt(0);
		boolean zeroed = false;

		for (int index = 0; index < data.length(); index++) {

			if (start == -1) {
				if (data.charAt(index) != first)
					continue;

				start = index;
				pos = 0;
			}
			
			System.out.println(index + ", p: " + pos + ", last: " + last + ", s: " + start + ", len: " + length);

			if (data.charAt(index) == first)
				pos++;
			else {
				pos--;
				if (pos >= 0) {
					last = index;
					if (pos == 0)
					zeroed = true;
				} else if (pos < 0) {
					if (length < (last - start)) {
						// sequence is big. so set the results
						seqStart = start;
						// array is zero index based. so +1
						length = last - start + 1;
					}
					start = -1;
				}
			}
		}

		System.out.println( ", p: " + pos + ", last: " + last + ", s: " + start + ", len: " + length);

		if (!zeroed){
			if (pos == data.length()){
				System.out.println("Invalid Sequence");
			}else{
				pos = 2 * pos - data.length();
				
			}
		}
		
		System.out.println( ", p: " + pos + ", last: " + last + ", s: " + start + ", len: " + length);

		if (start >=0 && length < (last - start)) {
			// sequence is big. so set the results
			seqStart = start;
			// array is zero index based. so +1
			length = last - start + 1;
		}
		

		System.out.println(seqStart + ", " + length);
		return data.substring(seqStart, seqStart + length);
	}

	public static void main(String[] args) {
		SubSequence sub = new SubSequence();
		System.out.println(sub.get("110110"));
	}
}
