//QB 739

import java.util.Scanner;

class Ex1 {
    static int n;
    static int fact = 1;

    public static void main(String[] args) {
        Ex1 m1 = new Ex1();
        data();
        m1.display();

    }

    static void data() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
    }

    void display() {
        System.out.println("Factorial of " + n + " is " + fact);
    }
}
