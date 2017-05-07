package com.lf.solutions;

public class MonkeyJumps {

    public int solution(int[] A, int D) {
        // write your code in Java SE 8

        if (D > A.length) {
            return 0;
        }

        int minTime = Integer.MAX_VALUE;

        for (int i=0; i<D; i++) {
            System.out.println("i in D is: " + i);
            int time = 0;
            for (int j=i; j<A.length; j+=D) {
                System.out.println("Next position is: " + j);
                if (A[j] == -1) {
                    time = -1;
                } else {
                    time = Math.max(time, A[j]);
                }
            }
            minTime = Math.min(minTime, time);
        }


        return minTime;
    }

    public static void main(String[] args) {
        MonkeyJumps monkeyJumps = new MonkeyJumps();

        int[] a = {3,2,1};
        int d = 1;

        System.out.println(monkeyJumps.solution(a, d));
    }

}
