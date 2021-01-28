package com;

public class Tree {
	TreeNode root;

	public void insertIntoTree(String contacts[]) {
		root = new TreeNode();
		int n = contacts.length;
		for (int i = 0; i < n; i++) {
			insert(contacts[i]);
		}
	}

	public void insert(String s) {
		int len = s.length();
		TreeNode itr = root;
		for (int i = 0; i < len; i++) {
			TreeNode nextNode = itr.child.get(s.charAt(i));
			if (nextNode == null) {
				nextNode = new TreeNode();
				itr.child.put(s.charAt(i), nextNode);
			}
			itr = nextNode;
			if (i == len - 1)
				itr.isLast = true;
		}
	}

	public void displayWordsUtil(TreeNode curNode, String prefix) {
		if (curNode.isLast)
			System.out.println(prefix);
		for (char i = 'a'; i <= 'z'; i++) {
			TreeNode nextNode = curNode.child.get(i);
			if (nextNode != null) {
				displayWordsUtil(nextNode, prefix + i);
			}
		}
	}

	void displayWords(String str) {
		if (str == null)
			throw new IllegalStateException("Input query is null");
		if (str.isEmpty()) {
			System.out.println("Input query is empty");
			return;
		}
		TreeNode prevNode = root;
		String prefix = "";
		int len = str.length();
		int i;
		for (i = 0; i < len; i++) {
			prefix += str.charAt(i);
			char lastChar = prefix.charAt(i);
			TreeNode curNode = prevNode.child.get(lastChar);
			if (curNode == null) {
				System.out.println("No Results Found for " + prefix + "");
				i++;
				break;
			}
			System.out.println("Suggestions based on " + prefix + " are");
			displayWordsUtil(curNode, prefix);
			prevNode = curNode;
		}

		for (; i < len; i++) {
			prefix += str.charAt(i);
			System.out.println("No Results Found for " + prefix + "");
		}
	}
}
