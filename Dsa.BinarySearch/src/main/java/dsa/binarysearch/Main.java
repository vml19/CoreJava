package dsa.binarysearch;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        var a = new int[]{3, 10, 15, 4, 2, 0, 100, 400,-3,-1,-100};
        Arrays.sort(a);
        int key = 2;
        var keyIndex = BinarySearch.searchForKey(a, 0, a.length - 1, key);
        System.out.format("Key %s found at index --> %S", key, keyIndex);

        BinaryTree binaryTree = new BinaryTree();
        //Populate tree
        for (int i : a) {
            binaryTree.add(i);
        }
        //Search tree
        var isKeyFound = binaryTree.searchKey(key);
        System.out.format("Does the key %s found --> %S", key, isKeyFound);
    }
}

