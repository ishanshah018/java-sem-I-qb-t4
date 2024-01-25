//QB 793

class hod1 {
    void displayhod1() {
        System.out.println("HOD  is calling");
    }

}

class faculty1 extends hod1 {
    void displayfac1() {
        System.out.println("Fcaulty 1 is calling");
    }

}

class faculty2 extends hod1 {
    void displayfac2() {
        System.out.println("Faculty 2 is caling ");
    }
}

class student1 extends faculty1 {
    void displaystd1() {
        System.out.println("Student 1 is calling ");
    }

}

class student2 extends faculty2 {
    void displaystd2() {
        System.out.println("Student 2 is calling ");
    }

    public static void main(String[] args) {
        student2 ob1 = new student2();
        ob1.displaystd2();
        ob1.displayfac2();
        student1 ob2 = new student1();
        ob2.displaystd1();
        ob2.displayfac1();
    }
}
