//QB 697
import java.util.*;

class student {
    int roll;
    int sub;
    int sub1, sub2, sub3, sub4, sub5, sub6;
    int SPI;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();

        student[] ab = new student[n]; // Array of object

        for (int i = 0; i < ab.length; i++) {
            ab[i] = new student(); // Constructor object
        }

        for (int i = 0; i < ab.length; i++) {
            ab[i].calc();
            ab[i].display();
        }

    }

    student() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Roll No. ");
         roll = sc.nextInt();

        System.out.println("Enter mark for Subject 1");
         sub1 = sc.nextInt();
        System.out.println("Enter mark for Subject 2");
         sub2 = sc.nextInt();
        System.out.println("Enter mark for Subject 3");
         sub3 = sc.nextInt();
        System.out.println("Enter mark for Subject 4");
         sub4 = sc.nextInt();
        System.out.println("Enter mark for Subject 5");
         sub5 = sc.nextInt();
        System.out.println("Enter mark for Subject 6");
         sub6 = sc.nextInt();
    }

    void calc() {
        SPI = (sub1 * 5 + sub2 * 5 + sub3 * 5 + sub4 * 5 + sub5 * 5 + sub6 * 5) / (30 * 10);
    }

    void display() {
        System.out.println("SPI is: " + SPI);
    }

}
