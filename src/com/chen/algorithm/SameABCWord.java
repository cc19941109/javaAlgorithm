package com.chen.algorithm;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class SameABCWord {
	private static final int MAXWORDSCOUNT = 4;
	private int wordscount = 0;
	private WordSignVal[] words = new WordSignVal[SameABCWord.MAXWORDSCOUNT];
	private Map<String, HashSet<String>> signToValues = new HashMap<String, HashSet<String>>();

	public void receiveWords() {
		BufferedReader stdin = new BufferedReader(new InputStreamReader(
				System.in));
		for (int i = 0; i < SameABCWord.MAXWORDSCOUNT; i++) {
			System.out.print("请输入第" + (i + 1) + "个单词:");

			try {
				this.words[i] = new WordSignVal();
				this.words[i].setValue(stdin.readLine());
				this.wordscount++;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// System.out.println(this.words[i].getValue() + " "+
			// this.words[i].getSign());
		}
	}

	public void antoSetWords() {
		this.wordscount = SameABCWord.MAXWORDSCOUNT;
		this.words[0] = new WordSignVal();
		this.words[0].setValue("ifse");
		this.words[1] = new WordSignVal();
		this.words[1].setValue("acbd");
		this.words[2] = new WordSignVal();
		this.words[2].setValue("dbca");
		this.words[3] = new WordSignVal();
		this.words[3].setValue("seif");
	}

	public void createAnagramSet() {
		int wordsIndex = 0;
		while (wordsIndex < this.wordscount) {
			HashSet<String> values = new HashSet<String>();
			String sign = this.words[wordsIndex].getSign();
			do {
				values.add(this.words[wordsIndex].getValue());
				++wordsIndex;
			} while (wordsIndex < this.wordscount
					&& this.words[wordsIndex].getSign().equals(sign));
			this.signToValues.put(sign, values);
		}
	}

	public void printAnagramSet() {
		Set<String> signSet = this.signToValues.keySet();
		String sign;
		for (Iterator<String> y = signSet.iterator(); y.hasNext();) {
			sign = y.next();
			HashSet<String> values = this.signToValues.get(sign);
			System.out.print(sign + "	:");
			System.out.println(values);
		}
	}

	public void olderByWordSign() {

		for (int i = 0; i < this.wordscount; i++) {
			for (int j = i + 1; j < this.wordscount; j++) {
				if (this.words[i].getSign().compareTo(this.words[j].getSign()) > 0) {
					this.swapTwoWordsPlace(i, j);
				}
			}
		}
		for (int i = 0; i < this.wordscount; i++) {
			System.out.println(this.words[i].getSign() + "	"
					+ this.words[i].getValue());
		}
	}

	public void swapTwoWordsPlace(int m, int n) {
		WordSignVal wv;
		wv = this.words[m];
		this.words[m] = this.words[n];
		this.words[n] = wv;
		// System.out.println(this.words[m].getValue());
		// System.out.println(this.words[n].getValue());
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SameABCWord anagram = new SameABCWord();
		// anagram.receiveWords();
		// anagram.swapTwoWordsPlace(0, 1);
		anagram.antoSetWords();
		anagram.olderByWordSign();
		anagram.createAnagramSet();
		anagram.printAnagramSet();
	}

	public int getWordscount() {
		return wordscount;
	}
}

class WordSignVal {
	private String sign;
	private String value = "dacb";

	public WordSignVal() {

	}

	public WordSignVal(String value) {
		this.value = value;
		this.valToSign();
	}

	private void valToSign() {
		char[] chararray = value.toCharArray();
		Arrays.sort(chararray);
		this.sign = new String(chararray);
		// System.out.println(sign);
	}

	public String getSign() {
		return sign;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
		this.valToSign();
	}

}
