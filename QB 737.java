//QB 737

import java.util.*;

class Ex1 {
    static int n, cube;

    public static void main(String[] args) {
        Ex1 m = new Ex1();
        calc();
        m.display();
    }

    static void calc() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        n = sc.nextInt();
        cube = n * n * n;
    }

    void display() {
        System.out.println("Cube of " + n + " is " + cube);
    }
}
