//QB 699

class Ex1 {
    double r, l, b, ac, ar;

    public static void main(String[] args) {
        Ex1 s1 = new Ex1(5);
        Ex1 s2 = new Ex1(7, 2);

    }

    Ex1(double x) {
        ac = 3.14 * x * x;
        System.out.println("Area of circle is " + ac);
    }

    Ex1(double p, double q) {
        ar = p * q;
        System.out.println("Area of Rectangle is " + ar);
    }
}
