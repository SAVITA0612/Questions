package com;

public class Suggestion {
	public static void main(String args[]) {
		Tree tree = new Tree();
		String dictionary[] = { "suggestion", "straightforward", "straight" };
		tree.insertIntoTree(dictionary);
		String query = "sug";
		tree.displayWords(query);
	}
}
