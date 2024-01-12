//Qb 703

import java.util.*;

class Ex1 {
    double r, ac;

    public static void main(String[] args) {
        Ex1 ab = new Ex1();
        ab.display();
    }

    Ex1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius ");
        r = sc.nextDouble();
    }

    void display() {
        ac = 3.14 * r * r;
        System.out.println("Area of Circle is " + ac);
    }
}
