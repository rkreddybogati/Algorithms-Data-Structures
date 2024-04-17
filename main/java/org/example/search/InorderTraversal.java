package org.example.search;

import java.util.ArrayList;
import java.util.List;

public class InorderTraversal {

    static class Node {
        int data;
        Node left, right;
        Node(int item)    {
            data = item;
            left = right = null;
        }
    }

    // Function to return a list containing the inorder traversal of the tree.
    ArrayList<Integer> inOrder(Node root) {
        // Code
        ArrayList<Integer> list = new ArrayList<>();
        if(root==null) {
            return list;
        }

        inOrderTraversal(root, list);
        return list;
    }

    private void inOrderTraversal(Node root, List list) {
        if(root==null) {
            return;
        }
        inOrderTraversal(root.left, list);
        list.add(root.data);
        inOrderTraversal(root.right, list);
    }


}
