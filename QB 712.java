//QB 712

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

        System.out.println("Addition is " + ab.add());
        System.out.println("Subraction is " + ab.sub());

    }

    Ex1(int a, int b) {
        this.a = a;
        this.b = b;
    }

    int add() {
        return this.a + this.b;
    }

    int sub() {
        return this.a - this.b;
    }
}
