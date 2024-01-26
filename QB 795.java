class shape {
    void print() {
        System.out.println("This is shape");
    }
}

class rectangle extends shape {
    void print() {
        System.out.println("This is rectangular shape");
        super.print();
    }
}

class circle extends shape {
    void print() {
        System.out.println("This is circular shape");
    }
}

class square extends rectangle {
    void print() {
        System.out.println("Square is a rectangle");
    }

    void display() {
        super.print();
    }

    public static void main(String[] args) {
        square ob = new square();
        ob.display();
    }
}
