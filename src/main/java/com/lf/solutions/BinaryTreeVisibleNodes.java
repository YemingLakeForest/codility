package com.lf.solutions;

public class BinaryTreeVisibleNodes {

    public int solution(Tree T) {
        // write your code in Java SE 8
        if (T == null) {
            return 0;
        }

        return traverse(T, Integer.MIN_VALUE);

    }

    private int traverse(Tree t, int maxValue) {
        int count = 0;

        if (t == null) {
            return 0;
        }

        if (t.x > maxValue) {
            count ++;
            maxValue = t.x;
        }

        count += traverse(t.l, maxValue);
        count += traverse(t.r, maxValue);

        return count;

    }


    public static void main(String[] args) {
        BinaryTreeVisibleNodes binaryTreeVisibleNodes = new BinaryTreeVisibleNodes();

        Tree tree = new Tree();

        tree.x = 5;

        Tree tree3 = new Tree();
        tree3.x = 3;

        Tree tree10 = new Tree();
        tree10.x = 10;

        Tree tree1 = new Tree();
        tree1.x = 1;

        Tree tree20 = new Tree();
        tree20.x = 20;

        Tree tree21 = new Tree();
        tree21.x = 21;

        tree.l = tree3;
        tree.r = tree10;
        tree10.l = tree1;
        tree3.l = tree20;
        tree3.r = tree21;


        System.out.println(binaryTreeVisibleNodes.solution(tree));
    }


    static class Tree {
        public int x;
        public Tree l;
        public Tree r;
    }


}
