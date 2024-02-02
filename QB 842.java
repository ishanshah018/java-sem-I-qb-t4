//QB 842

class parent {
    void method() {
        System.out.println("This is a parent class ");
    }
}

class child extends parent {
    void method() {
        System.out.println("This is a child class");
        super.method();
    }

    public static void main(String[] args) {
        child c = new child();
        c.method();
    }
}
