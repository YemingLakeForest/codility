package com.lf.solutions;

public class MaxSliceSum {

    public int solution(int[] A) {


        int count = 0;

        for (int i=0; i < A.length; i++) {
            int sum = 0;
            for (int ii=i; ii< A.length; ii ++) {
                sum += A[ii];
                count = Math.max(sum, count);
            }
        }


        return count;
    }



    public static void main(String[] args) {

        MaxSliceSum equiLeader = new MaxSliceSum();
        int[] a = {3,2,-6,4,0};
        System.out.println(equiLeader.solution(a));

    }
}
