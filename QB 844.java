//QB 844

class demo {
    void display() {
        System.out.println("Parent class method ");
    }
}

class A extends demo {
    void display() {
        System.out.println("A class method ");
    }
}

class B extends demo {
    void display() {
        super.display();

    }

    public static void main(String[] args) {
        B obj = new B();
        obj.display();
    }
}
