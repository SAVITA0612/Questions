package com;

import java.util.HashMap;

public class TreeNode {
	HashMap<Character, TreeNode> child;
	boolean isLast;
	public TreeNode() {
		child = new HashMap<Character, TreeNode>();
		for (char i = 'a'; i <= 'z'; i++)
			child.put(i, null);
		isLast = false;
	}
}
