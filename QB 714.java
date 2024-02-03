//QB 714

import java.util.Scanner;

class Ex1 {
    String name;
    double marks;
    double total;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of student: ");
        String name = sc.nextLine();
        System.out.println("Enter obtained marks: ");
        double marks = sc.nextDouble();
        System.out.println("Enter Total Marks: ");
        double total = sc.nextDouble();

        Ex1 ab = new Ex1(name, marks, total);

        ab.display();

    }

    Ex1(String name, double marks, double total) {
        this.name = name;
        this.marks = marks;
        this.total = total;
    }

    double perc() {
        return ((this.marks / this.total) * 100);
    }

    void display() {
        System.out.println("Name of student is " + this.name);
        System.out.println("Obtained marks are " + this.marks);
        System.out.println("Total Marks are " + this.total);

        System.out.println("Percentage is " + this.perc());
    }
}
