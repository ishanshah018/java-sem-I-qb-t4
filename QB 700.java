//QB 700

import java.util.*;

class point {
    int x, y;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        point p1 = new point();
        System.out.println("Enter x: ");
        int a = sc.nextInt();
        System.out.println("Enter y: ");
        int b = sc.nextInt();

        point p2 = new point(a, b);
      
        p2.add(p1, p2);
        p2.display();

    }

    point() {
        x = 5;
        y = 5;
    }

    point(int a1, int b1) {
        x = a1;
        y = b1;
    }

    void add(point a2, point b2) {
        x = a2.x + b2.x;
        y = a2.y + b2.y;
    }

    void display() {
        System.out.println(x);
        System.out.println(y);
    }
}
