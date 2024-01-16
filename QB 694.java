//QB 694
import java.util.*;

class complex {
    int real, img;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter real number 1 & 2 : ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        complex c1 = new complex(a, b);

        System.out.println("Enter imaginary number 1 & 2 : ");
        int p = sc.nextInt();
        int q = sc.nextInt();

        complex c2 = new complex(p, q);

        complex c3 = new complex();

        c3.add(c1, c2);
        c3.display();

    }

    complex(int x, int y) {
        real = x;
        img = y;
    }

    complex() {

    }

    void add(complex p1, complex p2) {
        real = p1.real + p2.real;
        img = p1.img + p2.img;
    }

    void display() {
        System.out.println("ans=(" + real + "," + img + ")");

    }
}
