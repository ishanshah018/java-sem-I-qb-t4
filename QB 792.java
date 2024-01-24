//  QB 792 
class base {
    void basedisplay() {
        System.out.println("This is a parent class ");
    }

}

class derived1 extends base {
    void derived1display() {
        System.out.println("This is a child class ");
    }

}

class derived2 extends derived1 {
    void derived2display() {
        System.out.println("This is a grandson class");
    }

    public static void main(String[] args) {
        derived2 m1 = new derived2();
        m1.derived2display();
        m1.derived1display();
        m1.basedisplay();
    }
}
