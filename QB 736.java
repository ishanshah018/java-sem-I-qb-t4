//QB 736

import java.util.Scanner;

class Ex1 {
    static int rno;
    static String name;
    static String clg = "LJU";

    public static void main(String[] args) {
        Ex1 s1 = new Ex1();
        Ex1 s2 = new Ex1();
        Ex1 s3 = new Ex1();

        s1.method();
        s2.method();
        s3.method();

        s1.display();
        s2.display();
        s3.display();

    }

    static void method() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Roll No.: ");
        rno = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Name: ");
        name = sc.nextLine();
    }

    static void display() {
        System.out.println("Roll No. is " + rno);
        System.out.println("Name is " + name);
        System.out.println("College name is " + clg);
    }
}
