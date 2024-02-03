//QB 715

import java.util.Scanner;

class Ex1 {
    int a, b;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = sc.nextInt();
        System.out.println("Enter b: ");
        int b = sc.nextInt();

        Ex1 ab = new Ex1(a, b);
        ab.swap();
        ab.display();
    }

    Ex1(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void swap() {
        this.a = this.a + this.b;
        this.b = this.a - this.b;
        this.a = this.a - this.b;
    }

    void display() {
        System.out.println("After Swap numbers are ");
        System.out.println("Value of a is " + this.a);
        System.out.println("Value of b is " + this.b);
    }
}
