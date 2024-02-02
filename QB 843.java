//QB 843

class A {
    A() {
        System.out.println("Hi");
    }

    A(int x) {
        System.out.println("Java");
    }

}

class B extends A {
    B(int a) {
        super(5);
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        B obj = new B(6);
    }
}
