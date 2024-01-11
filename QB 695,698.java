//Qb 695

import java.util.*;

class Ex1 {
    String fname;
    String lname;
    int age;

    public static void main(String[] args) {
        Ex1 ab = new Ex1();
        ab.display();
    }

    Ex1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Name: ");
        fname = sc.nextLine();
        System.out.println("Enter Last Name: ");
        lname = sc.nextLine();
        System.out.println("Enter Age");
        age = sc.nextInt();
    }

    void display() {
        System.out.println("Your First Name is " + fname);
        System.out.println("Your Last Name is " + lname);
        System.out.println("Your Age is " + age);
    }
}
