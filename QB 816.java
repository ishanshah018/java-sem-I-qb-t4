//QB 816

class Aclass {
    void display() {
        System.out.println("I am in Aclass ");
    }
}

class Bclass extends Aclass {
    void display() {
        System.out.println("I am in Bclass ");
    }
}

class display {
    public static void main(String[] args) {
        Bclass m = new Bclass();
        m.display();
        Aclass m1 = new Aclass();
        m1.display();
    }
}
