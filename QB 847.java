//QB 847

final class animal {
    void displaytiger() {
        System.out.println("This is Animal class");
    }
}

final class tiger extends animal {
    static void display() {
        System.out.println("This is tiger final class ");
    }

    public static void main(String[] args) {
        animal a = new animal();
        a.displaytiger();
        a.display();
    }
}

// animal is a final class so it cant inherited
