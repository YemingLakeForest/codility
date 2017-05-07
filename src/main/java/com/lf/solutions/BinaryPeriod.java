package com.lf.solutions;

public class BinaryPeriod {

    int solution(int n) {
        int[] d = new int[30];
        int l = 0;
        int p;
        while (n > 0) {
            d[l] = n % 2;
            n /= 2;
            l++;
        }
        for (p = 1; p < 1 + l; ++p) {
            int i;
            boolean ok = true;
            for (i = 0; i < l - p; ++i) {
                System.out.println("at " +  i + " : " + d[i]);
                System.out.println("at " +  (i + p) + " : " + d[i+p]);

                System.out.println();

                if (d[i] != d[i + p]) {
                    ok = false;
                    break;
                }
            }
            if (p >= l/2) return -1;
            if (ok) {
                return p;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        BinaryPeriod binaryPeriod = new BinaryPeriod();
        System.out.println(binaryPeriod.solution(6998));
    }

}
