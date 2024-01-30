//QB 814

import java.util.Scanner;

class figure {
    double a;
    double b;

    figure() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A");
        a = sc.nextInt();
        System.out.println("Enter B");
        b = sc.nextInt();
    }
}

class rectangle extends figure {
    double area() {
        return a * b;
    }
}

class triangle extends figure {
    double area() {
        return 0.5 * a * b;
    }
}

class main {
    public static void main(String[] args) {
        System.out.println("For Area of Triangle");
        triangle m1 = new triangle();
        double x = m1.area();
        System.out.println(x);
        System.out.println("For Area of Rectangle");
        rectangle m2 = new rectangle();
        double y = m2.area();
        System.out.println(y);
    }
}
