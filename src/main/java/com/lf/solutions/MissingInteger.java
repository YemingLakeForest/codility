package com.lf.solutions;

import java.util.Arrays;

public class MissingInteger {

    public int solution(int[] A) {
        // write your code in Java SE 8
        Arrays.sort(A);

        for (int i=0; i<A.length -1; i++) {
            if (A[i+1] > A[i] + 1) {
                return A[i] + 1;
            }
        }

        return A[A.length-1]+1;
    }

    public static void main(String[] args) {
        int[] p = {-1,-2,-5,-2};

        System.out.println(new MissingInteger().solution(p));
    }

}
