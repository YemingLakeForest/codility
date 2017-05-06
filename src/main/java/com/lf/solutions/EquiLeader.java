package com.lf.solutions;

import java.util.Arrays;

public class EquiLeader {

    public int solution(int[] A) {


        int count = 0;

        for (int i=0; i<A.length -1; i++) {

            int leader1 = leader(Arrays.copyOfRange(A, 0, i+1));
            int leader2 = leader(Arrays.copyOfRange(A, i + 1, A.length));
            if (leader1 == leader2 && (leader1 != Integer.MAX_VALUE )) {
                count++;
            }
        }

        // write your code in Java SE 8
        return count;
    }

    private int leader(int[] array){
        Arrays.sort(array);
        if (array.length == 1) {
            return array[0];
        } else if (array.length%2 == 0){
            int leader1 = array[array.length/2];
            int leader2 = array[array.length/2-1];

            if (leader1 == leader2) {
                return leader1;
            } else {
                return Integer.MAX_VALUE;
            }

        } else {
            return array[array.length/2];
        }
    }


    public static void main(String[] args) {

        EquiLeader equiLeader = new EquiLeader();
        int[] a = {4,3,4,4,4,2};
        System.out.println(equiLeader.solution(a));

    }
}
