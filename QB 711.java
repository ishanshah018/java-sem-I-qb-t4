//QB 711

import java.util.Scanner;

class Ex1 {
    int rno;
    String name;
    double mark;

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Roll no. ");
        int rno=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Name");
        String name= sc.nextLine();
        System.out.println("Enter marks ");
        double mark = sc.nextInt(); 

        Ex1 ab = new Ex1(rno,name,mark);
        ab.display();
    }

    Ex1(int rno, String name, double mark) {
        this.rno = rno;
        this.name = name;
        this.mark = mark;
    }

    void display() {
        System.out.println("Student Details");
        System.out.println("Roll No.is " + this.rno);
        System.out.println("Name is " + this.name);
        System.out.println("Marks is " + this.mark);
    }

}
