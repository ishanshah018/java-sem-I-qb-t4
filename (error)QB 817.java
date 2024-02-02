//QB 817

import java.util.Scanner;

class book {
    String author_name;

    void display() {
        System.out.println("Author name " + book);
    }
}

class book_publication extends book {
    String title;

    void display() {
        System.out.println("Book name " + book_publication);
    }
}

class paper_publication extends book {
    String title;

    void display() {
        System.out.println("Paper name " + paper_publication);
    }
}

public class data {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Author name: ");
        book b1 = new book();
        b1.author_name = sc.nextLine();
        b1.display();

        System.out.println("Enter Book name: ");
        book_publication b2 = new book_publication();
        b2.title = sc.nextLine();
        System.out.println("Enter Author name: ");
        b2.author_name = sc.nextLine();
        b2.display();

        System.out.println("Enter Paper name: ");
        paper_publication b3 = new paper_publication();
        b3.title = sc.nextLine();
        System.out.println("Enter Author name: ");
        b3.author_name = sc.nextLine();
        b3.display();

    }
}
