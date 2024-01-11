//Qb 696

import java.util.*;

class Ex1 {
    int a[] = new int[5];

    public static void main(String[] args) {
        Ex1 ab = new Ex1();
        ab.max();
        ab.min();
    }

    Ex1() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
    }

    void max() {
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println("Maximum number is " + max);
    }

    void min() {
        int min = 10111010;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println("Minimum number is " + min);

    }
}
