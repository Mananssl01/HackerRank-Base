package com.test.hackerrank.others;
// class to finf LCA in BInary search tree. Note that time taken for finding in LCA in BST is lg(n), as opposed to O(n) 
// in binary tree as in BST we only consider one subtree to LCA , not both.


import java.util.*;
import java.io.*;

class Node {
    Node left;
    Node right;
    int data;
    
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class Solution {

	
    class Node 
    {
    	int data;
    	Node left;
    	Node right;
    }
	
	public static Node lca(Node root, int v1, int v2) {
      	// base case, assuming that both the ints are present in the tree.
          if(root==null)
            return null;
        /* if root data is between v1 and v2, means v1 is present in left subtree and v2  is present in right subtree or vice-versa, in which case , root is LCA*/
          if((root.data>=v1 && root.data<=v2) || (root.data<=v1 && root.data>=v2) )
               return root;
        // else if both ints are less than root, means LCA must in left subtree,otherwise in right sub tree
        if(root.data>=v1 && root.data>=v2)
            return lca(root.left,v1,v2);
        else
            return lca(root.right,v1,v2);

    }

	public static Node insert(Node root, int data) {
        if(root == null) {
            return new Node(data);
        } else {
            Node cur;
            if(data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
      	int v1 = scan.nextInt();
      	int v2 = scan.nextInt();
        scan.close();
        Node ans = lca(root,v1,v2);
        System.out.println(ans.data);
    }	
}
