//QB 716

import java.util.Scanner;

class Ex1 {
    String s;
    char c;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter mobile number ");
        String s = sc.nextLine();

        Ex1 ab = new Ex1(s);
        ab.check();
    }

    Ex1(String s) {
        this.s = s;
    }

    void check() {
        if (s.length() == 10) {
            if (s.startsWith("9") || s.startsWith("8") || s.startsWith("7")) {
                System.out.println("Your number is starting with 7,8,9");
            } else {
                System.out.println("Your number is not starting with 7,8,9");
            }
        } else {
            System.out.println("Invalid number");
        }
    }
}
