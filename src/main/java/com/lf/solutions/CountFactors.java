package com.lf.solutions;

public class CountFactors {

    public int solution(int N) {
        // write your code in Java SE 8

        int count = 0;

        for (int i = 1; i <= Math.sqrt(N); i++) {
            if (N%i == 0) {
                if ( i*i == N) count ++;
                else {
                    count = count +2;
                }

            }
        }

        return count;
    }

    public static void main(String[] args) {

        CountFactors equiLeader = new CountFactors();
        int[] a = {-1};
        System.out.println(equiLeader.solution(9));

    }
}
