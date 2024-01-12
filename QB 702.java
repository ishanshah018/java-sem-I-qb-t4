//Qb 702

import java.util.*;

class Ex1 {
    double l, b, ar;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length");
        double r1 = sc.nextDouble();
        System.out.println("Enter breadth ");
        double r2 = sc.nextDouble();
        Ex1 ab = new Ex1(r1, r2);
        ab.display();
    }

    Ex1(double r1, double r2) {
        l = r1;
        b = r2;
    }

    void display() {
        ar = l * b;
        System.out.println("Area of Rectangle is " + ar);
    }
}
