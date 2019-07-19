// the following class tells whether a given binary tree is Binary Search Tree or NOT ?

package com.test.hackerrank.others;


public class TestBST {
    Node root;

    boolean isBST()  {
        return isBSTUtil(root, Integer.MIN_VALUE,
                Integer.MAX_VALUE);
    }
    boolean isBSTUtil(Node node, int min, int max)
    {
        /* an empty tree is BST */
        if (node == null)
            return true;

        /* false if this node violates the min/max constraints */
        if (node.data < min || node.data > max)
            return false;

        /* otherwise check the subtrees recursively
        tightening the min/max constraints */
        // Allow only distinct values
        return (isBSTUtil(node.left, min, node.data-1) &&
                isBSTUtil(node.right, node.data+1, max));
    }


    public static void main(String[] args) {
        TestBST tree = new TestBST();
        tree.root = new Node(4);
        tree.root.left = new Node(2);
        tree.root.right = new Node(5);
        tree.root.left.left = new Node(1);
        tree.root.left.right = new Node(3);

        if (tree.isBST())
            System.out.println("Valid");
        else
            System.out.println("Invalid");

    }
}

class Node
{
    int data;
    Node left, right;

    public Node(int item)
    {
        data = item;
        left = right = null;
    }
}
// end of file
