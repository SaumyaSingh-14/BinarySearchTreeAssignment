package main;

import implementation.MyBinarySearchTree;

public class MyMain {
    public static void main(String[] args) {
        //create binary search tree
        MyBinarySearchTree<Integer> myBinarySearchTree = new MyBinarySearchTree<>();
        myBinarySearchTree.insert(54);
        myBinarySearchTree.insert(8);
        myBinarySearchTree.insert(14);
        myBinarySearchTree.insert(98);
        myBinarySearchTree.insert(34);
        myBinarySearchTree.insert(65);
        // and perform insert, search, traversal, delete
        myBinarySearchTree.inOrder(myBinarySearchTree.getRoot());
        myBinarySearchTree.delete(8);
        myBinarySearchTree.inOrder(myBinarySearchTree.getRoot());
        System.out.println(myBinarySearchTree.search(14));
    }
}
