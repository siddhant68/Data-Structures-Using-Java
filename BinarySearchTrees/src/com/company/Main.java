package com.company;

public class Main {

    public static void main(String[] args) {
        Tree intTree = new Tree();
        intTree.insert(25);
        intTree.insert(20);
        intTree.insert(15);
        intTree.insert(27);
        intTree.insert(30);
        intTree.insert(29);
        intTree.insert(26);
        intTree.insert(22);
        intTree.insert(32);
        intTree.insert(17);
        intTree.traverseInOrder();

        System.out.println();
        intTree.get(27);
        intTree.get(15);
        intTree.get(8888);

        System.out.println(intTree.max());
        System.out.println(intTree.min());

        intTree.delete(25);
        intTree.traverseInOrder();
        System.out.println();
        System.out.println(intTree.height());
    }
}
